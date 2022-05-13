package com.example.demo;

public class Converter {

	public String convert(String name) {
		return name.toUpperCase();
	}


//creating a overloaded method

public double convert(double FarenTemp) {
	
	return (FarenTemp-32)*5/9;
}
public double convert(double amt, int frm) {

	double response = amt*100;
	
	
 	if (frm>1) {
		return amt*100;
	}
	
}
}