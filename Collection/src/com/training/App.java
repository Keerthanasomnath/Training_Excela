package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    
   
    names.add("Ramesh");
    names.add("Anitha");
    names.add("Chandran");
    names.add("Somnath");
    names.add("Zahir");
    names.add("Thandaiah");
    
    System.out.println(names);
    
    Collections.sort(names);
    System.out.println(names);
	}

}
