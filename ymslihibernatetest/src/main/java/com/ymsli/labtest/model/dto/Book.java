package com.ymsli.labtest.model.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String isbn;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="publisher_code")
	private Publisher publisher;
	@OneToMany(mappedBy = "book")
	private List<Chapter> chapters;

	public Book() {
	}

	public Book(String isbn, String name, Publisher publisher) {
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
	}
	public Book(String name, Publisher publisher, List<Chapter> chapters) {
		this.name = name;
		this.publisher = publisher;
		this.chapters = chapters;
	}

	public Book(String isbn, String name, Publisher publisher, List<Chapter> chapters) {

		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.chapters = chapters;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=");
		builder.append(isbn);
		builder.append(", name=");
		builder.append(name);
		builder.append(", publisher=");
		builder.append(publisher);
		builder.append(", chapters=");
		builder.append(chapters);
		builder.append("]");
		return builder.toString();
	}

}
