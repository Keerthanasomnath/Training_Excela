package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BloodDonor;

public interface BloodDonorRepo extends JpaRepository<BloodDonor, Integer> {
  List<BloodDonor> findByDonorLocation(String donorPlace);
  List<BloodDonor> findByDonorBloodGroup(String bloodGroup);
}
