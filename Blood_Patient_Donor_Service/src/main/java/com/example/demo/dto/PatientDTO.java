package com.example.demo.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.DonorEntity;
import com.example.demo.entity.PatientEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component

public class PatientDTO {

	
	private PatientEntity patient;
	private List<DonorEntity> donor;
	
}
