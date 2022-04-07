package com.training.application;
import com.training.services.*;
import com.training.DiscountCalculator;
import com.training.model.*;

public class MyApplication {

	public static void main(String[] args) {

		// CurrencyConverter conv = new CurrencyConverter();
		//subtype = new subtype
		
		Function conv =new CurrencyConverter();
		
		double response = conv.apply(200);
		
        System.out.println(response);
          
        //line 13 & 15 & 18 are identical
        
        System.out.println(conv.apply(300));
        
        System.out.println(Function.COUNTER);
        
        if(conv instanceof ConditionCheck) {
        	
        	ConditionCheck obj =(ConditionCheck)conv;
        System.out.println("Is Discount Allowed:="+obj.test(300));
      
	}else {
		System.out.println("cannot be cast");
	}
        Conditional condObj = new DiscountCalculator();
         System.out.println(condObj.test(6000));
         System.out.println(condObj.negate(3000));
	}

}
