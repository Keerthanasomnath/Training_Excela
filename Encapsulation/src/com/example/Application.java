package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		Student ram = new Student();
        ram.setRollNumber(20);
         ram.setMarkScored(50);
         ram.setFirstName("ram");
         ram.setBranch("ECE");
        // default method unable to access
        //because student class is in com.example.model package
        //and application is in com.example package
        //ram.setFirstName("Ram");
        //unable to access because Application 
        System.out.println("Roll Number = "+ram.getRollNumber());
         System.out.println("Marks Scored :="+ram.getMarkScored());
         System.out.println("Student Name  :="+ram.getFirstName());
          
         Student shyam = new Student(490,"Shyam","ECE",89);
         System.out.println("Roll Number = "+shyam.getRollNumber());
         System.out.println("Roll Number = "+shyam.getFirstName());

         
         

	}

}
