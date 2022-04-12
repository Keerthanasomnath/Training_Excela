package com.training;

public class MyApplication {

	public static void main(String[] args) {
		
           ObjectFactory obJect = new ObjectFactory();
           Automobile maruthi = new MarutiCar();
           Automobile toyato = new Toyato();
           
           obJect.printQuote(maruthi);
           
           
           

	}

}
