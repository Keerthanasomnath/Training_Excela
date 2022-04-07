package com.training.model;


public class Application {

	public static void printPremium(Insurance object) {
		// TODO Auto-generated method stub
        System.out.println(object.calculatePremium());
	}
	public static void main(String[] args) {
		VehicleInsurance car= new VehicleInsurance (1010,"ramesh","car",2019);
          
		 printPremium(car);		
		 
		 LifeInsurance life = new LifeInsurance(2000,"Ani",60);
		 
		 printPremium(life);
		 
		 String[] illness = {"thyphoid","ent"};
		 		HealthInsurance health = new HealthInsurance(3030,"Vicky",illness);
		 printPremium(health);
		 
	}

}
