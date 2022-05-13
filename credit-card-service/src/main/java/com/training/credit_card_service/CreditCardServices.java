package com.training.credit_card_service;

public class CreditCardServices {

	CreditCard[] list;

	  public CreditCardServices() {
		super();
	 	list = new CreditCard[5];
	}
	public boolean addCard(CreditCard card) {
		list[0]=card;
		
		while (list.hasMoreElements()) {
			type type = (type) list.nextElement();
			
		}
	  }
	  public CreditCard[] getCards() {
		  
	  }
	
}
