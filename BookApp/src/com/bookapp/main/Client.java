package com.bookapp.main;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImp1;
import com.bookapp.service.IBookService;

public class Client  {

	public static void main(String[] args) {
		IBookService ibookservice = new BookServiceImp1();
		Book[] book=ibookservice.getAll();
		System.out.println("All book details-------------------");
		for(Book book1:book)
		{
			System.out.println(book1);
		}
		Book[] bookA=ibookservice.getByAuthor("kathy");
		System.out.println("Get by Author details------------------");
		for(Book book1:bookA)
		{
			System.out.println(book1);
		}
		System.out.println(ibookservice.getById(1));
		Book[] bookCategory=ibookservice.getByCategory("tech");
		System.out.println("Get by Category details---------------- ");
		for(Book bookC:bookCategory)
		{
			System.out.println(bookC);
		}
	}

}
