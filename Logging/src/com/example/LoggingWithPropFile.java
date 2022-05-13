package com.example;

import com.example.model.Book;


public class LoggingWithPropFile {

	public static void main(String[] args) {
String file   =	LoggingWithPropFile.class.getClassLoader().getResource("logging.properties").getFile();
		
		System.setProperty("java.util.config.file",file);
		Book.log.info("Logging Properties Done right");
		Book java = new Book();
		Book.log.info(java.toString());
	}
}
