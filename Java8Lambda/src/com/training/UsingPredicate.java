package com.training;
import java.util.function.*;
import java.util.*;

public class UsingPredicate {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("India","SriLanka","Indonesia","Bhutan");
		Predicate<String> containsChar = (country)->country.toUpperCase().startsWith("I"); 
		Consumer<String> consumer = (value)-> System.out.println(value);
		names.forEach(consumer);
		Consumer<String> consumer1 =(value)->{
			if(containsChar.test(value)) {
				System.out.println(value);
			}
		};

	}

}
