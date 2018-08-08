package com.msc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
/*@EnableFeignClients(basePackages="com.msc.cloud.service")
@ComponentScan("com.msc.cloud.service")*/
@EnableFeignClients
public class MscConsumeFeign7002Application {

	public static void main(String[] args) {
		SpringApplication.run(MscConsumeFeign7002Application.class, args);
	}
}
