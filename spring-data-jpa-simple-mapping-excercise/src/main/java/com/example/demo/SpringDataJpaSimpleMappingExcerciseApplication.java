package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employees;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingExcerciseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringDataJpaSimpleMappingExcerciseApplication.class, args);
		
	EmployeeService service = ctx.getBean(EmployeeService.class);
	Employees siva = ctx.getBean(Employees.class);
//	Employees added = service.add(siva);
	
	
	//service.findAll().forEach(System.out::println);
	//service.findByDateOfBirth(LocalDate.of(1985,9,20)).forEach(System.out::println);
//	service.findByLocation("Chennai").forEach(System.out::println);

	service.findByLocationAndSkillSet("Banglore","Python").forEach(System.out::println);
	
//	if(added!=null) {
//			System.out.println("one employees Added");
//		}
//		ctx.close();
//	}
	ctx.close();
	}

	
	
	@Bean
	public Employees siva() {
		return new Employees(2035,"Karun",LocalDate.of(1985,9,20),"Banglore","Python",774434);
	}
//	}

}
