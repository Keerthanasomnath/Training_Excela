package com.training.application;
import com.training.bankaccount.*;
import com.training.bankaccount.service.*;

public class Application {

	public static void main(String[] args) {
		BankAccountService service = new BankAccountService();
		
//		BankAccount ram = new BankAccount(1200,"Ramesh",5000);
//		
//		double simpleInterest = service.calculateInterest(ram);
//		
//		System.out.println("Simple Interest @6%:" +simpleInterest);
//		
//		
//		BankAccount Shayam = new BankAccount(1200,"Shayam",6000);
//		
//		double simpleInterest1 = service.calculateInterest(Shayam);
//		
//		System.out.println("Simple Interest @5%:" +simpleInterest1);
//		
////		BankAccount[] accounts = new BankAccount[2];
//	
//		BankAccount[] accounts = {ram,Shayam}; 
//
//		System.out.println("======================");
//		double value[]=service.findInterest(accounts);
//		
//		for (double eachValue:value)
//		{
//			System.out.println(eachValue);
//		}
//		System.out.println("=============arrays===========");
		
	BankAccount[] accountList = {
			new BankAccount(800,"jay",5000,"savings"),
			new BankAccount(800,"kam",6000,"savings"),
			new BankAccount(800,"tom",7000,"savings"),
		
		
	};

	
 double[] interestValues = service.findInterestByAccount(accountList);
  
       for(double eachvalue: interestValues) {
    	   System.out.println(eachvalue);
       }
		
	}

}
