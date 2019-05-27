package com.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Travel005Consumer8080Application {
	
	public static void main(String[] args){
		
		SpringApplication.run(Travel005Consumer8080Application.class, args);
		
	}
	
}
