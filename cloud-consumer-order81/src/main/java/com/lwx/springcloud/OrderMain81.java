package com.lwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lwxstart
 * @create 2021-01-06 22:40
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain81.class,args);
    }
}
