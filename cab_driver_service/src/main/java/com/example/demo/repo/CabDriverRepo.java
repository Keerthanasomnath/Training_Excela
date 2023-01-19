package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CabDriver;

public interface CabDriverRepo extends JpaRepository<CabDriver,Integer> {
	List<CabDriver> findByDriverName(String qryName);
}
