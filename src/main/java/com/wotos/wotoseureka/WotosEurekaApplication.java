package com.wotos.wotoseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WotosEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WotosEurekaApplication.class, args);
	}

}
