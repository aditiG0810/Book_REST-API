package com.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	Book findByIsbn(String isbn);


	public Book findBookByTitle(String title);

	public List<Book> findBookByPrice(double price);

}
