package com.javatpoint.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.javatpoint.model.Book;  
import com.javatpoint.service.booksService;  

@RestController
public class BooksController{

    @Autowired
    booksService booksservice;


    @GetMapping("/book")  
    private List<Book> getAllBooks()   
    {  
        return booksService.getAllBooks();  
    }  

    @GetMapping("/book/{bookId}")  
    private Book getBooks(@PathVariable("bookId") int bookid)   
    {  
        return booksService.getBooksById(bookid);  
    }  

    @DeleteMapping("/book/{bookId}")  
    private void deleteBook(@PathVariable("bookId") int bookid)   
    {  
        booksService.delete(bookid);  
    }  

    @PostMapping("/book")  
    private int saveBook(@RequestBody Book books)   
    {  
        booksService.saveOrUpdate(books);  
        return books.getBookId();
    }  

    @PutMapping("/book")  
    private Book update(@RequestBody Book books)   
    {  
        booksService.saveOrUpdate(books);  
        return books;  
    }  



}