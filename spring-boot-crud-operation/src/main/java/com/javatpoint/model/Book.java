package com.javatpoint.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity
@Table

public class Book{
    
@Id
@Column
private int bookId;
@Column
private String bookName;
@Column
private String bookAuthor;
@Column
private int bookPrice;


public int getBookId(){
    return bookId;
}
public void setBookId(final int bookid){
    this.bookId=bookid;
}

public String getBookName(){
    return bookName;
}

public void setBookName(final String name){
    this.bookName=name;
}

public String getBookAuthor(){
    return bookAuthor;
}

public void setBookAuthor(final String author){
    this.bookAuthor=author;
}

public int getBookPrice(){
    return bookPrice;
}
public void setBookprice(final int price) {
    this.bookPrice=price;
}




}