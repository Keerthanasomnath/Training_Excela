package com.training.model;
import java.util.HashSet;

public class HashSetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101,"Ram",78);
		Student shyam = new Student(102,"Shyam",78);
		Student maghesh = new Student(103,"maghesh",78);
		Student chinnamaghesh = new Student(103,"maghesh",78);
		
		HashSet<Student> set = new HashSet<>();
		
		set.add(chinnamaghesh);
		set.add(maghesh);
		set.add(shyam);
		set.add(ram);
		
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
