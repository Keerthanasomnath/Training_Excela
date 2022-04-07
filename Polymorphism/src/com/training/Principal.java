package com.training;

import com.training.ifaces.Conditional;

public class Principal implements Conditional {
	
	private String salutation;

	
	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Principal(String salutation) {
		super();
		this.salutation = salutation;
	}


	public String getSalutation() {
		return salutation;
	}


	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}


	@Override
	public boolean test(Object value) {
		String salutation = (String)value;
		 boolean result = false;
		 if(salutation.equalsIgnoreCase("DR"))
		 {
			 result= true;
		 }
		 return result;
	}

}
