package com.training.bankaccount.service;

import com.training.bankaccount.BankAccount;

public class BankAccountService {

	public double calculateInterest(BankAccount account) {
		double simpleIntrest=0.05;
		if(account.getAccountNumber()<5000)
		{
			simpleIntrest=0.06;
		}
		return account.getBalance()*1*simpleIntrest;
	}
	public void calculateInterest(BankAccount[]accounts) {
		 for(BankAccount eachAccount : accounts) {
			 System.out.println(calculateInterest(eachAccount));
		 }
	}

	public double[] findInterest(BankAccount[] accounts) {
		
         double value[]=new double[accounts.length];
         int itr=0;
		for(BankAccount eachAccount:accounts) {
			value[itr]=calculateInterest(eachAccount);
			itr++;
		}
		return value;
		
	}
	
	//using new feature of java 7 - switch case with string
	
	private double calculateByAccountType(BankAccount account,double rateOfInterest) {
		return account.getBalance()*1*rateOfInterest;
//		String type = account.getAccountType(); 
//		
//		double rateOfInterest = 0.7;
//		if(type.equals("savings")) {
//			rateOfInterest= 0.05;
//		}
//		if(type.equals("fixed")|| type.equals("recurring")) {
//			rateOfInterest= 0.06;
//		}
//		
	}
	
	public double[] findInterestByAccount(BankAccount[] account)
	{
		double[] values = new double[account.length];
		int i =0 ;
  
	for(BankAccount eachAccount: account) {
		if(eachAccount!=null) {
		String key = eachAccount.getAccountType();
		switch (key) {
		
		case "savings":
           values[i] = calculateByAccountType(eachAccount,0.07);
			break;
			
			case "fixed":
		           values[i] = calculateByAccountType(eachAccount,0.06);
				break;
				
			case "Recurrring":
		           values[i] = calculateByAccountType(eachAccount,0.05);
				break;

		default:
			break;
		} 
		 i++;
	}
	}
	return  values ;
	
}
}
