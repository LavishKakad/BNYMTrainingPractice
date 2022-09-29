package com.yash.service;

import java.util.List;
import java.util.Optional;

import com.yash.model.Book;

public interface BookServiceI {
	
	public List<Book> getAllBooks();
	
	public Book saveBook(Book book);
	
	public Optional<Book> getBookById(int id);
	
	public Book updateBook(Book book);
	
	//public int deleteBook(int id);
	
	public String deleteBook(int id);

}
