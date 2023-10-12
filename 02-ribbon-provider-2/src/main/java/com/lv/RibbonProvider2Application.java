package com.lv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RibbonProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(RibbonProvider2Application.class, args);
    }

}
