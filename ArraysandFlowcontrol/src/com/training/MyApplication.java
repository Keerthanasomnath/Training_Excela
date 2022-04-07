package com.training;
import com.training.bankaccount.BankAccount;
import com.training.bankaccount.service.*;
import java.util.*;

public class MyApplication {

	public static void main(String[] args) {

		BankAccount[]list= new BankAccount[5];
		BankAccountService service = new BankAccountService();
		
		Scanner sc = new Scanner(System.in);
 
		int idx=0,choice;
		do 
			
		{

			System.out.println("Acc no");
			int accountNumber = sc.nextInt();
			
			System.out.println("Acc holder name");
			String accountHolderName = sc.next();
			
			System.out.println("Balance");
			double balance = sc.nextDouble();
			
			System.out.println("Account type[savings,fixed,recurring]");
		    String accountType = sc.next();
		   
 BankAccount account = new BankAccount(accountNumber,accountHolderName,balance,accountType);
			  list[idx]=account;
				System.out.println("Enter 0 to stop and 1 to continue");
                 choice = sc.nextInt();
                		 
		}while(choice!=0);
		
		double[] values =service.findInterestByAccount(list);
		

	for(double eachValue:values) {
		System.out.println(eachValue);
	}
		
		sc.close();
	}

}
