package com.yash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Book;
import com.yash.repository.BookRepository;

@Service
public class BookServiceImpl implements BookServiceI{

	@Autowired
	BookRepository brepo;
	
	@Override
	public List<Book> getAllBooks() {
		
		return brepo.findAll();
	}

	@Override
	public String saveBook(Book book) {
		brepo.save(book);
		return "data saved";
	}

	@Override
	public Optional<Book> getBookById(int id) {
		
		return brepo.findById(id);
	}

	@Override
	public void updateBook(Book book) {
		
		brepo.save(book);
		
	}

	@Override
	public void deleteBook(int id) {
		brepo.deleteById(id);
		
	}

}
