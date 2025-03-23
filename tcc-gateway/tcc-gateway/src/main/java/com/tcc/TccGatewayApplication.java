package com.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TccGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TccGatewayApplication.class, args);
	}

}
