package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidirectional.Utility;


@SpringBootApplication
public class SpringDataJpaSimpleMappingBidirectionalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappingBidirectionalApplication.class, args);
		
		Utility obj = ctx.getBean(Utility.class);
		
//		obj.create();
//		obj.findAll();
		obj.findDoctorFrmPatient();
		ctx.close();
	}

	
	@Bean
	public Doctor munna() {
		Doctor doc = new Doctor();
		doc.setDoctorId(2020);
		doc.setDoctorName("Munna");
		doc.setPhoneNumber(4566378);
		doc.setDepartment("ENT");
		
		return doc;
	}
	
	@Bean
	public Patient kavi() {
		return new Patient(200,"Kavitha",46465);
	}
	@Bean
	public Patient pavi() {
		return new Patient(210,"pavithra",465695895);
	}
}
