
package com.jwt.service;

import com.jwt.dao.RolDAO;
import com.jwt.model.Rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Frank
 */
@Service
@Transactional
public class RolServiceImpl implements RolService{
    
    @Autowired
	private RolDAO rolDAO;

    @Override
    @Transactional
    public void addRol(Rol rol) {
        rolDAO.addRol(rol);
    }

    @Override
    @Transactional
    public List<Rol> getAllRoles() {
        return rolDAO.getAllRoles();
    }

    @Override
    @Transactional
    public void deleteRol(Integer rolId) {
        rolDAO.deleteRol(rolId);
    }

    @Override
    @Transactional
    public Rol getRol(int rolid) {
        return rolDAO.getRol(rolid);
    }

    @Override
    @Transactional
    public Rol updateRol(Rol rol) {
        return rolDAO.updateRol(rol);
    }
    
    public void setRolDAO(RolDAO rolDAO) {
		this.rolDAO = rolDAO;
	}
    
}
