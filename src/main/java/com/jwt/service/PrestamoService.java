package com.jwt.service;

import java.util.List;

import com.jwt.model.Prestamo;

public interface PrestamoService {
	
	public void addPrestamo(Prestamo prestamo);

	public List<Prestamo> getAllPrestamos();

	public void deletePrestamo(Integer prestamoId);

	public Prestamo getPrestamo(int prestamoid);

	public Prestamo updatePrestamo(Prestamo prestamo);
}
