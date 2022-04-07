package com.training;

import com.training.bankaccount.*;
import com.training.bankaccount.service.*;

public class Application {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//   BankAccount account= new BankAccount(1010,"Ramesh", 5000,"savings");
//   System.out.println(account.toString());
		
		SavingsAccount account = new SavingsAccount(2000,"Ramesh",8000,"Joint","rajesh");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		SavingsAccountService service = new SavingsAccountService();
		System.out.println(service.getCustomerInfo(account));
		System.out.println(service.calculateInterest(account));
		BankAccountService service2 = new SavingsAccountService();
		
		//cannot access sub class method with super class reference
		//service2.getCustomerInfo(account);
		SavingsAccountService savingsService2 = (SavingsAccountService)service2;
		System.out.println(savingsService2.getCustomerInfo(account));
	}

}
