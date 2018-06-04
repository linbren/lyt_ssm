package net.business.system.dao;

import java.util.List;

import net.business.system.entity.TsFunction;
import tk.mybatis.mapper.common.Mapper;

public interface TsFunctionDao extends Mapper<TsFunction> {
	public List<TsFunction> getFunctionList(Integer userId);
	public List<TsFunction> getFunctionByUserId(Integer userId);
}