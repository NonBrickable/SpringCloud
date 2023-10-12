package com.lv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RibbonProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(RibbonProvider1Application.class, args);
	}

}
