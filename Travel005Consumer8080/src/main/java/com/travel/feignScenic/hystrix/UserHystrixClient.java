package com.travel.feignScenic.hystrix;

import org.springframework.stereotype.Component;

import com.jd.pojo.TbUser;
import com.travel.feignScenic.UserFeignClient;

@Component
public class UserHystrixClient implements UserFeignClient{

	/*public TbUser findUserByName(String username) {
		TbUser user = new TbUser();
		
		user.setUsername("Hystrix");
		
		user.setPassword("Hystrixpassword");
		
		return user;
	}

	public TbUser findUserById(long id) {
		TbUser user = new TbUser();
		user.setUsername("Hystrix");
		return user;
	}

	@Override
	public TbUser getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object test(TbUser currentUser) {
		return null;
	}*/

	@Override
	public String hello(String name) {
		return "hello error";
	}

	@Override
	public TbUser hello(String name, Integer age) {
		TbUser tbUser = new TbUser();
		
		tbUser.setUsername("Hystrix");
		return tbUser;
	}

	@Override
	public String hello(TbUser user) {
		return "hello error";
	}

} 
