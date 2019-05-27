package com.travel.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jd.pojo.TbUser;
import com.travel.feignclient.hystrixclient.UserHystrixClient;


@FeignClient(name="Travel002Provider8001provider",fallback = UserHystrixClient.class)
public interface UserFeignClient {

	/* @RequestMapping(value="/user1", method=RequestMethod.GET)
	 public TbUser findUserByName(@RequestParam("username") String username);
	 
	 @RequestMapping(value="/user", method=RequestMethod.GET)
	 public TbUser findUserById(@RequestParam("id") long id);
	 
	 @RequestMapping(value="/getUser", method=RequestMethod.GET)
	 public TbUser getUser(@RequestParam("id") long id);
	 
	 @RequestMapping(value = "/test/test", method = RequestMethod.POST, consumes = "application/json")
	 Object test(TbUser currentUser);*/
	 
	 @RequestMapping(value = "/hellol", method= RequestMethod.GET)
	    String hello(@RequestParam("name") String name) ;

     @RequestMapping(value = "/hello2", method= RequestMethod.GET)
     TbUser hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

     @RequestMapping(value = "/hello3", method= RequestMethod.POST)
     String hello(@RequestBody TbUser user);
	 

	 
}
