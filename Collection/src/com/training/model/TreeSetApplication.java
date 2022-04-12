package com.training.model;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101,"Ram",78);
		Student shyam = new Student(102,"Shyam",78);
		Student maghesh = new Student(103,"maghesh",78);
		Student chinnamaghesh = new Student(103,"maghesh",78);
		
		TreeSet<Student> set = new TreeSet<>();
		
		set.add(chinnamaghesh);
		set.add(maghesh);
		set.add(shyam);
		set.add(ram);
		
		for(Student eachStudent:set) {
			
			System.out.println(eachStudent.getFirstName());
		}
		
	}

}
