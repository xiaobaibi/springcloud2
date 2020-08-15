package com.xbb.controller;


import com.alibaba.fastjson.JSONObject;
import com.xbb.entities.CommonResult;
import com.xbb.entities.Payment;
import com.xbb.feign.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(value = "/consumer/payment")
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/create")
    public CommonResult<Payment> create(Payment payment){
        JSONObject requestBody = new JSONObject();
        requestBody.put("serial",payment.getSerial());
        return paymentFeignService.createPayment(requestBody);
    }

    @GetMapping(value = "/findById/{id}")
    public CommonResult<Payment> findById(@PathVariable(value = "id") long id){
        return paymentFeignService.findPaymentById( id);
    }

}
