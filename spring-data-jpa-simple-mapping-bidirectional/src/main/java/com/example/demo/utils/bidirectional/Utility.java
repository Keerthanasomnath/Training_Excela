package com.example.demo.utils.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.ifaces.bidirectional.DoctorRepository;
import com.example.demo.ifaces.bidirectional.PatientRepository;


@Component
public class Utility {

	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;

	@Autowired
	DoctorRepository repo;
		
	@Autowired
	PatientRepository patRepo;
	
	public void create() {
	doc.setPatientList(patientList);
	
	for(Patient eachPatient : patientList) {
		eachPatient.setDoctor(doc);
		patRepo.save(eachPatient);
	}
	
	 Doctor added =repo.save(doc);
			
			if(added!=null) {
				System.out.println("One Recorded Added");
			}
		}
	public void findAll() {
		List<Doctor> doctors = repo.findAll();
		 for(Doctor eachDoctor:doctors) {
			 System.out.println("Doctor Name:="+eachDoctor.getDoctorName());
			 System.out.println("Department:="+eachDoctor.getDepartment());
			 List<Patient> patients = eachDoctor.getPatientList();
			 
			 for(Patient eachPatient: patients) {
				 System.out.println("Patient Name:="+eachPatient.getPatientName());
				 System.out.println("Phone Number:="+eachPatient.getMobileNumber());
			 }
		 }
	}
	public void findDoctorFrmPatient() {
		Patient entity = patRepo.findById(210).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
	}

	
}
