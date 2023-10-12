package com.lv.feign.hystrix;

import com.lv.feign.CustomerRentFeign;
import org.springframework.stereotype.Component;

@Component
public class CustomerRentFeignHystrix implements CustomerRentFeign {
    @Override
    public String rent() {
        return "我是熔断器返回的结果";
    }
}
