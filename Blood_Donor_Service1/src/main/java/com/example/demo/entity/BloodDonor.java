package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jboss.logging.Logger.Level;
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
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name="kee1_blood_donor")

public class BloodDonor {
	
	@Id
	@Column(name="donor_id")
	int donorId;
	
	@Column(name="donor_name")
	String donorName;
	
	@Column(name="donor_location")
	String donorLocation;
	
	@Column(name="donor_number")
	long donorNumber;
	
	@Column(name="donor_bloodgroup")
	String donorBloodGroup;
	
	@Column(name="donor_date_of_birth")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate donorDateOfBirth;
	
	@Column(name="donor_blood_availablity")
	String donorBloodAvailabilty;

	

}
