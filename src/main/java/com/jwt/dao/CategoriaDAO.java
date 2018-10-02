
package com.jwt.dao;

import com.jwt.model.Categoria;
import java.util.List;

public interface CategoriaDAO {
    
    
    public void addCategoria(Categoria categoria);

	public List<Categoria> getAllCategorias();

	public void deleteCategoria(Integer categoriaId);

	public Categoria updateCategoria(Categoria categoria);

	public Categoria getCategoria(int categoriaid);
}
