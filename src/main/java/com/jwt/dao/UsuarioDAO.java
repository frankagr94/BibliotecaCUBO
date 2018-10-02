package com.jwt.dao;

import java.util.List;
import com.jwt.model.Usuario;

public interface UsuarioDAO {

	public void addUsuario(Usuario usuario);

	public List<Usuario> getAllUsuarios();

	public void deleteUsuario(Integer usuarioId);
        
        public Usuario loginUsuario(String cedula);

	public Usuario updateUsuario(Usuario usuario);

	public Usuario getUsuario(int usuarioid);
}
