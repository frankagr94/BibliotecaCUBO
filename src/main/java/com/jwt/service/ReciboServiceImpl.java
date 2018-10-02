package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ReciboDAO;
import com.jwt.model.Recibo;

@Service
@Transactional
public class ReciboServiceImpl implements ReciboService {

	@Autowired
	private ReciboDAO reciboDAO;

	@Override
	@Transactional
	public void addRecibo(Recibo recibo) {
		reciboDAO.addRecibo(recibo);
	}

	@Override
	@Transactional
	public List<Recibo> getAllRecibos() {
		return reciboDAO.getAllRecibos();
	}

	@Override
	@Transactional
	public void deleteRecibo(Integer reciboId) {
		reciboDAO.deleteRecibo(reciboId);
	}

        @Override
        @Transactional
	public Recibo getRecibo(int empid) {
		return reciboDAO.getRecibo(empid);
	}

        @Override
        @Transactional
	public Recibo updateRecibo(Recibo recibo) {
		// TODO Auto-generated method stub
		return reciboDAO.updateRecibo(recibo);
	}

	public void setReciboDAO(ReciboDAO reciboDAO) {
		this.reciboDAO = reciboDAO;
	}

}
