package com.coursecube.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursecube.spring.dao.BookDAO;
import com.coursecube.spring.entity.Book;
import com.coursecube.spring.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDAO bookDAO;
	
	@Override
	public List<Book> getAllBooks() {
	System.out.println("-----BookServiceImpl--getAllBooks()---------");
	return bookDAO.getAllBooks();
	}
	
	@Override
	public Book getBookById(Integer bid) {
	System.out.println("-----BookServiceImpl--getBookById()---------");
	return bookDAO.getBookById(bid);
	}
	
	@Override
	public void addBook(Book book) {
	System.out.println("-----BookServiceImpl--addBook()---------");
	bookDAO.addBook(book);
	}
	
	@Override
	public void updateBook(Book book) {
	System.out.println("-----BookServiceImpl--updateBook()---------");
	bookDAO.updateBook(book);
	}
	
	@Override
	public void deleteBook(Integer bid) {
	System.out.println("-----BookServiceImpl--deleteBook()---------");
	bookDAO.deleteBook(bid);
	}

}
