package com.training.util;

import com.training.ifaces.Conditional;
import com.training.model.Proffesor;
import com.training.model.Student;

public class ObjectFactory {

	
	public Conditional getConditional(int key) {
		
		
		
		switch (key) {
		case 1:
			return new Proffesor("phd");
		case 2:
			return new Student(89);

		default:
			return null;
		}
	}
	
	
	public double getValue(Conditional obj,Object value) {
		
		boolean result = obj.test(value);
		double travelAllowance=2000;
		
		if(result) {
		  travelAllowance=8000;
		} 
		return travelAllowance;

	}
	
	
}


