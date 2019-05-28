package com.travel.feignScenic;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.travel.feignScenic.hystrix.UsersHystrix;
import com.travel.pojo.Users;

@FeignClient(name="Travel002Provider8001provider",fallback = UsersHystrix.class)
public interface IUsersFeign {
	
	@RequestMapping(value = "/UsersControllerProvider/getUserByNameAndPass", method=RequestMethod.GET)
    Users getUserByNameAndPass(@RequestParam("username") String username, @RequestParam("userpass") String userpass);

	
}
