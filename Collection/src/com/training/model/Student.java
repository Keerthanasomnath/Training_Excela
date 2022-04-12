package com.training.model;

public class Student {

	private int rollNumber;
   	private String firstName;
   	private double marksScored;
   	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(int rollNumber, String firstName, double marksScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.marksScored = marksScored;
	}


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", marksScored=" + marksScored + "]";
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

	public double getMarksScored() {
		return marksScored;
	}

	public void setMarksScored(double marksScored) {
		this.marksScored = marksScored;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(marksScored);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rollNumber;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (Double.doubleToLongBits(marksScored) != Double.doubleToLongBits(other.marksScored))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}
   	
}
