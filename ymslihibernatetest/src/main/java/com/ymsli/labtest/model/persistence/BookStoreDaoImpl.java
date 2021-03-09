package com.ymsli.labtest.model.persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ymsli.labtest.exceptions.DataAccessException;
import com.ymsli.labtest.model.dto.Book;

public class BookStoreDaoImpl implements BookStoreDao {

	private SessionFactory sessionFactory;

	public BookStoreDaoImpl() {
		this.sessionFactory = HibernateSessionFactory.getSessionFactory();
	}

	@Override
	public void persistObjectGraph(Book book) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(book);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();

		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public Book retrieveObjectGraph(String isbn) {
		Book book = null;
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			book = session.get(Book.class, isbn);
			tx.commit();
		} catch (HibernateException ex) {

			tx.rollback();
			throw new DataAccessException(ex.getCause().getMessage());

		} finally {
			if (session != null)
				session.close();
		}
		return book;
	}

}
