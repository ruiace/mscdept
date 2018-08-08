package com.msc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MscEureka5002Application {

	public static void main(String[] args) {
		SpringApplication.run(MscEureka5002Application.class, args);
	}
}
