package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javatpoint.model.Book;  
@Repository
@Transactional
public class BookRepository {
    
    //repository that extends CrudRepository  
    public interface BooksRepository extends CrudRepository<Book, Integer>  
    {  
    }   
}
