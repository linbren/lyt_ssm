package net.business.system.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.business.system.entity.TsUser;
import net.business.system.service.FunctionService;
import net.business.system.service.UserService;
import net.platform.utils.EncryptUtils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @Title: LoginController.java
 * @Package net.business.system.web
 * @ClassName: LoginController
 * @author linyiting
 * @date 2017年11月22日
 * @Description: TODO
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private FunctionService funcService;

	/**
	 * 进入登录页面
	 */
	@RequestMapping(value = { "/login" })
	public ModelAndView getLogin(ModelAndView modelAndView) {
		modelAndView.setViewName("/system/login");
		return modelAndView;
	}
	@RequestMapping(value = { "/" })
	public void root(HttpServletRequest request, HttpServletResponse response) {
		try {
			//request.getRequestDispatcher("/login").forward(request, response);
			response.sendRedirect("/login");
		} catch (Exception e) {	
			e.printStackTrace();
		} 
	}
	@RequestMapping(value = { "/index" })
	public ModelAndView postLogin(
			@RequestParam(required = false) String userName,
			@RequestParam(required = false) String password,
			ModelAndView modelAndView) throws Exception {
//		//抛出异常。当/请求时，由root方法处理。  
		if(userName==null || password==null)
			return new ModelAndView("redirect:/login");
		UsernamePasswordToken token = new UsernamePasswordToken(userName,
				password);
		Subject subject = SecurityUtils.getSubject();
		modelAndView.setViewName("error");
		try {
			subject.login(token);
		} catch (IncorrectCredentialsException ice) {
			// 捕获密码错误异常
			modelAndView.addObject("message", "password error!");
			return modelAndView;
		} catch (UnknownAccountException uae) {
			// 捕获未知用户名异常
			modelAndView.addObject("message", "username error!");
			return modelAndView;
		} catch (ExcessiveAttemptsException eae) {
			// 捕获错误登录过多的异常
			modelAndView.addObject("message", "times error");
			return modelAndView;
		} catch (Exception e) {
			// 其他
			modelAndView.addObject("message",
					"subject.login error: " + e.getMessage());
			return modelAndView;
		}
		TsUser u = new TsUser();
		u = userService.getUserByName(userName,
				EncryptUtils.encryptToMD5(password));
		// modelAndView.addObject("user",u);
		// session.setAttribute("user",u);
		subject.getSession().setAttribute("user", u);
		subject.getSession().setAttribute(
				"funcs",
				funcService.treeFuncList(
						funcService.getFunctionByUserId(u.getId()), ""));

		// 传入HttpSession session
		// try {
		// TsUser u=new TsUser();
		// u=userService.getUserByName(userName,EncryptUtils.encryptToMD5(password)
		// );
		// modelAndView.addObject("user",userService.getUserById(32));
		// session.setAttribute("user",u);
		// session.setAttribute("funcs",funcService.treeFuncList(funcService.getFunctionByUserId(u.getId()),""));
		//
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		modelAndView.setViewName("/system/admin/index");
		return modelAndView;
	}

	@RequestMapping(value = "/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		SecurityUtils.getSubject().logout();
		try {
			//request.getRequestDispatcher("/login").forward(request, response);
			response.sendRedirect("/login");
		} catch (IOException e) {			 
			e.printStackTrace();
		} 
	}

	@RequestMapping(value = "/unauthorized")
	public String unauthorized() {
		SecurityUtils.getSubject().logout();
		return "unauthorized";
	}
//
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//	public String index() {
//		return "/system/admin/index";
//	}
}
