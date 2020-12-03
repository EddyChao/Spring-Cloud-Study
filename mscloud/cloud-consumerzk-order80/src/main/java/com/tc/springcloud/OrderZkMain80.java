package com.tc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/12/2 10:29
 **/
@SpringBootApplication
@EnableDiscoveryClient     // 以后用这个就可以了，不用eureka了
public class OrderZkMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderZkMain80.class, args);
    }
}