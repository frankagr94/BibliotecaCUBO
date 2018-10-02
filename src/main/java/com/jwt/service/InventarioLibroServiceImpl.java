package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.InventarioLibroDAO;
import com.jwt.model.InventarioLibro;

@Service
@Transactional
public class InventarioLibroServiceImpl implements InventarioLibroService {

	@Autowired
	private InventarioLibroDAO inventariolibroDAO;

	@Override
	@Transactional
	public void addInventarioLibro(InventarioLibro inventariolibro) {
		inventariolibroDAO.addInventarioLibro(inventariolibro);
	}

	@Override
	@Transactional
	public List<InventarioLibro> getAllInventarioLibros() {
		return inventariolibroDAO.getAllInventarioLibro();
	}

	@Override
	@Transactional
	public void deleteInventarioLibro(Integer inventariolibroId) {
		inventariolibroDAO.deleteInventarioLibro(inventariolibroId);
	}

        @Override
        @Transactional
	public InventarioLibro getInventarioLibro(int empid) {
		return inventariolibroDAO.getInventarioLibro(empid);
	}

        @Override
        @Transactional
	public InventarioLibro updateInventarioLibro(InventarioLibro inventariolibro) {
		// TODO Auto-generated method stub
		return inventariolibroDAO.updateInventarioLibro(inventariolibro);
	}

	public void setInventarioLibroDAO(InventarioLibroDAO inventariolibroDAO) {
		this.inventariolibroDAO = inventariolibroDAO;
	}

}
