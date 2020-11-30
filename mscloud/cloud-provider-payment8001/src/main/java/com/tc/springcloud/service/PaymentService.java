package com.tc.springcloud.service;

import com.tc.springcloud.entities.Payment;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/11/30 16:20
 **/
public interface PaymentService {

    int create(Payment payment);
    Payment getPaymentById(Long id);
}
