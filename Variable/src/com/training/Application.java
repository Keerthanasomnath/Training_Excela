package com.training;

public class Application {

	public static void main(String[] args) {
      
		 BankAccount account =new BankAccount("Ramesh",1000);
		 
		 System.out.println(account.getUpdatedBalance(2000));
		 System.out.println(account.getUpdatedBalance(3000));
		 System.out.println(BankAccount.getCount());
		 System.out.println(account.getAccountNumber());
		 System.out.println(account.getWithDrawal());
		 System.out.println(account.getUpdatedBalance(10000));

		 
		 BankAccount account2 = new BankAccount("suresh",2000);
		System.out.println(account2.getUpdatedBalance(2000));
		// System.out.println(account2.getAccountNumber());
		// System.out.println(account2.getAccountHolderName());




	}

}
