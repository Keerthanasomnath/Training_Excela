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
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name="kee2_patient_details")
public class PatientDetails {
	
	@Id
	@Column(name="patient_id")
	int patientId;
	
	@Column(name="patient_name")
	String patientName;
	
	@Column(name="patient_number")
	long patientNumber;
	
	@Column(name="patient_blood_group")
	String patientBloodGroup;
	
	@Column(name="patient_location")
	String patientLocation;
	
	@Column(name="patient_date_of_birth")
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate patientDateOfBirth;
	
	
	

}
