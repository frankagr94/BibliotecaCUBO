/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import com.jwt.model.Empresa;
import java.util.List;

/**
 *
 * @author Frank
 */
public interface EmpresaDAO {
    
    public void addEmpresa(Empresa empresa);
        
	public List<Empresa> getAllEmpresas();
        
	public void deleteEmpresa(Integer empresaId);
        
	public Empresa updateEmpresa(Empresa empresa);
        
	public Empresa getEmpresa(int empresaid);
    
}
