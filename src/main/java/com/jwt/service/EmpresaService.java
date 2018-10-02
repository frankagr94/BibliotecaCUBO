/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.service;

import com.jwt.model.Empresa;
import java.util.List;

/**
 *
 * @author Frank
 */
public interface EmpresaService {
    
    public void addRol(Empresa empresa);

	public List<Empresa> getAllEmpresas();

	public void deleteEmpresa(Integer empresaId);

	public Empresa getEmpresa(int empresaid);

	public Empresa updateEmpresa(Empresa empresa);
    
}
