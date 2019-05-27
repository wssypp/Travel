package com.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Travel006EruekaServer7001Application {
	public static void main(String[] args){
		SpringApplication.run(Travel006EruekaServer7001Application.class, args);
	}
}
