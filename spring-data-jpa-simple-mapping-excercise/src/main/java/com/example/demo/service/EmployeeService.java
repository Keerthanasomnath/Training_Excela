package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employees;
import com.example.demo.repo.EmployeesRepository;

@Service
public class EmployeeService {

	private EmployeesRepository repo;

	@Autowired
	public EmployeeService(EmployeesRepository repo) {
		super();
		this.repo= repo;
	}
	public Employees add(Employees entity) {
		return this.repo.save(entity);
	}
	public List<Employees> findAll(){
		return this.repo.findAll();
	}
	public List<Employees> findByDateOfBirth(LocalDate of) {
		// TODO Auto-generated method stub
		return this.repo.findByDateOfBirth(of);
	}
	public List<Employees> findByLocation(String loc){
		return this.repo.findByLocation(loc);
	}
	
	public List<Employees>findByLocationAndSkillSet(String loc , String skil){
		return this.repo.findByLocationAndSkillSet(loc, skil);
	}
}
