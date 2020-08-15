package com.xbb.feign;

import com.alibaba.fastjson.JSONObject;
import com.xbb.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(value = "PAYMENT-SERVICE")
public interface PaymentFeignService {

    @PostMapping(value = "/createPayment")
    public CommonResult createPayment(@RequestBody JSONObject requestBody);

    @GetMapping(value = "/findPaymentById")
    public CommonResult findPaymentById(@RequestParam("id")long id);
}
