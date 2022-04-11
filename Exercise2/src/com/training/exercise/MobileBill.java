package com.training.exercise;

public class MobileBill {
	
	private String customerName;
	private long MobileNumber;
	private String planeName; 
	private Address address;
	int value;
	
	public static final String SERVICEPROVIDER="Airtel";
	
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MobileBill(String customerName, long mobileNumber, String planeName, Address address) {
		super();
		this.customerName = customerName;
		this.MobileNumber = mobileNumber;
		this.planeName = planeName;
		this.address = address;
	}






	@Override
	public String toString() {
		return "MobileBill [customerName=" + customerName + ", MobileNumber=" + MobileNumber + ", planeName="
				+ planeName + ", address=" + address + ", value=" + value + "]";
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	

	public double BillCalculation() {
		
	switch (planeName.toLowerCase()) {
	case "prepaid":

		value=200;
		
		break;
	case "postpaid":
		 value=300;
		break;
		
		default:
			value=-1;
			break;
	}
	return value;

	
	}
}
