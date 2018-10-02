
package com.jwt.dao;

import com.jwt.model.Libro;
import java.util.List;


public interface LibroDAO {
    
    public void addLibro(Libro libro);

	public List<Libro> getAllLibros();

	public void deleteLibro(Integer libroId);

	public Libro updateLibro(Libro libro);

	public Libro getLibro(int libroid);
}
