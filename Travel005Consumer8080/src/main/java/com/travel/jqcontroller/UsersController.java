package com.travel.jqcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.feignScenic.IUsersFeign;
import com.travel.pojo.Users;

@Controller
@RequestMapping("/UsersController")
public class UsersController {
	
	@Autowired
	private IUsersFeign usersFeign;
	
	@RequestMapping(value="/getUserByNameAndPass",method=RequestMethod.POST)
	public String getUserNameAndPass(Model model, @RequestParam("username")String username, @RequestParam("userpass")String userpass){
		
		Users user = usersFeign.getUserByNameAndPass(username, userpass);
		
		System.out.println(username+"---------"+userpass);
		
		if(user == null){
			
			model.addAttribute("error", "用户名或密码错误！");
			
			return "login-registerd";
		}else{
			System.out.println(user.getUsersId());
			
			model.addAttribute("user", user);
			
			return "index";
		}
	}
	
	
}
