package com.training.services;
import com.training.ifaces.*;
import java.util.ArrayList;
import java.util.List;

import com.training.model.Book;

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
	
}
