package com.msc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
//@EnableEurekaClient 这个不需要
public class MscZuulGateway9001Application {

	public static void main(String[] args) {
		SpringApplication.run(MscZuulGateway9001Application.class, args);
	}
}
