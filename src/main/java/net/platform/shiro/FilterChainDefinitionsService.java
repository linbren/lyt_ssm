/**  
 * @Title: FilterChainDefinitionsService.java
 * @Package net.platform.shiro
 * @author linyiting
 * @date 2017年12月1日
 * @Description: TODO
 */
package net.platform.shiro;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @Title: FilterChainDefinitionsService.java
 * @Package net.platform.shiro
 * @ClassName: FilterChainDefinitionsService 
 * @author linyiting
 * @date 2017年12月1日
 * @Description: 加载权限到内存； 修改角色权限时，只需要注入此bean，调用reloadFilterChains()方法即可完成权限的动态更新！
 */
@Controller
public class FilterChainDefinitionsService {
    @Autowired
    private ShiroPermissionFactory permissFactory;


    public void reloadFilterChains() {
        synchronized (permissFactory) {   //强制同步，控制线程安全
            AbstractShiroFilter shiroFilter = null;

            try {
                shiroFilter = (AbstractShiroFilter) permissFactory.getObject();

                PathMatchingFilterChainResolver resolver = (PathMatchingFilterChainResolver) shiroFilter
                        .getFilterChainResolver();
                // 过滤管理器
                DefaultFilterChainManager manager = (DefaultFilterChainManager) resolver.getFilterChainManager();
                // 清除权限配置
                manager.getFilterChains().clear();
                permissFactory.getFilterChainDefinitionMap().clear();
                // 重新设置权限
                permissFactory.setFilterChainDefinitions(ShiroPermissionFactory.definition);//传入配置中的filterchains

                Map<String, String> chains = permissFactory.getFilterChainDefinitionMap();
                //重新生成过滤链
                if (!CollectionUtils.isEmpty(chains)) {
                    chains.forEach((url, definitionChains) -> {
                        manager.createChain(url, definitionChains.trim().replace(" ", ""));
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}