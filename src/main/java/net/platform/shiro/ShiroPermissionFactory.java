/**  
 * @Title: ShiroPermissionFactory.java
 * @Package net.platform.shiro
 * @author linyiting
 * @date 2017年12月1日
 * @Description: TODO
 */
package net.platform.shiro;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.business.system.entity.TsFunction;
import net.business.system.service.FunctionService;

import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Title: ShiroPermissionFactory.java
 * @Package net.platform.shiro
 * @ClassName: ShiroPermissionFactory 
 * @author linyiting
 * @date 2017年12月1日
 * @Description: 代替默认的ShiroFilterFactoryBean，支持从ini文件和数据库加载权限配置
 */
public class ShiroPermissionFactory extends ShiroFilterFactoryBean {
    /**记录配置中的过滤链*/
    public static String definition = "";

	@Autowired
	private FunctionService functionService;
    /**
     * 初始化设置过滤链
     */
    @Override
    public void setFilterChainDefinitions(String definitions) {
//        String token =  manageUserService.getAdminToken(0);

        //可从数据库读取后，添加至过滤链，参考此处已注释的代码
        definition = definitions;//记录配置的静态过滤链
        TsFunction function=new TsFunction();
        function.setAppId("6000");
        List<TsFunction> funcs = functionService.getFunctionList(function);
        Map<String,String> otherChains = new HashMap<>();
        for(TsFunction func: funcs){
        	//url即权限名，可以在Permission字段定义名字，func.getPermission()
/*        	if(!"".equalsIgnoreCase(func.getFuncUrl()))
            otherChains.put(func.getFuncUrl(), "perms["+func.getFuncUrl()+"]");	*/
        	if(!"".equalsIgnoreCase(func.getFuncUrl()))
                otherChains.put(func.getFuncUrl(), "perms["+func.getFuncCode()+"]");	
        }

        //加载配置默认的过滤链XML中的静态链
        Ini ini = new Ini();
        ini.load(definitions);
        Ini.Section section = ini.getSection(IniFilterChainResolverFactory.URLS);
        if (CollectionUtils.isEmpty(section)) {
            section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
        }
        //加上数据库中过滤链
        section.putAll(otherChains);
        section.put("/**", "anon");
        //如果是API时，可以放开，不用登陆，但要有鉴权（API是无session的）
       // section.put("/**", "authc");
        setFilterChainDefinitionMap(section);
    }
}