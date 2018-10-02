/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import com.jwt.model.InventarioLibro;
import java.util.List;

/**
 *
 * @author ely
 */
public interface InventarioLibroDAO {
    
    public void addInventarioLibro(InventarioLibro inventariolibro);

	public List<InventarioLibro> getAllInventarioLibro();

	public void deleteInventarioLibro(Integer inventariolibroId);

	public InventarioLibro updateInventarioLibro(InventarioLibro inventariolibro);

	public InventarioLibro getInventarioLibro(int inventariolibroid);
    
}
