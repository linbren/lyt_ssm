
package net.business.system.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.business.system.dao.TsRoleDao;
import net.business.system.entity.TsRole;
import net.business.system.entity.TsUser;
import net.business.system.service.UserService;
import net.platform.resp.BaseResult;
import net.platform.utils.ServletUtils;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageInfo;

/**
 * @Title: UserController.java
 * @Package net.business.system.web
 * @ClassName: UserController 
 * @author linyiting
 * @date 2017年11月7日
 * @Description: 用户管理
 */
@Controller
@RequestMapping("/role")
public class RoleController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    
	@Autowired
	private TsRoleDao roleDao;
	/**
	 * @method list   
	 * @param @param request
	 * @param @param response
	 * @param @param pageNum
	 * @param @param pageSize   
	 * @return void   
	 * @throws   
	 * @author linyiting
	 * @date 2017年11月7日
	 * @Description: TODO
	 */
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(HttpServletRequest request,HttpServletResponse response, Integer pageNum, Integer pageSize) {
		LOG.info("invoke----------/role/list");
		List<TsRole> list = roleDao.selectAll();
		ServletUtils.outPrintObjectToJson(response, list);		
	}

	/**
	 * @method getUserById   
	 * @param @param request
	 * @param @param response
	 * @param @param id   
	 * @return void   
	 * @throws   
	 * @author linyiting
	 * @date 2017年11月7日
	 * @Description: TODO
	 */
	@RequestMapping(value = "/getRole", method = RequestMethod.GET)
	public void getRoleById(HttpServletRequest request,HttpServletResponse response, Integer id) {
		LOG.info("invoke----------/user/getRoleById");
		TsRole tsRole = roleDao.selectByPrimaryKey(29);
		ServletUtils.outPrintObjectToJson(response, tsRole);
	}		
}
