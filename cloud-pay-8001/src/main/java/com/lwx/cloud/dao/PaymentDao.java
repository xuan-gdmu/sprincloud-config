package com.lwx.cloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lwxstart
 * @create 2021-01-05 22:09
 */

@Mapper
public interface PaymentDao extends BaseMapper<Payment> {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
