package com.training.exercise;

public class Application {

	public static void main(String[] args) {
		
		
		Address add = new Address("Ram nagar",1545,"collector nagar",600101);
		MobileBill bill = new MobileBill("Keerthi", 9324234234L, "Postpaid",add);
		System.out.println(bill.toString());
        System.out.println(MobileBill.SERVICEPROVIDER);
		
		System.out.println(bill.BillCalculation());

	}

}
