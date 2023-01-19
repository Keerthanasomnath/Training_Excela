package com.example.demo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Data
@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Driver {
	int id;
	String driverName;
	long mobileNumber;
	double rating;
}
