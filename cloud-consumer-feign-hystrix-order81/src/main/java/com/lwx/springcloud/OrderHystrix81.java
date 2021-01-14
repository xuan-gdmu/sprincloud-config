package com.lwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lwxstart
 * @create 2021-01-12 15:12
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrix81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrix81.class,args);
    }
}
