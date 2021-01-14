package com.lwx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lwxstart
 * @create 2021-01-12 16:19
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBordMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(DashBordMain9001.class,args);
    }
}
