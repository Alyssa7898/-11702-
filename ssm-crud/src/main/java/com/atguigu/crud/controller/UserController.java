package com.atguigu.crud.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.crud.bean.User;
import com.atguigu.crud.service.UserService;

/**
 * 登陆相关
 * @author Administrator
 *
 */
@Controller
public class UserController {
	
	@Autowired
	UserService userService;
//	@ResponseBody
	@RequestMapping("/login")
	public String login(User user,@RequestParam("username")String username,@RequestParam("password")String password,Model model,HttpServletRequest request,
			HttpServletResponse resp,HttpSession session) throws IOException {
            User user1=userService.findUser(username, password);
            request.getSession().setAttribute("username", username);
           // session.setAttribute("username", username);
            System.out.println("传邮箱值："+username);
            if(user1!=null) {
            	return "first";
            }
			return null;
		
	}
//	@RequestMapping("/toempInfo")
//	public String toempInfo() {
//		
//		return "empInfo";
//		
//	}
}
