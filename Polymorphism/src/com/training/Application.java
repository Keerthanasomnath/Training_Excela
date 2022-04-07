package com.training;
import com.training.util.*;

import com.training.ifaces.*;
import com.training.model.*;

public class Application {

	public static void main(String[] args) {

		
		ObjectFactory factory = new NewObjectFactory();
		
		Conditional profObject =  factory.getConditional(1);
		Conditional stdObj =  factory.getConditional(2);
		Conditional prinObj =  factory.getConditional(3);


		
//		System.out.println(object.test("chennai"));

		System.out.println("Allowance ="+factory.getValue(profObject, "chennai"));
		System.out.println("Allowance ="+factory.getValue(stdObj, "ece"));
		System.out.println("Allowance ="+factory.getValue(prinObj, "nil"));
	}

}
