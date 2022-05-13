package com.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.model.Student;

public class StudentServices {

	private List<Student> studentsList;

	public StudentServices() {
		super();
		this.studentsList = new ArrayList<Student>();
	}
   public boolean add(Student student) {
		
		return this.studentsList.add(student);
		
	}
	
	public List<Student> getAll(){
		return this.studentsList;
	}
	
	public Optional <Student> findById(int id){
		return this.studentsList.stream().filter(e->e.getRollNumber()==id).findFirst();
	}
	
	
	 public boolean remove(int id)
	 {
		 return this.studentsList.removeIf(e->e.getRollNumber()==id);
	 }
	public Student update(Student oldValue , Student newValue) {
		int idxPos = this.studentsList.indexOf(oldValue);
		return this.studentsList.set(idxPos,newValue);
	}
}
