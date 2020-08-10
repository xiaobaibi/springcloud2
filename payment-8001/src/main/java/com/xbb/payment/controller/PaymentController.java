package com.xbb.payment.controller;

import com.alibaba.fastjson.JSONObject;
import com.xbb.payment.entities.CommonResult;
import com.xbb.payment.entities.Payment;
import com.xbb.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/createPayment")
    public CommonResult createPayment(@RequestBody JSONObject requestBody){
        String serial = requestBody.getString("serial");
        Payment payment = new Payment();
        payment.setSerial(serial);
        boolean b = paymentService.create(payment);
        if (b){
            return new CommonResult(200,"插入成功",b);
        }else{
            return new CommonResult(401,"插入失败",b);
        }
    }

    @GetMapping(value = "/findPaymentById")
    public CommonResult findPaymentById(long id){
        Payment byId = paymentService.findById(id);
        CommonResult commonResult = new CommonResult();
        if (!ObjectUtils.isEmpty(byId)){
            return new CommonResult(200,"查询成功",byId);
        }else{
            return new CommonResult(401,"查询失败",byId);
        }
    }

}
