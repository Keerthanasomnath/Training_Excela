package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BloodDonor;
import com.example.demo.services.BloodDonorServices;

@RestController
@RequestMapping(path="api/v1/donors")
public class BloodDonorController {
	
	@Autowired
	private BloodDonorServices services;
	
	@PostMapping
	public BloodDonor add(@RequestBody BloodDonor entity) {
		return this.services.save(entity);
	}
	 @GetMapping
	 public List<BloodDonor> findAll(){
		 return this.services.findAll();
	 } 
	 @GetMapping(path="/srch/location/{bldlocation}")
		 public List<BloodDonor> findByDonorLocation(@PathVariable("bldlocation")String bldlocation) { 
		   return this.services.findByLocation(bldlocation);
		 
	 }
	 
	 @GetMapping(path="/srch/bloodgroup/{bldgroup}")
	 public List<BloodDonor> findByDonorBlGroup(@PathVariable("bldgroup")String bldonorgroup){
		 return this.services.findByBloodGroup(bldonorgroup);
	 }
	 
	 
	 

}
