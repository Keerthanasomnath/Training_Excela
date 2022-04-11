package com.traing.services;

import com.traing.model.Student;

public class StudentService {

	private Student student;

	public StudentService(Student student) {
		super();
		this.student = student;
	}

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	//applying the Handle rule of Exception handling
		public String sendDetails() {
		  String name = null;
			try {
			name =	this.student.getFirstName();
			}catch(NullPointerException e) {
				System.err.println("Student obj is not passed Check again");
		}
			return name;
		}
		
		public String findRank()throws Exception{
			String grade = "A";
			if(this.student.getMarkScored()>90) {
				grade = "o";
			}
			return grade;
		}
}


