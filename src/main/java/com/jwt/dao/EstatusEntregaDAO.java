/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import com.jwt.model.EstatusEntrega;
import java.util.List;

/**
 *
 * @author ely
 */
public interface EstatusEntregaDAO {
    
    public void addEstatusEntrega(EstatusEntrega estatusentrega);

	public List<EstatusEntrega> getAllEstatusEntregas();

	public void deleteEstatusEntrega(Integer estatusentregaId);

	public EstatusEntrega updateEstatusEntrega(EstatusEntrega estatusentrega);

	public EstatusEntrega getEstatusEntrega(int estatusentregaid);
    
}
