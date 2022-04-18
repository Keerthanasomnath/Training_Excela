package com.training;

import java.util.Optional;

import com.training.ifaces.Conditional;

public class UsingOptional {
	
	public static Optional <String> getValue(int key){
		Optional<String> response = Optional.empty();
		if(key==1) {
			response=Optional.of("Hi");
		}
	  else {
  response = Optional.of("No bye");
	  }
		return response;
	}

	public static Object getString(int key) {
		switch (key) {
		case 1:
			return new String ("chocobar");
		case 2:
			return  new StringBuffer ("cassatta");

		default:
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//will throw null exception for values 3 & above
 //System.out.println(getString(3).toString());
	
   
	//to avoid nullpointer exception & return a default value
//   new feature of java 8 optional is used 
	    System.out.println(Conditional.getMessage());

	Optional<Object> optional = Optional.ofNullable(getString(3)); 
       System.out.println(optional.orElse("vannila").toString());
  
       //here we are checking if the value is present 
       //It is present then only we will call get method
       Optional<Object> opt2 = Optional.ofNullable(getString(3));
   	if(opt2.isPresent()) {
   		System.out.println("Value is present" +opt2.get());   		
   	}else {
   		System.out.println("Value is not present");
   	}
   	//Using Lambda Expression with optional
    
//   	Optional<Object> opt3 = Optional.ofNullable(getString(3));
//    opt3.orElseThrow(
//    		()-> new RuntimeException("No obj for 3 try again"));

    
    Optional<String> optionObj = getValue(2);
    if(optionObj.isPresent())
	{
		System.out.println(optionObj.get().toString());
	}
	else {
		System.out.println("Invalid Choice Enter 1");

	}
	}
}


