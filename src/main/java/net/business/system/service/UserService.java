package net.business.system.service;

import java.util.List;

import net.business.system.entity.TsFunction;
import net.business.system.entity.TsRole;
import net.business.system.entity.TsUser;

import com.github.pagehelper.PageInfo;

 

public interface UserService {
    String Hello(String someBody);
	List<TsUser> getUserList(Integer pageNum, Integer pageSize);
	PageInfo getList(Integer pageNum, Integer pageSize);
	TsUser getUserById(Integer id);
	public TsUser getUserByName( String userName,String password);
	public TsUser getUserByName( String userName);
	public List<TsRole> getRoles(String userName);
	public List<TsFunction> getFunctionsByUserName(String userName);
}
