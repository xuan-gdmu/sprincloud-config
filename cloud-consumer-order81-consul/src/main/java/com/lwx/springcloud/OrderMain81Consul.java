package com.lwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lwxstart
 * @create 2021-01-09 20:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain81Consul {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain81Consul.class,args);
    }
}
