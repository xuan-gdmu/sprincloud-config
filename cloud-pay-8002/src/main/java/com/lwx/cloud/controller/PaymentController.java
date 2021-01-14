package com.lwx.cloud.controller;


import com.lwx.cloud.service.PaymentServiceImpl;
import com.lwx.springcloud.entities.CommonResult;
import com.lwx.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lwxstart
 * @create 2021-01-06 20:13
 */
@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentServiceImpl paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create" )
    //加注解会出错
    public CommonResult<Integer> create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result > 0){  //成功
            return new CommonResult<Integer>(200,"插入数据库成功,端口号：" + serverPort ,result);
        }else {
            return new CommonResult<>(444,"插入数据库失败",null);
        }
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult<Payment>(200,"查询成功,端口号：" + serverPort ,payment);
        }else {
            return new CommonResult<Payment>(444,"没有对应记录，查询ID："+id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }



}
