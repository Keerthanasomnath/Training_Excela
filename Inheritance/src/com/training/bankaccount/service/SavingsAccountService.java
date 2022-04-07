package com.training.bankaccount.service;

import com.training.bankaccount.BankAccount;
import com.training.bankaccount.SavingsAccount;

public class SavingsAccountService extends BankAccountService {

	public String getCustomerInfo(SavingsAccount account) {
		return account.getAccountHolderName();
	}

	@Override
	public double calculateInterest(BankAccount account) {
		double simpleIntrest=0.05;
		if(account.getAccountNumber()<5000)
		{
			simpleIntrest=0.06;
		}
		return account.getBalance()*1*simpleIntrest;
	}
	
	
}
