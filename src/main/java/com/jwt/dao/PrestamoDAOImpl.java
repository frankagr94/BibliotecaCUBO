package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Prestamo;

@Repository
public class PrestamoDAOImpl implements PrestamoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addPrestamo(Prestamo prestamo) {
		sessionFactory.getCurrentSession().saveOrUpdate(prestamo);

	}

	@SuppressWarnings("unchecked")
	public List<Prestamo> getAllPrestamos() {

		return sessionFactory.getCurrentSession().createQuery("from prestamo")
				.list();
	}

	@Override
	public void deletePrestamo(Integer prestamoId) {
		Prestamo prestamo = (Prestamo) sessionFactory.getCurrentSession().load(
				Prestamo.class, prestamoId);
		if (null != prestamo) {
			this.sessionFactory.getCurrentSession().delete(prestamo);
		}

	}

	public Prestamo getPrestamo(int empid) {
		return (Prestamo) sessionFactory.getCurrentSession().get(
				Prestamo.class, empid);
	}

	@Override
	public Prestamo updatePrestamo(Prestamo prestamo) {
		sessionFactory.getCurrentSession().update(prestamo);
		return prestamo;
	}

}