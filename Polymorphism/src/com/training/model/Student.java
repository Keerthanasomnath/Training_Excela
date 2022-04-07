package com.training.model;

import com.training.ifaces.Conditional;

public class Student implements Conditional {
    private int marksScored;
    
	
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int marksScored) {
		super();
		this.marksScored = marksScored;
	}


	public int getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(int marksScored) {
		this.marksScored = marksScored;
	}



	@Override
	public boolean test(Object value) {
		String strBranch = (String)value;
		 boolean result = false;
		 if(this.marksScored>80 && strBranch.equalsIgnoreCase("ece"))
		 {
			 result= true;
		 }
		 return result;
	}
}
