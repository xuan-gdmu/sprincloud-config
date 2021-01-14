package com.lwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lwxstart
 * @create 2021-01-12 10:11
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain81.class,args);
    }
}
