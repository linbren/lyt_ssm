
package net.business.system.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
@RequiresRoles("SSM超级机构管理员")
@RequestMapping("/user")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/helloftl", method = RequestMethod.GET)
	public String helloftl(Model model, Integer offset, Integer limit) {
		LOG.info("invoke value----------/user/helloftl");
		model.addAttribute("hello", userService.Hello("ethan"));
		model.addAttribute("pages", userService.getList(1, 5));
		model.addAttribute("users", userService.getUserList(1, 5));
		return "hello";
	}
	
	/**
	 * @method hello   
	 * @param model
	 * @param offset
	 * @param limit
	 * @return String
	 * @throws   
	 * @author linyiting
	 * @date 2017年11月7日
	 * @Description: TODO
	 */
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi(Model model, Integer offset, Integer limit) {
		LOG.info("invoke value----------/user/hi");
		model.addAttribute("hi", userService.Hello("ethan"));
		return "hi";
	}
	@RequestMapping(value = "/hia", method = RequestMethod.GET)
	public String hia(Model model, Integer offset, Integer limit) {
		LOG.info("invoke value----------/user/hia");
		model.addAttribute("hi", userService.Hello("ethan"));
		return "hi";
	}	
	/**
	 * @method getHello   
	 * @param @param request
	 * @param @param response   
	 * @return void   
	 * @throws   
	 * @author linyiting
	 * @date 2017年11月7日
	 * @Description: TODO
	 */
	@RequestMapping(params = "hello")
	public void getHello(HttpServletRequest request,HttpServletResponse response){
		LOG.info("invoke params----------/user/hello");
			ServletUtils.outPrintObjectToJson(response, new BaseResult(1,"I am hello from params."));
	}	
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
		LOG.info("invoke----------/user/list");
		List<TsUser> list = userService.getUserList(pageNum, pageSize);
		//model.addAttribute("userlist", list);
		ServletUtils.outPrintObjectToJson(response, list);		
		//return "userlist";
	}
	
	/**
	 * @method plist   
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
	@RequestMapping(value = "/plist", method = RequestMethod.GET)
	public void plist(HttpServletRequest request,HttpServletResponse response, Integer pageNum, Integer pageSize) {
		LOG.info("invoke----------/user/plist");
		PageInfo<TsUser> list = userService.getList(pageNum, pageSize);
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
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public void getUserById(HttpServletRequest request,HttpServletResponse response, Integer id) {
		LOG.info("invoke----------/user/getUserById");
		TsUser tsUser = userService.getUserById(id);
		ServletUtils.outPrintObjectToJson(response, tsUser);
	}		
}
