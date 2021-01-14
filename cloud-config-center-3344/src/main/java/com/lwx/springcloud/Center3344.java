package com.lwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lwxstart
 * @create 2021-01-14 16:05
 */
@SpringBootApplication
@EnableConfigServer
public class Center3344 {
    public static void main(String[] args) {
        SpringApplication.run(Center3344.class,args);
    }
}
