package com.msc.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JF on 2018/8/8.
 */
@Configuration
public class HttpConfig {

    @Bean
    //@LoadBalanced  //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    //feign 可以不配置loadbalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
