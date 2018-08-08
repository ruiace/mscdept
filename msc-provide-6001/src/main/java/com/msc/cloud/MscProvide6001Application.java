package com.msc.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.msc.cloud.mapper")
public class MscProvide6001Application {

	public static void main(String[] args) {
		SpringApplication.run(MscProvide6001Application.class, args);
	}
}
