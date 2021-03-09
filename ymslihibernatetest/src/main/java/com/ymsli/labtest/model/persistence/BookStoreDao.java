package com.ymsli.labtest.model.persistence;

import com.ymsli.labtest.model.dto.Book;

public interface BookStoreDao {
	public void persistObjectGraph(Book book);

	public Book retrieveObjectGraph(String isbn);
}
