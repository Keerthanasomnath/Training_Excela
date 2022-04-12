package com.training.Book_new;

public class BooksMyChoice {

	private String bookName;
	private String author;
	private int price;
	
	public BooksMyChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BooksMyChoice(String bookName, String author, int price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BooksMyChoice [bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}

	


	

	
	


	
}