package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;

@SpringBootApplication
public class SpringDataJpaSimpleMappingOnetooneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappingOnetooneApplication.class, args);

		ctx.close();
	}

	@Bean
	public Seminar munna() {
		Seminar sem = new Seminar();
	    sem.setSeminarId(100);
		sem.setSeminarName("IRCSTSET");
		sem.setDuration(60);
		
		return sem;
	}
	
	@Bean
	public Speaker kavi() {
		return new Speaker(200,"Kavitha","M.E ece");
	}
}
