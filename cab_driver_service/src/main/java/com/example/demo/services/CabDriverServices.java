package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CabDriver;
import com.example.demo.repo.CabDriverRepo;

@Service
public class CabDriverServices {

	private CabDriverRepo repo;
	
	@Autowired
	public CabDriverServices(CabDriverRepo repo) {
		super();
		this.repo = repo;
		
	}
	
	public List<CabDriver>findAll(){
	return repo.findAll();
	}
      
	public Optional<CabDriver>findById(int id){
		return this.repo.findById(id);
	}
	
	public CabDriver save(CabDriver entity) {
		return repo.save(entity);
	}
	
	public void remove(int id) {
		Optional<CabDriver> foundElement = repo.findById(id);
		
		if(foundElement.isPresent()) {
			repo.deleteById(id);
		}
		else {
			throw new RuntimeException("Element with "+id+"Not present");
		}
	}
}
