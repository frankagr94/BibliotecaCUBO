package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.UsuarioDAO;
import com.jwt.model.Usuario;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	@Transactional
	public void addUsuario(Usuario usuario) {
		usuarioDAO.addUsuario(usuario);
	}

	@Override
	@Transactional
	public List<Usuario> getAllUsuarios() {
		return usuarioDAO.getAllUsuarios();
	}

	@Override
	@Transactional
	public void deleteUsuario(Integer usuarioId) {
		usuarioDAO.deleteUsuario(usuarioId);
	}

        @Override
        @Transactional
	public Usuario getUsuario(int empid) {
		return usuarioDAO.getUsuario(empid);
	}

        @Override
        @Transactional
	public Usuario updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDAO.updateUsuario(usuario);
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

    @Override
    public Usuario loginUsuario(String cedula) {
        return usuarioDAO.loginUsuario(cedula);
    }

}
