package net.business.system.service.impl;

import java.util.List;

import net.business.system.dao.TsUserDao;
import net.business.system.entity.TsFunction;
import net.business.system.entity.TsRole;
import net.business.system.entity.TsUser;
import net.business.system.service.UserService;
import net.platform.cache.RedisCache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl implements UserService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private TsUserDao tsUserDao;
	@Autowired
	private RedisCache cache;

	public String Hello(String someBody) {
		String cache_key = RedisCache.CAHCENAME + "|Hello|" + someBody;
		String result_cache = cache.getCache(cache_key, String.class);
		if (result_cache == null) {
			// 缓存中没有再去数据库取，并插入缓存（缓存时间为60秒）
			result_cache = "hello " + someBody;
			cache.putCacheWithExpireTime(cache_key, result_cache,
					RedisCache.CAHCETIME);
			LOG.info("put cache with key:" + cache_key);
		} else {
			LOG.info("get cache with key:" + cache_key);
		}
		return result_cache;
	}

	@Override
	public List<TsUser> getUserList(Integer pageNum, Integer pageSize) {
		String cache_key = RedisCache.CAHCENAME +this.getClass().getName()+"|"
		          + Thread.currentThread().getStackTrace()[1].getMethodName()
		          + "|pn|" + pageNum + "|ps|" + pageSize;

		// 先去缓存中取
		List<TsUser> result_cache = cache.getListCache(cache_key, TsUser.class);
		if (result_cache == null) {
			// 缓存中没有再去数据库取
			PageHelper.startPage(pageNum, pageSize);
			result_cache = tsUserDao.selectAll();
			cache.putListCacheWithExpireTime(cache_key, result_cache,
					RedisCache.CAHCETIME);
			LOG.info("put cache with key:" + cache_key+" total:"+((Page<TsUser>) result_cache).getTotal());
		} else {
			LOG.info("get cache with key:" + cache_key);
		}
		
		return result_cache;
	}
	@Override
	public PageInfo<TsUser> getList(Integer pageNum, Integer pageSize) {
		String cache_key = RedisCache.CAHCENAME +this.getClass().getName()+"|"
	          + Thread.currentThread().getStackTrace()[1].getMethodName()
	          + "|pn|" + pageNum + "|ps|" + pageSize;
		// 先去缓存中取
		PageInfo<TsUser> result_cache = cache.getCache(cache_key, PageInfo.class);
		if (result_cache == null) {
			// 缓存中没有再去数据库取
			PageHelper.startPage(pageNum, pageSize);
			List<TsUser> list = tsUserDao.selectAll();
			result_cache = new PageInfo<TsUser>(list);
			cache.putCacheWithExpireTime(cache_key, result_cache, RedisCache.CAHCETIME);
			LOG.info("put cache with key:" + cache_key+" total:"+ result_cache.getTotal());
		} else {
			LOG.info("get cache with key:" + cache_key+" total:"+ result_cache.getTotal());
		}		
		return result_cache ;
	}

	@Override
	public TsUser getUserById(Integer id) {	
		return tsUserDao.selectByPrimaryKey(id);
	}
	@Override
	public TsUser getUserByName( String userName,String password) {	
		TsUser u=new TsUser();
		u.setUserName(userName);
		u.setUserPass(password);
		return tsUserDao.selectOne(u);
	}		
	public TsUser getUserByName( String userName){
//		TsUser u=new TsUser();
//		u.setUserCode("ssm_admin");
//		u.setUserName("管理员");
//		u.setUserPass("21218CCA77804D2BA1922C33E0151105");
//		u.setStatus("1");
//		u=tsUserDao.getUserByName(userName);
		return tsUserDao.getUserByName(userName);	
	}
	public List<TsRole> getRoles(String userName){
		return tsUserDao.getRoles(userName);
	}
	public List<TsFunction> getFunctionsByUserName(String userName){
		return tsUserDao.getFunctionsByUserName(userName);
	}
}

