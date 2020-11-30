package com.tc.springcloud.controller;

import com.tc.springcloud.entities.CommonResult;
import com.tc.springcloud.entities.Payment;
import com.tc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/11/30 16:25
 **/
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("*************插入结果：" + result);
//        if (result > 0) {
//            return new CommonResult(200, "success", result);
//        }
        return result > 0 ? new CommonResult(200, "success", result) : new CommonResult(444, "success", null);

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*************插入结果：" + payment);
//        if (result > 0) {
//            return new CommonResult(200, "success", result);
//        }
        return payment != null ? new CommonResult(200, "success", payment) : new CommonResult(444, "success", null);

    }
}
