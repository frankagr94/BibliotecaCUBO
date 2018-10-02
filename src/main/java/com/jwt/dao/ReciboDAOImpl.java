package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Recibo;

@Repository
public class ReciboDAOImpl implements ReciboDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addRecibo(Recibo recibo) {
		sessionFactory.getCurrentSession().saveOrUpdate(recibo);

	}

	@SuppressWarnings("unchecked")
	public List<Recibo> getAllRecibos() {

		return sessionFactory.getCurrentSession().createQuery("from recibo")
				.list();
	}

	@Override
	public void deleteRecibo(Integer reciboId) {
		Recibo recibo = (Recibo) sessionFactory.getCurrentSession().load(
				Recibo.class, reciboId);
		if (null != recibo) {
			this.sessionFactory.getCurrentSession().delete(recibo);
		}

	}

	public Recibo getRecibo(int empid) {
		return (Recibo) sessionFactory.getCurrentSession().get(
				Recibo.class, empid);
	}

	@Override
	public Recibo updateRecibo(Recibo recibo) {
		sessionFactory.getCurrentSession().update(recibo);
		return recibo;
	}

}