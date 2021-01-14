package com.lwx.springcloud.controller;

import com.lwx.springcloud.entities.CommonResult;
import com.lwx.springcloud.entities.Payment;
import com.lwx.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author lwxstart
 * @create 2021-01-09 20:47
 */

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
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
}