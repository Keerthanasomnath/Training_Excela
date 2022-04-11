package com.training.exercise;

public class Address {
	
	private String StreetName;
	private long HouseNumber;
	private String AreaName; 
	private long PinCode;
	
	public Address(String streetName, long houseNumber, String areaName, long pinCode) {
		super();
		StreetName = streetName;
		HouseNumber = houseNumber;
		AreaName = areaName;
		PinCode = pinCode;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public long getHouseNumber() {
		return HouseNumber;
	}

	public void setHouseNumber(long houseNumber) {
		HouseNumber = houseNumber;
	}

	public String getAreaName() {
		return AreaName;
	}

	public void setAreaName(String areaName) {
		AreaName = areaName;
	}

	public long getPinCode() {
		return PinCode;
	}

	public void setPinCode(long pinCode) {
		PinCode = pinCode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
