package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.LibroDAO;
import com.jwt.model.Libro;

@Service
@Transactional
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO libroDAO;

	@Override
	@Transactional
	public void addLibro(Libro libro) {
		libroDAO.addLibro(libro);
	}

	@Override
	@Transactional
	public List<Libro> getAllLibros() {
		return libroDAO.getAllLibros();
	}

	@Override
	@Transactional
	public void deleteLibro(Integer libroId) {
		libroDAO.deleteLibro(libroId);
	}

        @Override
        @Transactional
	public Libro getLibro(int empid) {
		return libroDAO.getLibro(empid);
	}

        @Override
        @Transactional
	public Libro updateLibro(Libro libro) {
		// TODO Auto-generated method stub
		return libroDAO.updateLibro(libro);
	}

	public void setLibroDAO(LibroDAO libroDAO) {
		this.libroDAO = libroDAO;
	}

}
