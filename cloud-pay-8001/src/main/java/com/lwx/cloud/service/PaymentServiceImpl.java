package com.lwx.cloud.service;

import com.lwx.cloud.dao.PaymentDao;
import com.lwx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lwxstart
 * @create 2021-01-05 22:44
 */
@Service
public class PaymentServiceImpl  implements PaymentService{
    @Resource
    private PaymentDao paymentDao;


    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
