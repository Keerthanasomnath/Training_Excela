package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class BloodDonorService1Application {

	public static void main(String[] args) {
		SpringApplication.run(BloodDonorService1Application.class, args);
	}

}
