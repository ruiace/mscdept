package com.msc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MscHystrixDashboard8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MscHystrixDashboard8001Application.class, args);
	}
}
