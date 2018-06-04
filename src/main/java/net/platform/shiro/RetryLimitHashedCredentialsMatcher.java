/**  
 * @Title: RetryLimitHashedCredentialsMatcher.java
 * @Package net.platform.shiro
 * @author linyiting
 * @date 2017年11月29日
 * @Description: TODO
 */
package net.platform.shiro;

import java.util.concurrent.atomic.AtomicInteger;

import net.platform.cache.RedisCache;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Title: RetryLimitHashedCredentialsMatcher.java
 * @Package net.platform.shiro
 * @ClassName: RetryLimitHashedCredentialsMatcher 
 * @author linyiting
 * @date 2017年11月29日
 * @Description: 密码重试次数
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher {
    // 声明一个缓存接口，这个接口是Shiro缓存管理的一部分，它的具体实现可以通过外部容器注入
    private Cache<String, AtomicInteger> passwordRetryCache;
    @Autowired
    private RedisCache redisCache;
    public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }
    public RetryLimitHashedCredentialsMatcher() {
       
    }
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String username = (String) token.getPrincipal();
        //AtomicInteger retryCount = passwordRetryCache.get(username);
        AtomicInteger retryCount = redisCache.getCache("loginTry"+username, AtomicInteger.class);
        if (retryCount == null) {
            retryCount = new AtomicInteger(0);
            //passwordRetryCache.put(username, retryCount);
            redisCache.putCache("loginTry"+username, retryCount);
        }
        // 自定义一个验证过程：当用户连续输入密码错误5次以上禁止用户登录一段时间
        if (retryCount.incrementAndGet() > 5) {
            throw new ExcessiveAttemptsException();
        }
        boolean match = super.doCredentialsMatch(token, info);
        if (match) {
            //passwordRetryCache.remove(username);
        	redisCache.deleteCache("loginTry"+username);
        }
        return match;
    }
}