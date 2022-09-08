package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaSimpleMappingOnetomanyApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext ctx =SpringApplication.run(SpringDataJpaSimpleMappingOnetomanyApplication.class, args);
	
       DoctorUtils obj = ctx.getBean(DoctorUtils.class);
      obj.findAll();
      
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
	@Bean
	public Patient bhavi() {
		return new Patient(220,"bhavana",9987875);
	}
}
