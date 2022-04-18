package com.training;
import java.util.Collections;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookServices;
import com.training.utils.BookNameComparator;

public class Application {
  
	public static void print(List<Book> books) {
       
		for (Book eachBook:books) {
			System.out.println(eachBook);
		}
	
		books.forEach(System.out::println);
	}

	
	
	public static void main(String[] args) {
		
		
		Book java = new Book (101,"Java","Suba",450);
		Book spring = new Book (102,"Spring","Mad",550);
		Book maven = new Book (103,"Maven","Harish",650);
		Book html = new Book(104,"Html","Priya",1450);
		Book python = new Book(105,"Python","Sathya",850);
		
		CrudRepository service = new BookServices();
	
		
		
		System.out.println("Is added:="+service.add(java));
		System.out.println("Is added:="+service.add(spring));
		System.out.println("Is added:="+service.add(maven));
		System.out.println("Is added:="+service.add(html));
		System.out.println("Is added:="+service.add(python));
		
		
		
		
		List<Book> bookList1 = service.findAll();
		Collections.sort(bookList1);



		print(service.findAll());
		
		
		System.out.println("the element we need:"+service.findById(102));
		System.out.println("The object i need to be delete-"+service.remove(html));
		System.out.println("-----------------------");
		print(service.findAll());
		
		Book react = new Book (205,"ReactJS","Rahul",6850);
         service.add(react);
         print(service.findAll());
           		
         
         Book reactNew = new Book (205,"ReactJS","Rahul Kanwal",7850);
         service.update(react,reactNew);
         System.out.println("======================AFTER UPDATE===============");
         print(service.findAll());
         System.out.println( service.update(react,reactNew));
         
         System.out.println("=========================================");
         Collections.sort(bookList1);
         print(bookList1);
         
         System.out.println("=========================================");
         Collections.sort(bookList1,new BookNameComparator());
         System.out.println("Sort By BookName=========");

         print(bookList1);
         
         System.out.println("++++++++++++++++++++++++++++++++++++++++++");
 		List<Book> bookList = ((BookServices)service).getBookGrtThan(1000);
 		bookList.forEach(System.out::println);
 		System.out.println("++++++++++++++++++++++++++++++++");
         
		
         
	}
}
