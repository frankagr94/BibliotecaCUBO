
package com.jwt.service;

import com.jwt.model.Rol;
import java.util.List;

/**
 *
 * @author Frank
 */
public interface RolService {
    
    public void addRol(Rol rol);

	public List<Rol> getAllRoles();

	public void deleteRol(Integer rolId);

	public Rol getRol(int rolid);

	public Rol updateRol(Rol rol);
    
}
