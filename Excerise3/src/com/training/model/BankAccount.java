package com.training.model;

public abstract class BankAccount {
	
	private double Amount;
	
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	public abstract double deposit();
	public abstract double withDrawal();
	



}
