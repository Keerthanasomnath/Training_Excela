package com.training.services;
import com.training.ifaces.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.training.model.Book;
import static java.util.stream.Collectors.*;

public class BookServices implements CrudRepository {

	private ArrayList<Book> bookList;
	
	
	public BookServices() {
		super();
    this.bookList= new ArrayList<>();
	}
	
	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}

	
	@Override
	public Book findById(int id) {
		Book found = null;
		for(Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
				System.out.println("found");
			}
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}


	@Override
	public Book update(Book oldBook,Book recentBook) {
		if(bookList.contains(oldBook)) {
			int idxPos=this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos, recentBook);
		}
		
		return recentBook;
		
	}
	
	
	public List<Book> getBookGrtThan(double price){
		 List<Book> grtThanList = new ArrayList<>();
		 Predicate<Double> grtThan = (value)-> value>1000.00;
		 this.bookList.forEach(book ->
		 {
			 double bookPrice = book.getPrice();
			 if(grtThan.test(bookPrice)) {
				 grtThanList.add(book);
			 }
		 });
		return grtThanList;
	}
	
}
