package com.bookapp.model;

public class Book {

	private String title;
	private String author;
	private Integer bookId;
	
	public Book() {
		super();
		
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, Integer bookId) {
		super();
		this.title = title;
		this.author = author;
		this.bookId = bookId;

	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookId=" + bookId + "]";
	}
	
	
	
}
