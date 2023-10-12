package com.lv.feign;

import com.lv.feign.hystrix.CustomerRentFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "rent-car-service",fallback = CustomerRentFeignHystrix.class)
public interface CustomerRentFeign {
    @GetMapping("rent")
    String rent();
}
