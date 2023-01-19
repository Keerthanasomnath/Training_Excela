package com.example.demo.entity;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)


public class TripDetailsEnitty {
	
	int tripId;
	int driverId;
	long mobileNumber;

	String location;
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfTrip;
		
	double amount;
}