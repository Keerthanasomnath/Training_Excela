package com.training;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.*;

import com.training.model.Book;

public class UsingStreams {

	public static void useDistinct(List<Book> bookList) {
	 bookList.stream().distinct().forEach(System.out::println);
	}
	
	public static void collectToSet(List<Book>bookList) {
		Set<Book> bookSet = bookList.stream().filter(e->e.getPrice()>500).collect(toSet());
	}
	
	public static void collectToMap(List<Book>bookList) {
		Map<String,Double> values = bookList.stream().
				filter(e->e.getPrice()>500).collect(toMap(Book::getBookName,Book::getPrice));
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
		
		useDistinct(bookList);
		
	}
}
