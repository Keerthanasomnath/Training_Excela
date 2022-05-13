package com.example;
import java.util.logging.*;

public class Application {
	
	public static void main(String args[]) {
		
//		Logger log = Logger.getLogger("com.example.Application");
		Logger log = Logger.getLogger("first.log");
     
		log.setLevel(Level.FINER);
		
		log.info("Info message");
		
		log.warning("Warning");
		
		log.severe("Severe message");
		
		log.finer("Hi");
//		
		System.out.println("Info message");
	}

}
