package com.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jd.pojo.TbUser;
import com.jd.pojo.TbUserExample;
import com.jd.pojo.TbUserExample.Criteria;
import com.travel.service.IUserService;


@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	private TbUserExample tbUserExample;
	
	
	 //新增的方法
    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    public TbUser hello(@RequestHeader String name, @RequestHeader Integer age) {
        TbUser user = new TbUser();
        user.setUsername(name);
        user.setEmail(age.toString());
        System.out.println(name);
        System.out.println(age);
    	return user;
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello (@RequestBody TbUser user) {
    	System.out.println(user.getUsername()+"--------------"+user.getPassword());
        return "Hello "+ user.getUsername() + ", " + user.getPassword();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/getUser")
	public TbUser getUser(@RequestParam("id")long id){
		TbUser user = userService.selectByPrimaryKey(id);
		System.out.println(id);
		return user; 
	}
	@GetMapping("/Users")
	public List<TbUser> getUsers(){
		return userService.selectByExample(null);
	}
	
	@GetMapping("/UserById/{id}")
	public TbUser getUsersById(@PathVariable("id") long id){
		return userService.selectByPrimaryKey(id);
	}
	
	@PostMapping("/UserAdd")
	public boolean addUser(@DateTimeFormat(pattern = "yyyy-MM-dd") TbUser user){
		return userService.insertSelective(user);
	}
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value = "/discovery", method = RequestMethod.GET)
	public Object discovery()
	{
		List<String> list = client.getServices();
		System.out.println("=============" + list);

		List<ServiceInstance> srvList = client.getInstances("SPRINGCLOUDDEMOAPI");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.client;
	}
	
	
	 @GetMapping("/user1")
	 public TbUser findUserByName1(@RequestParam("username") String username){
		 tbUserExample = new TbUserExample();
		 
		 Criteria createCriteria = tbUserExample.createCriteria();
		 
		 createCriteria.andUsernameEqualTo(username);
		 
		 List<TbUser> users = userService.selectByExample(tbUserExample);
		 
		 TbUser user = null;
		 for (TbUser tbUser : users) {
			user = tbUser;
			break;
		}
		 return user;
	 }
	 @GetMapping("/user")
	 public TbUser findUserById(@RequestParam("id") long id){
		 TbUser user = userService.selectByPrimaryKey(id);
		 return user;
	 }
	
}
