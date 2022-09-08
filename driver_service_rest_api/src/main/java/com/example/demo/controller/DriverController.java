package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping("/api/v1")
public class DriverController {

	private DriverService service;

	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	@GetMapping(path ="/drivers")
	public List<Driver> getAllDriver(){
		return this.service.findAll();
}
	
	@GetMapping(path ="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id")int id){
		return this.service.findById(id);
	}
//	@PostMapping(path="/drivers")
//	public Driver addDriver(@RequestBody Driver entity) {
//		return this.service.add(entity);
//	}
//	@PostMapping(path="/drivers")
//	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
//		Driver driv = this.service.add(entity);
//		return ResponseEntity.status(HttpStatus.CREATED).body(driv);
//	}
	
	@PostMapping(path="/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity){
		Driver driver = this.service.add(entity);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(entity.getId())
                .toUri();
		
		return ResponseEntity.created(location).body(driver);
	}
	
	@DeleteMapping(path="/drivers/{id}")  
	public ResponseEntity<String> deleteById(@PathVariable int id){
		
		this.service.deleteById(id);
		return ResponseEntity.ok().body("One Record Deleted "+id);
		
	}
	@DeleteMapping(path = "/drivers")
	public ResponseEntity<Object> remove(@RequestBody Driver entity){
		
		Driver result=this.service.remove(entity);
		if(result!=null) {
			return ResponseEntity.status(204).build();
			
		}
		else {
			return ResponseEntity.ok("No record Matching");
		}
	}
	@GetMapping(path ="/drivers/numsrch/{mobileNumber}")
	public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber") long number){
	return  this.service.searchByMobileNumber(number);
	
	}
	
	@GetMapping(path ="/drivers/numsrch/num/{mobileNumber}")
	public ResponseEntity<Object> getDriverByMobileNumber1(@PathVariable("mobileNumber") long number) throws Exception{
	List<Driver>list=this.service.searchByMobileNumber(number);
	if(list!=null) {
		//List<Driver>list=this.service.searchByMobileNumber(number);

		return ResponseEntity.ok(list);
	}
	else {
		 throw new Exception("No record found");
		//return ResponseEntity.status(400).body("No record found");
	}
	
	}
	
	@GetMapping(path ="/drivers/namesrch/{driverName}")
	public List<Driver> getDriverByDriverName(@PathVariable("driverName") String driverName){
		return this.service.searchByDriverName(driverName);
	}
	
	@PutMapping(path="drivers/id/rating/{id}/{rating}")
	public ResponseEntity<Object> updatedRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating)
	{
		int update=this.service.updateRating(id, updatedRating);
		return ResponseEntity.status(HttpStatus.CREATED).body("one  Record updated "+update);

	}
	@GetMapping(path="/drivers/sort/{propName}")
	public List<Driver> sortDriverByDriverName(@PathVariable("propName")String name){
		return this.service.sortedList(name);
	}
}
