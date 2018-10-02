package com.jwt.service;

import java.util.List;

import com.jwt.model.Libro;

public interface LibroService {
	
	public void addLibro(Libro libro);

	public List<Libro> getAllLibros();

	public void deleteLibro(Integer libroId);

	public Libro getLibro(int libroid);

	public Libro updateLibro(Libro libro);
}
