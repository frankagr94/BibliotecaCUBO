package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.EstatusEntregaDAO;
import com.jwt.model.EstatusEntrega;

@Service
@Transactional
public class EstatusEntregaServiceImpl implements EstatusEntregaService {

	@Autowired
	private EstatusEntregaDAO estatusentregaDAO;

	@Override
	@Transactional
	public void addEstatusEntrega(EstatusEntrega estatusentrega) {
		estatusentregaDAO.addEstatusEntrega(estatusentrega);
	}

	@Override
	@Transactional
	public List<EstatusEntrega> getAllEstatusEntregas() {
		return estatusentregaDAO.getAllEstatusEntregas();
	}

	@Override
	@Transactional
	public void deleteEstatusEntrega(Integer estatusentregaId) {
		estatusentregaDAO.deleteEstatusEntrega(estatusentregaId);
	}
        
        @Override
        @Transactional
	public EstatusEntrega getEstatusEntrega(int empid) {
		return estatusentregaDAO.getEstatusEntrega(empid);
	}
        
        @Override
        @Transactional
	public EstatusEntrega updateEstatusEntrega(EstatusEntrega estatusentrega) {
		// TODO Auto-generated method stub
		return estatusentregaDAO.updateEstatusEntrega(estatusentrega);
	}

	public void setEstatusEntregaDAO(EstatusEntregaDAO estatusentregaDAO) {
		this.estatusentregaDAO = estatusentregaDAO;
	}

}
