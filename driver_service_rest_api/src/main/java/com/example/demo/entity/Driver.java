package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Keer_driver_2022")
public class Driver {
	


	@Id
	@Column(name="id")
	private int id;

	@Column(name="driver_name")
	private String driverName;
	
	@Column(name="mobile_number")
	private long mobileNumber;
	
	@Column(name="rating")
	private double rating;
	
	
		

	
}
