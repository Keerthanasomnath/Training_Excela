package com.example.demo.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.repo.SeminarRepository;


@Component
public class SeminarUtils {

	@Autowired
	Seminar semi;
	
	@Autowired
	Speaker speaker;
	
	@Autowired
	SeminarRepository repo;
	
	public void create() {
		semi.setSpeaker(speaker);
		
		Seminar added =repo.save(semi);
		
		if(added!=null) {
			System.out.println("One Recorded Added");
		}
	}
	
	
}
