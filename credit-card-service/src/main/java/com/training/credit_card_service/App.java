package com.training.credit_card_service;

import java.util.Scanner;

import com.training.CreditCard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CreditCard cardOne=new CreditCard(456425678,
        		"Lokesh Kumar", 200);
        CreditCardService service=new CreditCardService();
        if(!(service.addCard(cardOne)))
        {
        	System.out.println("Array is full");
        	
        }
        CreditCard[] cards =service.getCards();
      double total=0;
      for(CreditCard eachCard:cards) {
    	  System.out.println(eachCard);
    	  total=total+eachCard.getAmountDue();
      }
      System.out.println(total);
        
    }
}
