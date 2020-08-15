package com.xbb.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfiguration {

    /**
     * openFeign日志
     * FULL : 全部日志
     * BASIC :
     * HEADERS :
     * NONE :
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
