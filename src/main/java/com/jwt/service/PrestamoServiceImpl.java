package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.PrestamoDAO;
import com.jwt.model.Prestamo;

@Service
@Transactional
public class PrestamoServiceImpl implements PrestamoService {

	@Autowired
	private PrestamoDAO prestamoDAO;

	@Override
	@Transactional
	public void addPrestamo(Prestamo prestamo) {
		prestamoDAO.addPrestamo(prestamo);
	}

	@Override
	@Transactional
	public List<Prestamo> getAllPrestamos() {
		return prestamoDAO.getAllPrestamos();
	}

	@Override
	@Transactional
	public void deletePrestamo(Integer prestamoId) {
		prestamoDAO.deletePrestamo(prestamoId);
	}

        @Override
        @Transactional
	public Prestamo getPrestamo(int empid) {
		return prestamoDAO.getPrestamo(empid);
	}

        @Override
        @Transactional
	public Prestamo updatePrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return prestamoDAO.updatePrestamo(prestamo);
	}

	public void setPrestamoDAO(PrestamoDAO prestamoDAO) {
		this.prestamoDAO = prestamoDAO;
	}

}
    