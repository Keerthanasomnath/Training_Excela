package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails, Integer> {
 List<PatientDetails> findByPatientBloodGroup(String patientgroup);
 List<PatientDetails> findByPatientLocation(String patientlocation);

}
