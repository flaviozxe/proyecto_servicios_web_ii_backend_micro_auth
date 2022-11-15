package com.micro.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringMicroAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroAuthApplication.class, args);
	}

}
