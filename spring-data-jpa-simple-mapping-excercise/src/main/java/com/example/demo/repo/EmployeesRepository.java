package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employees;

public interface EmployeesRepository extends JpaRepository<Employees,Integer> {
	public List<Employees> findByDateOfBirth(LocalDate date);
	public List<Employees> findByLocation(String loc);
	
	@Query(nativeQuery = true, value= "Select * from Keert_Employees where location =:place and skill_set =:SkillSet")
	public List<Employees> findByLocationAndSkillSet(@Param("place")String Location ,@Param("SkillSet")String SkillSet);
}
