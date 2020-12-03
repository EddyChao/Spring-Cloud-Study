package com.tc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/12/2 9:53
 **/
@SpringBootApplication
@EnableDiscoveryClient     // 以后用这个就可以了，不用eureka了
public class PaymentMain8004 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8004.class, args);
    }
}