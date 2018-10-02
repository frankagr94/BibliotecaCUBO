package com.jwt.dao;

import com.jwt.model.Rol;
import java.util.List;

/**
 *
 * @author Frank
 */
public interface RolDAO {
    
        public void addRol(Rol rol);
        
	public List<Rol> getAllRoles();
        
	public void deleteRol(Integer rolId);
        
	public Rol updateRol(Rol rol);
        
	public Rol getRol(int rolid); 
}

