package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.Insurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.ifaces.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	InsuranceRepository<Insurance> repo;
	
	@Autowired
	HealthInsurance entity;
	
	@Autowired
	LifeInsurance entity1; 
	
	public void addHealthPolicy() {
		Object obj = repo.save(entity);
		if(obj!=null) {
			System.out.println("One Record Added");
		}
	}
	
	public void getHealthPolicy() {
		repo.findAll().forEach(System.out::println);
	}
	
	public void addLifeInsurancePolicy() {
		Object obj = repo.save(entity1);
		if(obj!=null) {
			System.out.println("One Record Added");
		}
	}
	
	public void getLifeInsurancePolicy() {
		repo.findAll().forEach(System.out::println);
	}
}
