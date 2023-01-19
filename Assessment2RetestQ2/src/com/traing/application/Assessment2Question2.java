package com.traing.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Assessment2Question2 {

	public static void main(String[] args) {
		File Fruit = new File("Fruit.txt");
	    File FileTxt = new File("File.txt");
	  try {
	      
	      FileWriter myWrite = new FileWriter("Fruit.txt");
	      myWrite.write("Apple is red in color\n"
	      		+ "Orange is round in shape\n "
	      		+ "Banana is good for health\n"
	      		+ "Grapes will grow as bunch\n"
	      		+ "Mango is a seasonal fruit\n");
	      myWrite.close();
	      
	      FileWriter myWrite1 = new FileWriter("File.txt");
	      myWrite1.write("Description");
	      myWrite1.close();
	      
	      System.out.println("Files are created successfully");
	      
	     
	      PrintWriter print = new PrintWriter("File.txt");
          
	        
	      BufferedReader buffer = new BufferedReader(new FileReader("Fruit.txt")); 
	          
	        String line = buffer.readLine();
	          
	        while (line != null)
	        {
	        	print.println(line);
	            line = buffer.readLine();
	        }
	        print.flush();
	          

	        buffer.close();
	        print.close();
	        
	           if (Fruit.delete()) {
	            System.out.println("Files are deleted successfully");
	        }
	        else {
	            System.out.println("Failed to delete the file");
	        }
	      
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }

	  }

	  }
	  
	   