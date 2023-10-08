package com.lv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientB1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientB1Application.class, args);
    }

}
