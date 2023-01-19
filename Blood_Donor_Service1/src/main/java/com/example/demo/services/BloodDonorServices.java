package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodDonor;
import com.example.demo.repo.BloodDonorRepo;

@Service
public class BloodDonorServices {
  
	@Autowired
	private BloodDonorRepo repo;

	
	public BloodDonorServices(BloodDonorRepo repo) {
		super();
		this.repo = repo;
	}

	public List<BloodDonor>findAll(){
		return this.repo.findAll();
	}
	
	public List<BloodDonor>findByBloodGroup(String bloodGroup){
		return this.repo.findByDonorBloodGroup(bloodGroup);
	}
	
	public List<BloodDonor>findByLocation(String donorPlace){
		return this.repo.findByDonorLocation(donorPlace);
	}
	
	public BloodDonor save(BloodDonor entity) {
		return this.repo.save(entity);
	}
}
