package com.yx.SSM.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yx.SSM.Service.Easy_userService;
import com.yx.SSM.Validation.UserLogin;
import com.yx.SSM.entity.Easybuy_user;
@Controller
public class UserController {
	
	@Autowired
	private Easy_userService service;
	
	@RequestMapping("/initmain")
	public String initaddress(){
		return "WEB-INF/pages/manage/main";
	}

	
	@RequestMapping("/login")
	public String login(@Validated(value={UserLogin.class}) Easybuy_user userlogin,BindingResult r,HttpSession session,Model m) throws Exception {
		Easybuy_user user=service.UserLogin(userlogin.getLoginName(), userlogin.getPassword());
		if(user!=null){
			session.setAttribute("userid",userlogin.getUserName());
			return "Redirect/initmain";
		}else{
			m.addAttribute("msg","登录失败！");
			return "Login";
		}
	}
	
	@RequestMapping("/checkLoginName")
	//@ResponseBody是告诉spring框架这是要响应出去的值 而不是一个jsp页面路径
	public @ResponseBody String checkLoginName(@RequestParam("zh")String zh) throws Exception{
		int result=service.getcount(zh);
		String rs="{\"msg\":0}";
		if(result>0){
			rs="{\"msg\":1}";
		}
		return rs;
	}
	
	@RequestMapping("/reg")
	public String tianjiauser(@Validated Easybuy_user user,Model m) throws Exception{
		user.setSex(0);
		user.setType(0);
		boolean isok=service.insertuser(user);
		if(isok){
			m.addAttribute("msg","注册成功!");
		}else{
			m.addAttribute("msg","注册失败!");
		}
		return "request";
		
	}
}
	