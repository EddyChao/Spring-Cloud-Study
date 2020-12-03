package com.tc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/12/2 10:58
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain82.class, args);
    }
}
