package com.training;

public class ObjectFactory {
	
	public Automobile getObject(int key) {
		switch (key) {
		case 1:
			return new MarutiCar();

		case 2:
			return new Toyato();
		case 3:
			return null;
		default:
			break;
		}
		return null;
		
	}
	public void printQuote(Automobile poly){
		System.out.println(poly.getColor());
		System.out.println(poly.getModel());
		System.out.println(poly.getPrice());
	}

}
