package com.travel.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travel.pojo.Users;
import com.travel.pojo.UsersExample;
import com.travel.pojo.UsersExample.Criteria;
import com.travel.service.IUsersService;

@RestController
@RequestMapping("/UsersControllerProvider")
public class UsersController {
	
	@Autowired
	private IUsersService usersService;
	
	private UsersExample usersExample;
	
	@RequestMapping("/Users")
	public List<Users> getUsers(){
		List<Users> users = usersService.selectByExample(null);
		return users;
	}
	@RequestMapping(value="/getUserByNameAndPass",method=RequestMethod.GET)
	public Users getUserByNameAndPass(@RequestParam("username") String username,@RequestParam("userpass") String userpass) throws UnsupportedEncodingException{
		System.out.println(username+"========="+userpass);
		System.out.println(username);
		usersExample = new UsersExample();
		
		Criteria createCriteria = usersExample.createCriteria();
		
		createCriteria.andUsersNameEqualTo(username);
		
		createCriteria.andUsersPassEqualTo(userpass);
		
		List<Users> users = usersService.selectByExample(usersExample);
		
		Users user = null;
		
		for (Users user1 : users) {
			user = user1;
			System.out.println(user.getUsersName()+"=========="+user.getUsersId());
			break;
		}
		return user;
	}
	
	
	
	

}
