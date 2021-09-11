package com.example.kirjakauppa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String author;
	private Integer isbn;
	private String title;
	private Integer year;
	
	public Book() {}
	
	public Book( String author, Integer isbn, String title, Integer year) {
		super();
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.year = year;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", isbn=" + isbn + ", title=" + title + ", year=" + year + "]";
	}
	

}
