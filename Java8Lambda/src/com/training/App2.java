package com.training;
import java.util.Arrays;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("India","SriLanka","Indonesia","Bhutan");
 
//		names.forEach(value -> System.out.println(value));
//		names.forEach(System.out::println);
		for (String eachName : names) {
			System.out.println(eachName);
		}
	}

}
