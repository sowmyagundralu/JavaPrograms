package com.bookapp.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImple implements BookService {

	ArrayList<Book> bookList=new ArrayList<>();
	
	
	
	@Override
	public void addBook(Book book) {
		
		bookList.add(book);
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException {
		
		List<Book> getbooks = bookList.stream()
				              .filter(book->book.getAuthor().equals(author))
				              .collect(Collectors.toList());
		if(getbooks.isEmpty())
			throw new BookNotFoundException("such a book is not found");
		
		return getbooks;
	}

	@Override
	public Book getBookById(int id) throws BookNotFoundException {
		
	
		int count=0;
		for(Book getbook:bookList)
		{
			if(getbook.getBookId()==id)
			{
				
				count++;
				return getbook;
			}
			break;
		}
		if(count==0)
			throw new BookNotFoundException("such a book is not found");
		return null;
	}

	

}
