package com.training;
import java.util.*;
import com.training.model.*;

public class HashMapApplication {

	public static void main(String[] args) {
		Student ram = new Student (101,"Harish",650);
		Student shyam = new Student (102,"basky",68);
		Student mukesh = new Student (103,"mukesh",99);
		
		
		HashMap<Integer,Student> map = new HashMap<>();
		
		System.out.println(map.put(900,ram));
		System.out.println(map.put(902,shyam));
		System.out.println(map.put(902,mukesh));
		
		System.out.println(map.get(902));

	}

}
