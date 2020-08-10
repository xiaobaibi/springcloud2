package com.xbb.order.controller;


import com.xbb.entities.CommonResult;
import com.xbb.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping(value = "/consumer/payment")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    public String url = "http://localhost:8001";

    @GetMapping(value = "/create")
    public CommonResult<Payment> create(Payment payment){

        return restTemplate.postForObject(url.concat("/createPayment"),payment,CommonResult.class);
    }

    @GetMapping(value = "/findById/{id}")
    public CommonResult<Payment> findById(@PathVariable long id){
        return restTemplate.getForObject(url + "/findPaymentById/?id="+id,CommonResult.class);
    }


}
