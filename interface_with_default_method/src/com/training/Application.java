package com.training;

import com.training.services.StudentResultService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentResultService service = new StudentResultService();
		System.out.println("Is Pass: "+service.test(60.00));

		System.out.println("Is fail: "+service.negate(60.00));
	}

}
