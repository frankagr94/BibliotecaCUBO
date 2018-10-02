package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.CategoriaDAO;
import com.jwt.model.Categoria;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaDAO categoriaDAO;

	@Override
	@Transactional
	public void addCategoria(Categoria categoria) {
		categoriaDAO.addCategoria(categoria);
	}

	@Override
	@Transactional
	public List<Categoria> getAllCategorias() {
		return categoriaDAO.getAllCategorias();
	}

	@Override
	@Transactional
	public void deleteCategoria(Integer categoriaId) {
		categoriaDAO.deleteCategoria(categoriaId);
	}
        
        @Override
        @Transactional
	public Categoria getCategoria(int empid) {
		return categoriaDAO.getCategoria(empid);
	}

        @Override
        @Transactional
	public Categoria updateCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDAO.updateCategoria(categoria);
	}

	public void setCategoriaDAO(CategoriaDAO categoriaDAO) {
		this.categoriaDAO = categoriaDAO;
	}

}
