package com.lv.controller;

import com.lv.feign.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserOrderFeign userOrderFeign;
    @GetMapping("order")
    public String order(){
        System.out.println("有用户进来了");
        //发起远程调用
        String result = userOrderFeign.doOrder();
        return result;
    }
}
