package net.business.system.service;

import java.util.List;

import com.alibaba.fastjson.JSONArray;

import net.business.system.entity.TsFunction;

 

public interface FunctionService {
	public List<TsFunction> getFunctionList(TsFunction tsFunction);
	public List<TsFunction> getFunctionByUserId(Integer userId);
	public JSONArray treeFuncList(List<TsFunction> tsFunction, String parentCode);
}
