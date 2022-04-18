package com.training.service;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import com.training.time.Student;

public class App {

	public static void main(String[] args) {

		String dateOfBirth="2001-07-21";
		Student viks=new Student();
		viks.setRollNumber(87);
		viks.setStudName("viky");
		viks.setDateOfBirth(LocalDate.parse(dateOfBirth));
		viks.setDateOfjoining(LocalDateTime.now());
		
		System.out.println(viks.getDateOfBirth().getYear());
		System.out.println(viks.getDateOfBirth().getMonth());
		System.out.println(viks.getDateOfBirth().getDayOfMonth());

        LocalTime startTime = LocalTime.of(9,30);
        LocalTime endTime = startTime.plusHours(8);
        System.out.println("Start time: "+startTime);
        System.out.println("End Time: "+endTime);
		
	}

}