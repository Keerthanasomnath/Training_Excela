package com.training;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.*;

import com.training.model.Book;
import com.training.services.BookService;

public class UsingStreams {

	public static void useDistinct(List<Book> bookList) {
	 bookList.stream().distinct().forEach(System.out::println);
	}
	
	public static void collectToSet(List<Book>bookList) {
		Set<Book> bookSet = bookList.stream().filter(e->e.getPrice()>500).collect(toSet());
	}
	
	public static void collectToMap(List<Book>bookList) {
//		Set<Book> bookSet1 = bookList.stream().collect(toSet());
		
		Map<String,Double> values = bookList.stream().
				filter(e->e.getPrice()>500).distinct().collect(toMap(Book::getBookName,Book::getPrice));
		
		values.forEach((key,value) -> System.out.println(key+ "," +value));
	}
	public static void findMaxPrice(List<Book>bookList) {
		Optional<Book> optional = bookList.stream().max(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
		  System.out.println("Maximum is "+optional.get().getPrice());
		}
	}
	public static void findMinPrice(List<Book>bookList) {
		Optional<Book> optional = bookList.stream().min(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
		  System.out.println("Minimum is "+optional.get().getPrice());
		}
	}
	public static void count(List<Book>bookList) {
		long  count = bookList.stream().
				filter(e->e.getBookName().contains("y")).count();
		System.out.println("Count of  y" +count);
		
	}

	
	
	public static void main(String[]args) {
		
		Book java = new Book (101,"Java","Suba",450);
		Book spring = new Book (102,"Spring","Mad",550);
		Book maven = new Book (103,"Maven","Harish",650);
		Book html = new Book(104,"Html","Priya",1450);
		Book python = new Book(105,"Python","Sathya",850);
		Book javaNew = new Book (101,"Java","Suba",450);
		Book pythonNew = new Book(105,"Python","Sathya",850);
		
		List<Book> bookList = Arrays.asList(java,spring,maven,html,python,javaNew,pythonNew);
		
		int key = 5;
		switch (key) {
		case 1:
			useDistinct(bookList);
			break;
		case 2:
			collectToMap(bookList);
			break;
		case 3:
			findMaxPrice(bookList);
			break;
		case 4:
			findMinPrice(bookList);
			break;
		case 5:
			count(bookList);
		

		default:
			break;
		}
		

		
	}
}
