package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class DriverServiceClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(DriverServiceClientApplication.class, args);
	
		Client clien = ctx.getBean(Client.class);
	 
		System.out.println(clien.invokeGetAll());
//		System.out.println(clien.invokeAllAsObject());
	   	
//		Driver[] list = clien.invokeAllAsObject();
//		
//		for(Driver eachDriver:list) {
//			System.out.println("Driver Name:="+eachDriver.getDriverName());
//			System.out.println("Driver Rating=:"+eachDriver.getRating());
//			System.out.println("Driver Mobile =:"+eachDriver.getMobileNumber());
//			System.out.println("Driver Id=:"+eachDriver.getId());
//		}
//		clien.add();
		
		ctx.close();
	}
   @Bean
   public RestTemplate template() {
//	   return new RestTemplate();
	   RestTemplate template = new RestTemplate();
	   template.getInterceptors().add(interceptor());
	    return template;
   }
   
   @Bean
   public BasicAuthenticationInterceptor interceptor() {
	   return new BasicAuthenticationInterceptor("India", "India"); 
   }
}
