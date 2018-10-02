package com.jwt.service;

import java.util.List;

import com.jwt.model.InventarioLibro;

public interface InventarioLibroService {
	
	public void addInventarioLibro(InventarioLibro inventariolibro);

	public List<InventarioLibro> getAllInventarioLibros();

	public void deleteInventarioLibro(Integer inventariolibroId);

	public InventarioLibro getInventarioLibro(int inventariolibroid);

	public InventarioLibro updateInventarioLibro(InventarioLibro inventariolibro);
}
