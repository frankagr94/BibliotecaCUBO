/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import com.jwt.model.Empresa;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Frank
 */
@Repository
public class EmpresaDAOImpl implements EmpresaDAO{
    
    @Autowired
	private SessionFactory sessionFactory;

    @Override
    public void addEmpresa(Empresa empresa) {
        sessionFactory.getCurrentSession().saveOrUpdate(empresa);
    }

    @SuppressWarnings("unchecked")
    public List<Empresa> getAllEmpresas() {
        return sessionFactory.getCurrentSession().createQuery("from Empresa").list();//posible error
    }

    @Override
    public void deleteEmpresa(Integer empresaId) {
       Empresa empresa = (Empresa) sessionFactory.getCurrentSession().load(
				Empresa.class, empresaId);
		if (null != empresa) {
			this.sessionFactory.getCurrentSession().delete(empresa);
		}
    }

    @Override
    public Empresa updateEmpresa(Empresa empresa) {
        sessionFactory.getCurrentSession().update(empresa);
		return empresa;
    }

    @Override
    public Empresa getEmpresa(int empresaid) {
       return (Empresa) sessionFactory.getCurrentSession().get(
				Empresa.class, empresaid);
    }
    
}
