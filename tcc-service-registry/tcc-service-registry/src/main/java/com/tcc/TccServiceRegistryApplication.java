package com.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TccServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TccServiceRegistryApplication.class, args);
	}

}
