package com.tc.springcloud;

import com.tc.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/11/30 17:48
 **/
//@RibbonClient(name="CLOUD-PROVIDER-SERVICE", configuration = MySelfRule.class)//指定该负载均衡规则对哪个提供者服务使用 ， 加载自定义规则的配置类
@EnableEurekaClient
@SpringBootApplication
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
