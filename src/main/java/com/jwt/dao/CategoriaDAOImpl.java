package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Categoria;

@Repository
public class CategoriaDAOImpl implements CategoriaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addCategoria(Categoria categoria) {
		sessionFactory.getCurrentSession().saveOrUpdate(categoria);

	}

	@SuppressWarnings("unchecked")
	public List<Categoria> getAllCategorias() {

		return sessionFactory.getCurrentSession().createQuery("from Categoria")
				.list();
	}

	@Override
	public void deleteCategoria(Integer categoriaId) {
		Categoria categoria = (Categoria) sessionFactory.getCurrentSession().load(
				Categoria.class, categoriaId);
		if (null != categoria) {
			this.sessionFactory.getCurrentSession().delete(categoria);
		}

	}

	public Categoria getCategoria(int empid) {
		return (Categoria) sessionFactory.getCurrentSession().get(
				Categoria.class, empid);
	}

	@Override
	public Categoria updateCategoria(Categoria categoria) {
		sessionFactory.getCurrentSession().update(categoria);
		return categoria;
	}

}