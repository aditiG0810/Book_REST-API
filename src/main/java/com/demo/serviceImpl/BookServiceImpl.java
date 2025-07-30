package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Book;
import com.demo.repository.BookRepository;
import com.demo.serviceI.BookServiceI;

@Service
public class BookServiceImpl implements BookServiceI{
	
    @Autowired
    BookRepository br;

	@Override
	public void saveBook(Book b) {
		br.save(b);
	}

	@Override
	public List<Book> getAllBooks() {
		return (List<Book>) br.findAll();
	}
	
	@Override
	public Book getBookByIsbn(String isbn) {
		return br.findByIsbn(isbn);
	}

	@Override
	public Book getBookbyId(int id) {
		return br.findById(id).get();
	}

	@Override
	public void deleteBook(int id) {
		br.deleteById(id);
		
	}

	@Override
	public Book loginCheck(String title) {
		
		return br.findBookByTitle(title);
	}

	@Override
	public List<Book> getPrice(double price) {
		
		return br.findBookByPrice(price);
	}
	    
    
	

}
