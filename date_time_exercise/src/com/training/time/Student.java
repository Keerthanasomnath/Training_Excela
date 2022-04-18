package com.training.time;
import java.time.*;

public class Student {

	
	private int rollNumber;
	private String studName;
	private LocalDate dateOfBirth;
	private LocalDateTime dateOfjoining;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNumber, String studName, LocalDate dateOfBirth, LocalDateTime dateOfjoining) {
		super();
		this.rollNumber = rollNumber;
		this.studName = studName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfjoining = dateOfjoining;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDateTime getDateOfjoining() {
		return dateOfjoining;
	}
	public void setDateOfjoining(LocalDateTime dateOfjoining) {
		this.dateOfjoining = dateOfjoining;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studName=" + studName + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfjoining=" + dateOfjoining + "]";
	}
	
	
}
