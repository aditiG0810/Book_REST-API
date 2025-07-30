package com.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;
import com.demo.serviceI.BookServiceI;

@RestController
public class BookController {
	
	@Autowired
	BookServiceI bi;
	
	@PostMapping("/getbook")
	public Book postBook(@RequestBody Book b) {
		System.out.println("In controller class...!!");
		bi.saveBook(b);
		return b;
	
	}
    @GetMapping("/getAllData")
	public List<Book> getAllRecords(){
		return bi.getAllBooks();
	}
    
    @GetMapping("/getBookByIsbn/{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn){
        return bi.getBookByIsbn(isbn);
    }
    
    @PutMapping("/update/{id}")
    public Book updateData(@PathVariable int id, @RequestBody Book b) {
    	Book singleRecord = bi.getBookbyId(id);
    	singleRecord.setId(b.getId());
    	singleRecord.setTitle(b.getAuthor());
    	singleRecord.setAuthor(b.getAuthor());
    	singleRecord.setPrice(b.getPrice());
    	singleRecord.setIsbn(b.getIsbn());
    	
    	bi.saveBook(singleRecord);
    	return singleRecord;
    }
    
    @DeleteMapping("/deleteById/{id}")
    public String deleteRecord(@PathVariable int id) {
    	bi.deleteBook(id);
    	return "Record Deleted....";
    }
    
    @GetMapping("/login/{title}")
    public Book getsingleBook(@PathVariable String title) {
    	return bi.loginCheck(title);
    }
    
    @GetMapping("/getBookbyPrice/{price}")
    public List<Book> getBookByPrice(@PathVariable double price) {
    	return bi.getPrice(price);
    }
}
