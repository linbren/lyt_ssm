/**  
 * @Title: UserRealm.java
 * @Package net.platform.shiro
 * @author linyiting
 * @date 2017年11月29日
 * @Description: TODO
 */
package net.platform.shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.business.system.entity.TsFunction;
import net.business.system.entity.TsRole;
import net.business.system.entity.TsUser;
import net.business.system.service.UserService;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Title: UserRealm.java
 * @Package net.platform.shiro
 * @ClassName: UserRealm 
 * @author linyiting
 * @date 2017年11月29日
 * @Description: shiro realm
 */
public class UserRealm extends AuthorizingRealm {
    // 用户对应的角色信息与权限信息都保存在数据库中，通过UserService获取数据
	@Autowired
    private UserService userService ;

    /**
     * 提供用户信息返回权限信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 根据用户名查询当前用户拥有的角色
        List<TsRole> roles = userService.getRoles(username);
        Set<String> roleNames = new HashSet<String>();
        for (TsRole role : roles) {
            roleNames.add(role.getRoleName());
        }
        // 将角色名称提供给info
        authorizationInfo.setRoles(roleNames);
        // 根据用户名查询当前用户权限
        List<TsFunction> functions = userService.getFunctionsByUserName(username);
        Set<String> permissionNames = new HashSet<String>();
        for (TsFunction func : functions) {
            //permissionNames.add(func.getFuncUrl());
        	permissionNames.add(func.getFuncCode());
        }
        // 将权限名称提供给info
        authorizationInfo.setStringPermissions(permissionNames);

        return authorizationInfo;
    }

    /**
     * 提供账户信息返回认证信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    	UsernamePasswordToken upToken = (UsernamePasswordToken)token;
        String username = upToken.getUsername();
        
     //   String userpass = String.valueOf(upToken.getPassword());
//        TsUser user = tsUserDao.getUserByName(username);
        TsUser user = userService.getUserByName(username);
        
        if (user == null) {
            // 用户名不存在抛出异常
            throw new UnknownAccountException();
        }
        if  (!"1".equals(user.getStatus())) {
            // 用户被管理员锁定抛出异常
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUserName(),
                user.getUserPass().toCharArray(), getName());
        return authenticationInfo;
    }
}