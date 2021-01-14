package com.lwx.springcloud.service;

import com.lwx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lwxstart
 * @create 2021-01-05 22:43
 */


public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
