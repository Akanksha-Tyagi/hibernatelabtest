package com.ymsli.labtest.web;

import java.util.ArrayList;
import java.util.List;

import com.ymsli.labtest.model.dto.Book;
import com.ymsli.labtest.model.dto.Chapter;
import com.ymsli.labtest.model.dto.Publisher;
import com.ymsli.labtest.model.service.BookStoreService;
import com.ymsli.labtest.model.service.BookStoreServiceImpl;

public class BookController {

	public static void main(String[] args) {
		BookStoreService bookStoreService = new BookStoreServiceImpl();

		//persisting object graph
		Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

		Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);

	List<Chapter> chapters = new ArrayList<Chapter>();
		Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
		chapters.add(chapter1);
		Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
	chapters.add(chapter2);


		bookStoreService.persistObjectGraph(book);


	}

}
