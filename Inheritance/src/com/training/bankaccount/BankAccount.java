package com.training.bankaccount;

public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private String AccountType;
	

	

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		this.AccountType = accountType;
	}


	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	
	public BankAccount() {
		super();
		System.out.println("Zero args constructor");
	}
	
	
	
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		System.out.println("Three args constructor of Super Class called"); 
	}

	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.AccountType = accountType;
		System.out.println("four args constructor of super class called");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return  this.accountNumber+","+this.accountHolderName+","+this.AccountType+","+this.balance;

		return super.toString()+this.accountNumber+","+this.accountHolderName+","+this.AccountType+","+this.balance;

		
	}
}
