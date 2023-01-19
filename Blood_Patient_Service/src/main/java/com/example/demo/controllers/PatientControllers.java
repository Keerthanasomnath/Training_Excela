package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PatientDetails;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping(path="/api/v1/bloodpatient")
public class PatientControllers {

	@Autowired
	private PatientService service;

	
	
	
	@PostMapping(path="/add")
	public PatientDetails add(@RequestBody PatientDetails entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<PatientDetails> findAll(){
		return this.service.findAll();
	}
	
	
	@GetMapping(path="/srch/location/{patientlocation}")
	public List<PatientDetails> findByPatientLocation(@PathVariable("patientlocation")String patientlocation){
		return this.service.findByLocation(patientlocation);
		
	}
	
	@GetMapping(path="/srch/bloodgroup/{bloodgroup}")
	public List<PatientDetails> findByPatientBloodGroup(@PathVariable("bloodgroup")String bloodgroup){
		return this.service.findByPatientBloodGroup(bloodgroup);
		
	}
	
	
	
}
