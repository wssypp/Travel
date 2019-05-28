package com.travel.jqcontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jd.pojo.TbUser;
import com.travel.feignScenic.UserFeignClient;

@Controller
public class UserController {
	
	private final String REST_URL="http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemp;
	@Autowired
	private UserFeignClient userFeignClient;
	
	@RequestMapping("/hello1")
	public String hello1(@RequestParam("name") String name,Model model){
		String hello = userFeignClient.hello(name);
		model.addAttribute("hello", hello);
		System.out.println(hello);
		return "index";
	}
	@RequestMapping("/hello3")
	public String hell3(TbUser user){
		String hello = userFeignClient.hello(user);
		System.out.println(user.getUsername()+"========="+user.getPassword());
		return hello;
	}
	@RequestMapping("/consumer2")
    public String helloConsumer2(){
        String r1 = userFeignClient.hello("hjc");
        String r2 = userFeignClient.hello("hjc", 23).toString();
        String r3 = userFeignClient.hello(new TbUser());
        return r1 + "-----" + r2 + "----" + r3;
    }
	
	
	
	
	
	/*@GetMapping("/user1")
	public TbUser findUserByName(@RequestParam(value="username",required=false)String username) {
		TbUser user = userFeignClient.findUserByName(username);
		
		return user;
	}
	@GetMapping("/getUser")
	public TbUser getUser(@RequestParam("id")long id){
		TbUser user = userFeignClient.getUser(id);
		return user;
	}
	
	
	@GetMapping("/user")
	public TbUser findUserById(@RequestParam("id") long id){
		return userFeignClient.findUserById(id);
	}
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/Users")
	public List<TbUser> getUsers(){
		return restTemp.getForObject(REST_URL+"/Users", List.class);
	}
	
	@GetMapping("/UserById/{id}")
	public TbUser getUserById(@PathVariable("id") long id){
		return restTemp.getForObject(REST_URL+"/UserById/"+id, TbUser.class);
	}
	
	@GetMapping("/addUser")
	public boolean addUser(@RequestBody TbUser user){
		return restTemp.getForObject(REST_URL+"/addUser/"+user, boolean.class);
	}
	// 测试@EnableDiscoveryClient,消费端可以调用服务发现
	@RequestMapping(value = "/consumer/discovery")
	public Object discovery(){
		return restTemp.getForObject(REST_URL + "/discovery", Object.class);
	}*/
}
