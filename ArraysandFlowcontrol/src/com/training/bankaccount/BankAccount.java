package com.training.bankaccount;

public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private String AccountType;
	

	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.AccountType = accountType;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		this.AccountType = accountType;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
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
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
}
