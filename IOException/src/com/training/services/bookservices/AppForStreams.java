package com.training.services.bookservices;

import java.io.File;
import java.io.Serializable;

import com.training.model.Book;
import com.training.services.BookServices;

public class AppForStreams {

public static void main(String[] args) {
		
		BookServices service=new BookServices();
		
		File file=new File("Book.ser");
		int ch=2;
		if(ch==1) {
		Book book=new Book(8875,"Oracle","Harish",560);
		
		 
		boolean result=service.writeToStream(file, book);
		
		if(result) {
			System.out.println("One Record Serialized");
		}
		}
		else {
			Book fromFile=(Book) service.readFromStream(file);
			System.out.println(fromFile.getBookName());
			System.out.println(fromFile);
		}

}
}

