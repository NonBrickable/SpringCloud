package com.lv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Provider1Controller {
    @GetMapping("hello")
    public String hello(){
        return "我是提供者111的接口";
    }
}
