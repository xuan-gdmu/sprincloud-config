package com.lwx.springcloud.controller;

/**
 * @author lwxstart
 * @create 2021-01-09 20:58
 */
import com.lwx.springcloud.entities.CommonResult;
import com.lwx.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
        return result;
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getForObject(@PathVariable ("id") Long id){
        return restTemplate.getForObject(INVOME_URL + "/payment/get" + id, CommonResult.class);

    }

}
