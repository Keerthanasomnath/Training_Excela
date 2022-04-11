package com.traing;

import com.traing.model.Student;
import com.traing.services.ExceptionHandling;
import com.traing.services.StudentService;
import java.util.*;

public class Application {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
//		Student ram = new Student(1010,"ramesh",98);
//		
//		StudentService service = new StudentService(ram);
//		System.out.println(service.sendDetails());
//
//
//		
//		StudentService service1 = new StudentService();
//       
//		try {
//			System.out.println(service1.findRank());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//    	System.err.println("Name is not passed");
//		}
//		
//		ExceptionHandling exHandling = new ExceptionHandling();
//		
////		 exHandling.usingArrayIndexException(args);
////	 exHandling.usingNumberFormatException("45");
//		
//		exHandling.usingFinallyBlock();
		
		
		try(Scanner scan = new Scanner(System.in)){

			System.out.println("Enter Number");
			int num = scan.nextInt();
			System.out.println(num);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
