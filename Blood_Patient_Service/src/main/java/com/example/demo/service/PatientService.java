package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PatientDetails;
import com.example.demo.repo.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repo;

	@Autowired
	public PatientService(PatientRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<PatientDetails> findAll(){
		return this.repo.findAll();
		
	}
	
	public PatientDetails save(PatientDetails entity){
		return this.repo.save(entity);
	}
	
	public List<PatientDetails> findByLocation(String patientlocation){
		return this.repo.findByPatientLocation(patientlocation);
	}
	
	public void remove(int id) {
		Optional <PatientDetails> foundElement = repo.findById(id);{
			if(foundElement.isPresent()) {
				repo.deleteById(id);
			}
			else {
				throw new RuntimeException("Element with "+id+"Not present");
			}
		}
	}

	public List<PatientDetails> findByPatientBloodGroup(String patientgroup) {
          return this.repo.findByPatientBloodGroup(patientgroup);
	}
}
