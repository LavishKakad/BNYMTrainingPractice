package com.yash.service;

import java.util.List;
import java.util.Optional;

import com.yash.model.Book;

public interface BookServiceI {
	
	public List<Book> getAllBooks();
	
	public String saveBook(Book book);
	
	public Optional<Book> getBookById(int id);
	
	public void updateBook(Book book);
	
	public void deleteBook(int id);

}
