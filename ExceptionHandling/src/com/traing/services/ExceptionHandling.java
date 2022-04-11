package com.traing.services;


public class ExceptionHandling {

	public void usingArrayIndexException(String[] args) {
		System.out.println(args[2]);
		
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Method requires 3 values to be passed [a,b,c]");
		e.printStackTrace();
		}
	
		
	}
	
	public void usingNumberFormatException(String value) {
		int age = 0;
		try {
			age = Integer.parseInt(value);
		} catch (NumberFormatException e) {
           System.err.println("Number format exception");
			e.printStackTrace();
		}
	    
		System.out.println(age);

	}
	
	public String usingFinallyBlock()throws Exception {
		
		int denominator=0;
		try {
			System.out.println(4/denominator);
		}catch(ArithmeticException e) {
			System.out.println("Denominator should not be 0");
			throw new Exception();
		}
		finally {
			System.out.println("bye , bye");
		}
		
		System.out.println("Thanks");
		return "thanks";

	}
         	
	
}
