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
	public ResponseEntity<Book> saveBook(@RequestBody Book book)
	{
		Book saveBook = bser.saveBook(book);
		return new ResponseEntity<Book>(saveBook,HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/getBookById/{id}")
	public ResponseEntity<Object> getBookById(@PathVariable int id)
	{
		Optional<Book> book = bser.getBookById(id);
		return new ResponseEntity<Object>(book,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value = "/updateBook")
	public ResponseEntity<Book> updateBook(@RequestBody Book book)
	{
		
		Book updateBook = bser.updateBook(book);
		return new ResponseEntity<Book>(updateBook,HttpStatus.OK);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value = "/deleteBook/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id)
	{
		String msg="";
		int j=bser.deleteBook(id);
		if(j==1)
		{
			 msg= "data with id = "+id+" deleted Successfully";
		}
		else
		{
			 msg= "data with id = "+id+" not exist";
		}
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

}
