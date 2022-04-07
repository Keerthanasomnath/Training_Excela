package com.example.model;

public class Student {

	private int rollNumber;
	private String firstName;
	private String branch;
	private double markScored;
	
	public String getBranch() {
		return branch;
	}
	 
	public void setBranch(String branch) {
		this.branch = branch;
	}

    public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Student(int rollNumber, String firstName, String branch, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
		this.markScored = markScored;
	}

	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber,firstName,branch,99);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	
}
