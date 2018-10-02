/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.service;

import com.jwt.dao.EmpresaDAO;
import com.jwt.model.Empresa;
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
public class EmpresaServiceImpl implements EmpresaService{
    
    @Autowired
	private EmpresaDAO empresaDAO;

    @Override
    @Transactional
    public void addRol(Empresa empresa) {
        empresaDAO.addEmpresa(empresa);
    }

    @Override
    @Transactional
    public List<Empresa> getAllEmpresas() {
       return empresaDAO.getAllEmpresas();
    }

    @Override
    @Transactional
    public void deleteEmpresa(Integer empresaId) {
        empresaDAO.deleteEmpresa(empresaId);
    }

    @Override
    @Transactional
    public Empresa getEmpresa(int empresaid) {
        return empresaDAO.getEmpresa(empresaid);
    }

    @Override
    @Transactional
    public Empresa updateEmpresa(Empresa empresa) {
        return empresaDAO.updateEmpresa(empresa);
    }
    
    public void setRolDAO(EmpresaDAO empresaDAO) {
		this.empresaDAO = empresaDAO;
	}
    
}
