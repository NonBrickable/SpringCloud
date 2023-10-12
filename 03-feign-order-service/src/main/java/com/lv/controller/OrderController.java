package com.lv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("doOrder")
    public String doOrder(){
        return "炒米饭";
    }
}
