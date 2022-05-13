package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class TablePerSubClassApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(TablePerSubClassApplication.class, args);
	
	InsuranceService service = ctx.getBean(InsuranceService.class);
	service.addLifeInsurancePolicy();
	ctx.close();
	}

	
	@Bean
	public LifeInsurance life() {
		return new LifeInsurance(98765,"Rangesh",23,"IT services");
	}
	@Bean
	public HealthInsurance health() {
		return new HealthInsurance(9990,"Manish",56,"Diabetic");
	}
	
}
