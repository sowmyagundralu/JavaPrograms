package com.bookapp.service;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImp1 implements IBookService {

	@Override
	public Book[] getAll() {
		Book[] books=BookDetails.showBooks();
		return books;
	}

	@Override
	public Book[] getByAuthor(String author) {
		int count=0;
		Book[] books=BookDetails.showBooks();
		for(Book book:books)
		{
			if(book.getAuthor().equals(author))
			{
				count++;
			}
		}
		Book[] booksByAuthor=new Book[count];
		int j=0;
		for(int i=0;i<books.length;i++)
		{
			if(books[i].getAuthor().equals(author))
			{
				booksByAuthor[j]=books[i];
				j++;
			}
		}
		return booksByAuthor;
	}

	@Override
	public Book getById(int bookId) {
		
		Book[] book=BookDetails.showBooks();
		for(Book bookid:book)
		{
			if(bookid.getBookId()==bookId)
				return bookid;
			break;
		}
		return null;
	}

	@Override
	public Book[] getByCategory(String category) {
		Book[] book=BookDetails.showBooks();
		int count=0;
		for(Book book1:book)
		{
			if(book1.getCategory().equals(category))
				count++;
		}
		Book[] booksByCategory=new Book[count];
		int j=0;
		for(int i=0;i<book.length;i++)
		{
			if(book[i].getCategory().equals(category))
			{
				booksByCategory[j]=book[i];
				j++;
			}
		}
		return booksByCategory;
	}

}
