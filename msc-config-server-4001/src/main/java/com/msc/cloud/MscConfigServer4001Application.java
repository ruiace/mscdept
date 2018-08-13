package com.msc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * configserver 服务端
 */

@SpringBootApplication
@EnableConfigServer
public class MscConfigServer4001Application {

	public static void main(String[] args) {
		SpringApplication.run(MscConfigServer4001Application.class, args);
	}
}
