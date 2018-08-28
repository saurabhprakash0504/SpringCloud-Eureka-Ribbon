package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient1DegreeToFahrenheitApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1DegreeToFahrenheitApplication.class, args);
	}
}
