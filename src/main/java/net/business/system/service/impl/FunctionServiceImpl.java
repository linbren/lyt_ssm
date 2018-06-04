package net.business.system.service.impl;

import java.util.List;

import net.business.system.dao.TsFunctionDao;
import net.business.system.entity.TsFunction;
import net.business.system.service.FunctionService;
import net.platform.cache.RedisCache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Service
public class FunctionServiceImpl implements FunctionService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private TsFunctionDao tsFunctionDao;
	@Autowired
	private RedisCache cache;

	@Override
	public List<TsFunction> getFunctionList(TsFunction tsFunction) {
		List<TsFunction> list = tsFunctionDao.select(tsFunction);
		return list;
	}
	public List<TsFunction> getFunctionByUserId(Integer userId) {
		List<TsFunction> list = tsFunctionDao.getFunctionByUserId(userId);
		return list;		
	}
	   // 菜单树形结构
    public JSONArray treeFuncList(List<TsFunction> tsFunction, String parentCode) {
        JSONArray childFunc = new JSONArray();
        for (TsFunction func : tsFunction) {
        	//System.out.println(func.getFuncName()+"  "+func.getParentCode());
            if (parentCode.equals(func.getParentCode())) {
            	//System.out.println(JSONObject.toJSON(func));
                JSONObject jo = (JSONObject) JSONObject.toJSON(func);
                JSONArray c_node = treeFuncList(tsFunction, func.getFuncCode());
                jo.put("child", c_node);
                childFunc.add(jo);
            }
        }
        return childFunc;
    }
}

