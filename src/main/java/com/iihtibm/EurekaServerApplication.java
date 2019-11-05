package com.iihtibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author savagelee
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	@RequestMapping("/")
	public String home() {
		return "Welcome to Spring Boot Eureka Server";
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
