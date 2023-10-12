package com.lv.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@FeignClient(value = "order-service")
public interface UserOrderFeign {
    @GetMapping("doOrder")
    String doOrder();
}