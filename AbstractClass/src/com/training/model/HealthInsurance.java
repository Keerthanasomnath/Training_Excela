package com.training.model;

public class HealthInsurance extends Insurance {
	private String[] PreExsisting_Diseases;

	
	 public String[] getPreExsisting_Diseases() {
		return PreExsisting_Diseases;
	}

	public void setPreExsisting_Diseases(String[] preExsisting_Diseases) {
		PreExsisting_Diseases = preExsisting_Diseases;
	}


	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExsisting_Diseases) {
		super(policyNumber, policyHolderName);
		  PreExsisting_Diseases = preExsisting_Diseases;
	}

	@Override
	public double calculatePremium() {
		
//		double premium = 10000;
//		 for(String eachItem: PreExsisting_Diseases) {
//			 String item = eachItem.toLowerCase();
//			if(item.equals("BP") || item.equals("Sugar")) {
//			 premium = 15000;
//		 }
//		 }
		 double premium = 10000;
		 for(String eachItem: PreExsisting_Diseases) {
			if(eachItem.equalsIgnoreCase("BP") || eachItem.equalsIgnoreCase("Sugar")) {
			 premium = 15000;
		 }
		 }
		
		return premium;
	}

}
