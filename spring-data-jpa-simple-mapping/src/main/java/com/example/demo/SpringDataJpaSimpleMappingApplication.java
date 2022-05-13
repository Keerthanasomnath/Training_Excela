package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=  SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
//		Doctor keerthu = ctx.getBean(Doctor.class);

        DoctorService service = ctx.getBean(DoctorService.class);
//		Doctor added = service.add(siva);
//        Doctor added = service.add(keerthu);
//        service.findByDep("ENT").forEach(System.out::println);
//        service.findByNameAndDept("Siva","ENT").forEach(System.out::println);
        service.getByNameDept("Siva", "cardio");

        
        
        //		if(added!=null) {
//			System.out.println("One doctor Added");
//		}
//		
		ctx.close();
	}
//	@Bean
//	public Doctor keerthu() {
//		return new Doctor(2025,"anitha","pediatrics",6800086);
//	}

}
