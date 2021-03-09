package com.ymsli.labtest.model.service;

import com.ymsli.labtest.model.dto.Book;

public interface BookStoreService {
	public void persistObjectGraph(Book book);

	public Book retrieveObjectGraph(String isbn);
}
