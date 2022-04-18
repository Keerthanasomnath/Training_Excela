package com.training.service;
import java.util.*;
import java.util.Date;
import java.sql.*;
import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
	
		//Step 1 creating util date
		java.util.Date date1 = new java.util.Date();
		
		//step 2 util date to SQL date
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
  
		System.out.println(date1);

		System.out.println(date2);
  
		//step 3 SQL Date to LocalDate
  LocalDate localDate = date2.toLocalDate();
  System.out.println(localDate.getDayOfMonth());
  System.out.println(localDate.getDayOfYear());

  //Step 4 Local date to SQL date
	java.sql.Date sqlDate2 =  java.sql.Date.valueOf(localDate);
	System.out.println(sqlDate2);
	}
}