package com.demo.serviceI;

import java.util.List;
import com.demo.model.Book;

public interface BookServiceI {
	
	public void saveBook(Book b);
	
	public List<Book> getAllBooks();
	
	public Book getBookByIsbn(String isbn);
	
	public Book getBookbyId(int id);
	
	public void deleteBook(int id);
	
	public Book loginCheck(String title);
	
	public List<Book> getPrice(double price);

}
