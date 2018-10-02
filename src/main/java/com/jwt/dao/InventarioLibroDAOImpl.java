package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.InventarioLibro;

@Repository
public class InventarioLibroDAOImpl implements InventarioLibroDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addInventarioLibro(InventarioLibro inventariolibro) {
		sessionFactory.getCurrentSession().saveOrUpdate(inventariolibro);

	}
        @SuppressWarnings("unchecked")
        public List<InventarioLibro> getAllInventarioLibro() {

		return sessionFactory.getCurrentSession().createQuery("from inventariolibro")
				.list();
	}

	@Override
	public void deleteInventarioLibro(Integer inventariolibroId) {
		InventarioLibro inventariolibro = (InventarioLibro) sessionFactory.getCurrentSession().load(
				InventarioLibro.class, inventariolibroId);
		if (null != inventariolibro) {
			this.sessionFactory.getCurrentSession().delete(inventariolibro);
		}

	}

	public InventarioLibro getInventarioLibro(int empid) {
		return (InventarioLibro) sessionFactory.getCurrentSession().get(
				InventarioLibro.class, empid);
	}

	@Override
	public InventarioLibro updateInventarioLibro(InventarioLibro inventariolibro) {
		sessionFactory.getCurrentSession().update(inventariolibro);
		return inventariolibro;
	}

   

   

}