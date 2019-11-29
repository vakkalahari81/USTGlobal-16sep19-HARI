package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.BookConfigClass;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookApp {

	public static void main(String[] args) {
		
	 ApplicationContext context =  new AnnotationConfigApplicationContext(BookConfigClass.class);
		
	 Book book =context.getBean(Book.class);
	 System.out.println(book.getName());
	 System.out.println(book.getAuthor().getName());
	 System.out.println(book.getAuthor().getPetName());
	 
	 System.out.println("**********************************");
	 Author author = context.getBean(Author.class);
	 System.out.println(author.getName());
	 System.out.println(author.getPetName());
	}	
}
