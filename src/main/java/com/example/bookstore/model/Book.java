package com.example.bookstore.model;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

public class Book {
	@Size(min = 1, max = 30)
	private String title;

	@Size(min = 1, max = 30)
	private String author;

	@NotNull
	private int year;

	@NotNull
	private String isbn;

	@NotNull
	private double price;

	public Book() {
		this.title = "title";
		this.author = "author";
		this.year = 0;
		this.isbn = "isbn";
		this.price = 0;
	}

	public Book(String title, String author, int year, String isbn, float price) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
