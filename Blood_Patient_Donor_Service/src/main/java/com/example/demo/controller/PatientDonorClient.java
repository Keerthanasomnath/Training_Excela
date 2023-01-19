package com.example.demo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.PatientDTO;
import com.example.demo.entity.DonorEntity;
import com.example.demo.entity.PatientEntity;

@RestController
@RequestMapping(path="/donorpatient")
public class PatientDonorClient{

	@Autowired
	private PatientDTO dto;
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path="/donors")
	public String getDonors() {
		return this.template.getForObject("http://BLOOD-DONOR-SERVICE/api/v1/donors",String.class);
	}
	
	@GetMapping(path="/loc/{bldlocation}")
		public String getDonorsByLocation(@PathVariable("bldlocation")String bldlocation) {
		  return this.template.getForObject("http://BLOOD-DONOR-SERVICE/api/v1/donors/srch/"+bldlocation,String.class);
	}
	
	@GetMapping(path="/don/{bldgroup}")
	   public PatientDTO getDonorPatient(@PathVariable("bldgroup") String bldgroup) {
		
		PatientEntity patient = this.template.getForObject("http://BLOOD-PATIENT-SERVICE/api/v1/bloodpatient/srch",PatientEntity.class);  
	 DonorEntity[] donor = this.template.getForObject("http://BLOOD-DONOR-SERVICE/api/v1/donors/srch/"+bldgroup, DonorEntity[].class);
			
	 dto.setPatient(patient);
	 List<DonorEntity> donorlist= Arrays.asList(donor);
	 dto.setDonor(donorlist);
	 
	 return dto;
	}
	

}
