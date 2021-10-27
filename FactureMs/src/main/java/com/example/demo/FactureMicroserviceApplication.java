package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackageClasses = FactureRestAPI.class)
public class FactureMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactureMicroserviceApplication.class, args);
	}

}
