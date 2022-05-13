package com.training;

public class BankAccount {
    //static variable
	private static int count;
	
	//instance variable
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	private int withDrawal;
	
	
		public int getWithDrawal() {
		return withDrawal;
	}
	public void setWithDrawal(int withDrawal) {
		this.withDrawal = withDrawal;
	}
		public int getAccountNumber() {
		return accountNumber;
	}
	public static int getCount() {
		return ++count;
	}
	public double getUpdatedBalance(double amount) {//parameter variable
		
		//local variable
		double updatedBalance =0.0;
		System.out.println(updatedBalance);
		
		double currentBalance =0;
		//localVariable is initialized 
		
		currentBalance = this.balance+amount-withDrawal;
		this.balance= currentBalance;  
		return currentBalance;
		
		
		
	}
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber = getCount();
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
