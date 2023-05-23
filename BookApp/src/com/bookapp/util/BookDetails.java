package com.bookapp.util;

import com.bookapp.model.Book;

public class BookDetails {

	public static Book[] showBooks() {
		Book[] books = new Book[5];
		books[0]=new Book("java","kathy",1,900,"tech");
		books[1]=new Book("Spring in action","john",3,900,"tech");
		books[2]=new Book("life after life","robert",4,900,"fiction");
		books[3]=new Book("leadership","robin",8,900,"selfhelp");
		books[4]=new Book("java","kathy",9,900,"tech");
		return books;
	}
}
