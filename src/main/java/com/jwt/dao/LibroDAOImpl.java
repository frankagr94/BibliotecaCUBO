package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Libro;

@Repository
public class LibroDAOImpl implements LibroDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addLibro(Libro libro) {
		sessionFactory.getCurrentSession().saveOrUpdate(libro);

	}

	@SuppressWarnings("unchecked")
	public List<Libro> getAllLibros() {

		return sessionFactory.getCurrentSession().createQuery("from libro")
				.list();
	}

	@Override
	public void deleteLibro(Integer libroId) {
		Libro libro = (Libro) sessionFactory.getCurrentSession().load(
				Libro.class, libroId);
		if (null != libro) {
			this.sessionFactory.getCurrentSession().delete(libro);
		}

	}

	public Libro getLibro(int empid) {
		return (Libro) sessionFactory.getCurrentSession().get(
				Libro.class, empid);
	}

	@Override
	public Libro updateLibro(Libro libro) {
		sessionFactory.getCurrentSession().update(libro);
		return libro;
	}

}