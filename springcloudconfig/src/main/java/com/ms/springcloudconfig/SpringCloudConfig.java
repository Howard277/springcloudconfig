package com.ms.springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableConfigServer
public class SpringCloudConfig {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfig.class, args);
	}
}
