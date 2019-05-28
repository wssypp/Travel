package com.travel.feignScenic.hystrix;

import org.springframework.stereotype.Component;

import com.jd.pojo.TbUser;
import com.travel.feignScenic.IUsersFeign;
import com.travel.pojo.Users;

@Component
public class UsersHystrix implements IUsersFeign {

	@Override
	public Users getUserByNameAndPass(String username, String password) {
		Users user = new Users();
		
		user.setUsersName("user error");
		
		return user;
	}

}
