package com.yash.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Book;
import com.yash.repository.BookRepository;

@Service
public class BookServiceImpl implements BookServiceI {

	@Autowired
	BookRepository brepo;

	@Override
	public List<Book> getAllBooks() {
		List<Book> blist = new ArrayList<Book>();
		try {
			blist = brepo.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return blist;
	}

	@Override
	public Book saveBook(Book book) {
		Book b1 = new Book();

		try {
			b1 = brepo.save(book);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return b1;
	}

	@Override
	public Optional<Book> getBookById(int id) {
		Optional<Book> b2 = Optional.empty();
		try {
			b2 = brepo.findById(id);
		} catch (Exception e) {

		}
		return b2;
	}

	@Override
	public Book updateBook(Book book) {
		Book b3 = new Book();
		try {
			b3 = brepo.save(book);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

		return b3;

	}

	@Override
	public String deleteBook(int id) {

		try {
			if (id != 0) {
				brepo.deleteById(id);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "book whose id " + id + " is not  present";
		}

		return "book whose id " + id + " is  deleted successfully..";
	}

}
