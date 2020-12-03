package com.tc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/12/2 15:27
 **/

public interface LoadBalancer {
    ServiceInstance instance();
}
