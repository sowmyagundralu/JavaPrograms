package com.bookapp.client;

import java.util.Scanner;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImple;

public class UserMain {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			BookService bookservice=new BookServiceImple();
			for(int i=1;i<=2;i++)
			{
				System.out.println("Enter title");
				String title=sc.next();
				System.out.println("Enter Author");
				String author=sc.next();
				System.out.println("Enter book id");
				int id=sc.nextInt();
				Book book=new Book(title,author,id);
				bookservice.addBook(book);
				
			}
			System.out.println("books by author..............................");
			System.out.println(bookservice.getBookByAuthor("joe"));
			
			System.out.println("books by id..................................");
			System.out.println(bookservice.getBookById(1));

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
