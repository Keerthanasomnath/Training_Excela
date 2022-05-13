package com.example.demo;
import java.util.*;

public class Application {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Converter convObj = new Converter();

		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println(convObj.convert(name));

		

		System.out.println("Enter the fareheit temp");
		double FarenTemp =sc.nextDouble();
		System.out.println(convObj.convert(FarenTemp));
		
		System.out.println("Enter the value");
		double amt =sc.nextDouble();
		int frm =sc.nextInt();
		System.out.println(convObj.convert(amt, frm));
		sc.close();

		


		


	}

}
