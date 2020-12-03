package com.tc.springcloud.controller;

import com.tc.springcloud.entities.CommonResult;
import com.tc.springcloud.entities.Payment;
import com.tc.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/11/30 17:51
 **/
@RestController
@Slf4j
public class OrderController {

    @Autowired
    PaymentFeignService paymentFeignService;

//    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";





    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getCommonResult(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        return paymentFeignService.paymentFeignTimeout();
    }

}
