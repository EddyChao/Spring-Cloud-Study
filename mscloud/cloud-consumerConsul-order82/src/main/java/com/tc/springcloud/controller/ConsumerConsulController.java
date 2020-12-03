package com.tc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/12/2 11:00
 **/
@RestController
@Slf4j
public class ConsumerConsulController {
    public static final String INVOKE_URL="http://consul-provider-service";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/customer/payment/consul")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul",String.class);
    }
}
