package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@SpringBootApplication

public class SpringQuickStartApplication {

//	public static void trail() {
//		ApplicationContext ctx	= SpringApplication.run(SpringQuickStartApplication.class, args);
//		
//		//when using Id need to cast to specific Bean since
//		//return type of getBean method is object
//		System.out.println(ctx.getBean("ram"));
//		
//		//casting not required , but there should be only one bean of that type will throw Exception
//		Student shyam = ctx.getBean(Student.class);
//		
//		//when More than 1 bean of the same type available
//		//should use id and class name
//		
//		Teacher anitha = ctx.getBean("anitha",Teacher.class);
//		
//		anitha.setId(494);
//		anitha.setName("anitha somnath");
//		anitha.setSubject("Labour Law");
//
//		System.out.println(anitha);                      
//		System.out.println(shyam);
//
//	}
	public static void main(String[] args) {
		ApplicationContext ctx	= SpringApplication.run(SpringQuickStartApplication.class, args);

		Bill bil = ctx.getBean(Bill.class);
		Invoice invo = ctx.getBean(Invoice.class);
		
		System.out.println("Customer" +bil.getCustomer());
		System.out.println("hi"+invo.getCustomer());
		System.out.println("Product"  +bil.getProduct());
		CustomerList list = ctx.getBean(CustomerList.class);
		list.getCustList().forEach(System.out::println);
		
	}

}
