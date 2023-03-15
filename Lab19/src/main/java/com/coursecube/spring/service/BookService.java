package com.coursecube.spring.service;

import java.util.List;
import com.coursecube.spring.entity.Book;


public interface BookService {
	
	public List<Book> getAllBooks();
	public Book getBookById(Integer bid);
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Integer bid);
	
}
