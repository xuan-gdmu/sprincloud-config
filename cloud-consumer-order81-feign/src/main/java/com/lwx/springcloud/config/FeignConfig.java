package com.lwx.springcloud.config;

/**
 * @author lwxstart
 * @create 2021-01-12 14:17
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
