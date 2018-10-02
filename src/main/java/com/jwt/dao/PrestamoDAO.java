/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import com.jwt.model.Prestamo;
import java.util.List;

/**
 *
 * @author ely
 */
public interface PrestamoDAO {
    
    
    public void addPrestamo(Prestamo prestamo);

	public List<Prestamo> getAllPrestamos();

	public void deletePrestamo(Integer prestamoId);

	public Prestamo updatePrestamo(Prestamo prestamo);

	public Prestamo getPrestamo(int prestamoid);
}
