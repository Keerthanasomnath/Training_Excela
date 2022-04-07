package com.training.model;

import com.training.ifaces.Conditional;

public class Proffesor implements Conditional {

	private String Qualification;

	public Proffesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		this.Qualification = qualification;
	}

	public Proffesor(String qualification) {
		super();
		this.Qualification = qualification;
	}
	
	@Override
	public boolean test(Object value) {

		String strValue = (String)value;
		 
		   boolean result = false;
	
		   if(strValue.toLowerCase().equals("phd")) {
			result = true;
		}
		return result;
	}

}
