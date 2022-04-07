package com.training.model;

public class LifeInsurance extends Insurance {
	 
	private int Age;

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		Age = age;
	}

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifeInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePremium() {
      
		 double premium = 10000;
		 if(Age<50) {
			 premium = 5000;
		 }

		return premium;
	}
		

}