package net.business.system.dao;

import java.util.List;

import net.business.system.entity.TsFunction;
import net.business.system.entity.TsRole;
import net.business.system.entity.TsUser;
import tk.mybatis.mapper.common.Mapper;

public interface TsUserDao extends Mapper<TsUser> {
	public TsUser getUserByName(String userName);
	public List<TsRole> getRoles(String userName);
	public List<TsFunction> getFunctionsByUserName(String userName);
}