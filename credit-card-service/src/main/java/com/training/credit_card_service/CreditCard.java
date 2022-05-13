package com.training.credit_card_service;

public class CreditCard {

	private int cardNumber;
	private String cardHolder;
	private int amountDue;

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CreditCard(int cardNumber, String cardHolder, int amountDue) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.amountDue = amountDue;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public int getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}

	
	
	
}
