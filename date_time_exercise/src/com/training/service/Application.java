package com.training.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import com.training.time.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stud = new Student(101,"Ram",LocalDate.of(1972,10,12),
		LocalDateTime.of(2000,Month.JUNE,5,9,30));

Student student = new Student(101,"Shyam",LocalDate.now(),
		LocalDateTime.now());


System.out.println(stud);
System.out.println("RAm year of birth: "+stud.getDateOfBirth().getYear());
System.out.println("First birthday" +stud.getDateOfBirth().plusYears(1));
System.out.println(student);
System.out.println("Ram one moth old "+stud.getDateOfBirth().plus(1,ChronoUnit.MONTHS));
}

}
