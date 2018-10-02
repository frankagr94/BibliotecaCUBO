/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import com.jwt.model.Rol;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Frank
 */
@Repository
public class RolDAOImpl implements RolDAO{
    
    @Autowired
	private SessionFactory sessionFactory;

    @Override
    public void addRol(Rol rol) {
        sessionFactory.getCurrentSession().saveOrUpdate(rol);
    }

    @SuppressWarnings("unchecked")
    public List<Rol> getAllRoles() {
        return sessionFactory.getCurrentSession().createQuery("from Rol").list();//posible error
    }

    @Override
    public void deleteRol(Integer rolId) {
        Rol rol = (Rol) sessionFactory.getCurrentSession().load(
				Rol.class, rolId);
		if (null != rol) {
			this.sessionFactory.getCurrentSession().delete(rol);
		}
    }

    @Override
    public Rol updateRol(Rol rol) {
        sessionFactory.getCurrentSession().update(rol);
		return rol;
    }

    @Override
    public Rol getRol(int rolid) {
        return (Rol) sessionFactory.getCurrentSession().get(
				Rol.class, rolid);
    }
    
}
