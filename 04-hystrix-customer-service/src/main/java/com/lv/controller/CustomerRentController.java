package com.lv.controller;

import com.lv.feign.CustomerRentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRentController {
    @Autowired
    @Qualifier("com.lv.feign.CustomerRentFeign")
    private CustomerRentFeign customerRentFeign;
    @GetMapping("rentCar")
    public String rentCar(){
        String result = customerRentFeign.rent();
        return result;
    }
}
