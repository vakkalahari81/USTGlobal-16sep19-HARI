package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class BookConfigClass {

	
	@Bean(name = "book")
	//@Scope("prototype")
	public Book getBook() {
		
		Book book = new Book();
		book.setAuthor(getAuthor());
		book.setName("java");
		book.setPrice(1200);	
		return book;
	}
	@Bean(name = "author")
	
	public Author getAuthor() {
		Author author =  new Author();
		author.setName("hari");
		author.setPetName("bittu");
		return author;
	}
}
