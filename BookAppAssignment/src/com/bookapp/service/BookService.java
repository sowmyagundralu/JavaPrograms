package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface BookService {
	
    void addBook(Book book);
    List<Book> getBookByAuthor(String author) throws BookNotFoundException;
    Book getBookById(int id)throws BookNotFoundException;
}
