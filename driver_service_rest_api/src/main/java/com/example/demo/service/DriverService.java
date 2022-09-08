package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.ifaces.DriverRepository;



@Service
public class DriverService {

	@Autowired
	 private DriverRepository repo;
	 

	public  List<Driver> findAll() {
		List<Driver> driverList = repo.findAll();
		 	return driverList ;
		 }


	public Driver add(Driver entity) {
	
		return this.repo.save(entity);
	}
	public Driver findById (int Id) {
		return this.repo.findById(Id).orElseThrow(()-> new RuntimeException(Id+ "Not found"));
	}


//	public  String DeleteById(int id) {
//		this.repo.deleteById(id);
//		return "Deleted";
//	}
	public void deleteById(int id) {
		
		this.repo.deleteById(id);
		
			
		}
	public Driver remove(Driver entity) {
		boolean result=this.repo.existsById(entity.getId());
		
		if(result) {
			this.repo.delete(entity);
		}
		else {
			throw new NoSuchElementException("Element with id="+entity.getId()+"Not present");
		}
		return entity;
	}
	
	public List<Driver> searchByDriverName(String srch){
		return this.repo.findByDriverName(srch);
	}
	public List<Driver> searchByMobileNumber(long number){
		return this.repo.findByMobileNumber(number);
	}
	public List<Driver> searchByDriverRating(double rating){
		return this.repo.seachByRating(rating);
	}
	public int updateRating(int id, double updatedRating){
		return this.repo.modifyRating(id,updatedRating);
	}
	public List<Driver> sortedList(String propName){
		return this.repo.findAll(Sort.by(propName));
	}
}



