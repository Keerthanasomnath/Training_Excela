package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

@Entity
@Table(name = "Kee_Trip_Details")
public class TripDetailsEnitity {
	@Id
	@Column(name="trip_Id")
	int tripId;
	
     @Id
	@Column(name="driver_Id")
	int driverId;
	
	@Column(name="mobile_number")
	long mobileNumber;
	

	@Column(name="location")
	String location;
	
	@Column(name="date_of_birth")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfBirth;
	
	@Column(name="amount")
	double amount;
}
