package com.xbb.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SayHello {

    @GetMapping(value = "/sayhello")
    public String sayHello(String name){
        log.info("hello : " + name);
        return "hello" + name;
    }
}
