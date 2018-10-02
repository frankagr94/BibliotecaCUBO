package com.jwt.service;

import java.util.List;

import com.jwt.model.EstatusEntrega;

public interface EstatusEntregaService {
	
	public void addEstatusEntrega(EstatusEntrega estatusentrega);

	public List<EstatusEntrega> getAllEstatusEntregas();

	public void deleteEstatusEntrega(Integer estatusentregaId);

	public EstatusEntrega getEstatusEntrega(int estatusentregaid);

	public EstatusEntrega updateEstatusEntrega(EstatusEntrega estatusentrega);
}
