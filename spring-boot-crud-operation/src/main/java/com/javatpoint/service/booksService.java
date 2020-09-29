package com.javatpoint.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.javatpoint.model.Book;  
import com.javatpoint.repository.BookRepository;  


@Service
public class booksService {

@Autowired
static BookRepository bookRepository;

// getting all books record by using the method findaAll() of CrudRepository
public static List<Book> getAllBooks() {
    List<Book> books = new ArrayList<Book>();
    bookRepository.findAll().forEach(books1 -> books.add(books1));
    return books;
}

// getting a specific record by using the method findById() of CrudRepository
public static Book getBooksById(final int id) {
    return bookRepository.findById(id).get();
}

// saving a specific record by using the method save() of CrudRepository
public static void saveOrUpdate(final Book books) {
    bookRepository.save(books);
}

public static void delete(final int id) {
    bookRepository.deleteById(id);
}

// updating a record
public void update(final Book books, final int bookid) 
{  
bookRepository.save(books);  
}   

}
