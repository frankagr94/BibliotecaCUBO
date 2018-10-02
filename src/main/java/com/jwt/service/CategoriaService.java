package com.jwt.service;

import java.util.List;

import com.jwt.model.Categoria;

public interface CategoriaService {
	
	public void addCategoria(Categoria categoria);

	public List<Categoria> getAllCategorias();

	public void deleteCategoria(Integer categoriaId);

	public Categoria getCategoria(int categoriaid);

	public Categoria updateCategoria(Categoria categoria);
}
