package com.jwt.service;

import java.util.List;

import com.jwt.model.Usuario;

public interface UsuarioService {
	
	public void addUsuario(Usuario usuario);

	public List<Usuario> getAllUsuarios();

	public void deleteUsuario(Integer usuarioId);
        
        public Usuario loginUsuario(String cedula);

	public Usuario getUsuario(int usuarioid);

	public Usuario updateUsuario(Usuario usuario);
}
