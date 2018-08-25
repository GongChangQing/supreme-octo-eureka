package cn.appmanage.controller.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appmanage.entity.User;
import cn.appmanage.service.user.UserService;
import cn.appmanage.utils.Constants;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String loginPage(){
		return "Login";
	}
	
	@RequestMapping("/doLogin")
	public String doLogin(@RequestParam("userCode")String Code,@RequestParam("password")String password,HttpServletRequest req,HttpSession session){
		User user = userService.Login(Code, 1);
		
		if(user != null){
			
			if(user.getDevPassword().equals(password)){
				session.setAttribute(Constants.USER_DEV, user);
				return "redirect:frame";
			}else{
				req.setAttribute("error", "用户名或密码错误!");
				return "Login";
			}
			
		}else{
			req.setAttribute("error", "用户名或密码错误!");
			return "Login";
		}
		
	}
	
	@RequestMapping("/frame")
	public String home(){
		return "jsp/home";
	}
}
