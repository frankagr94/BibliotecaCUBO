package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.EstatusEntrega;

@Repository
public class EstatusEntregaDAOImpl implements EstatusEntregaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addEstatusEntrega(EstatusEntrega estatusentrega) {
		sessionFactory.getCurrentSession().saveOrUpdate(estatusentrega);

	}

	@SuppressWarnings("unchecked")
	public List<EstatusEntrega> getAllEstatusEntregas() {

		return sessionFactory.getCurrentSession().createQuery("from estatusentrega")
				.list();
	}

	@Override
	public void deleteEstatusEntrega(Integer estatusentregaId) {
		EstatusEntrega estatusentrega = (EstatusEntrega) sessionFactory.getCurrentSession().load(
				EstatusEntrega.class, estatusentregaId);
		if (null != estatusentrega) {
			this.sessionFactory.getCurrentSession().delete(estatusentrega);
		}

	}

	public EstatusEntrega getEstatusEntrega(int empid) {
		return (EstatusEntrega) sessionFactory.getCurrentSession().get(
				EstatusEntrega.class, empid);
	}

	@Override
	public EstatusEntrega updateEstatusEntrega(EstatusEntrega estatusentrega) {
		sessionFactory.getCurrentSession().update(estatusentrega);
		return estatusentrega;
	}

}