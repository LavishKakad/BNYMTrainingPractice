package com.yash.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Book;
import com.yash.service.BookServiceI;

@RestController
public class BookController {
	
	@Autowired
	BookServiceI bser;
	
	@RequestMapping(method = RequestMethod.GET, value = "/getAllBooks")
	public ResponseEntity<List<Book>> getAllBook()
	{
		//System.out.println(bser.getAllBooks());
		 List<Book> allBooks = bser.getAllBooks();
		 return new ResponseEntity<List<Book>>(allBooks,HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/saveBook")
	public ResponseEntity<String> saveBook(@RequestBody Book book)
	{
		bser.saveBook(book);
		String msg="Book Inserted successfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/getBookById/{id}")
	public ResponseEntity<Object> getBookById(@PathVariable int id)
	{
		Optional<Book> book = bser.getBookById(id);
		return new ResponseEntity<Object>(book,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value = "/updateBook")
	public ResponseEntity<String> updateBook(@RequestBody Book book)
	{
		
		bser.updateBook(book);
		String msg="Book data with id = "+book.getBid()+" updated Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value = "/deleteBook/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id)
	{
		bser.deleteBook(id);
		String msg= "data with id = "+id+" deleted Successfully";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

}
