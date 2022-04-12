package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMapApplication2 {


		public static void main(String[] args) {
			Student ram = new Student (101,"Harish",650);
			Student shyam = new Student (102,"basky",68);
			Student mukesh = new Student (103,"mukesh",99);
			
			
			HashMap<Integer,Student> map = new HashMap<>();
			
		        map.put(900,ram);
		        map.put(902,shyam);
		        map.put(904, mukesh);
		        
            System.out.println(map.get(900));			
            System.out.println(map.get(902));
            System.out.println(map.get(904));			

            Set<Integer> keys = map.keySet();
            System.out.println(keys);
		
            System.out.println("===========================");
            for(Integer key:keys) {
            	System.out.println(map.get(key));
            }
            
        	System.out.println("================");
            Collection<Student> list = map.values();
            for(Student eachStudent:list) {
            	System.out.println(eachStudent);
            }
        	System.out.println("Both Key and Value");

            Set<Map.Entry<Integer,Student>> list2 = map.entrySet();
            for(Map.Entry<Integer,Student> eachEntry:list2) {
            	System.out.println(eachEntry.getKey());
            	System.out.println(eachEntry.getValue());
            }
		}
}
