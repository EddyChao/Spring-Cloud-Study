package com.tc.springcloud.controller;

import com.tc.springcloud.entities.CommonResult;
import com.tc.springcloud.entities.Payment;
import com.tc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*************插入结果：" + result);
        return result > 0 ? new CommonResult(200, "success, 端口号" + serverPort, result) : new CommonResult(444, "error", null);

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*************插入结果：" + payment);
        return payment != null ? new CommonResult(200, "success, 端口号" + serverPort, payment) : new CommonResult(444, "error", null);
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
