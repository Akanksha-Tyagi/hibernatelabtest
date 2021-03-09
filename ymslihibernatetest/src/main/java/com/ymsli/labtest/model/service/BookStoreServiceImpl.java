package com.ymsli.labtest.model.service;

import com.ymsli.labtest.model.dto.Book;
import com.ymsli.labtest.model.persistence.BookStoreDao;
import com.ymsli.labtest.model.persistence.BookStoreDaoImpl;

public class BookStoreServiceImpl implements BookStoreService {

	private BookStoreDao bookStoreDao;

	public BookStoreServiceImpl() {
		this.bookStoreDao = new BookStoreDaoImpl();
	}

	@Override
	public void persistObjectGraph(Book book) {
		bookStoreDao.persistObjectGraph(book);
	}

	@Override
	public Book retrieveObjectGraph(String isbn) {
		return bookStoreDao.retrieveObjectGraph(isbn);

	}

}
