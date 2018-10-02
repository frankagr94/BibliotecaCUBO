package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Usuario;
import org.hibernate.Query;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addUsuario(Usuario usuario) {
		sessionFactory.getCurrentSession().saveOrUpdate(usuario);

	}

	@SuppressWarnings("unchecked")
	public List<Usuario> getAllUsuarios() {

		return sessionFactory.getCurrentSession().createQuery("from usuario")
				.list();
	}

	@Override
	public void deleteUsuario(Integer usuarioId) {
		Usuario usuario = (Usuario) sessionFactory.getCurrentSession().load(
				Usuario.class, usuarioId);
		if (null != usuario) {
			this.sessionFactory.getCurrentSession().delete(usuario);
		}

	}

	public Usuario getUsuario(int empid) {
		return (Usuario) sessionFactory.getCurrentSession().get(
				Usuario.class, empid);
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		sessionFactory.getCurrentSession().update(usuario);
		return usuario;
	}

    @Override
    public Usuario loginUsuario(String cedula) {
        Query query = sessionFactory.getCurrentSession().createSQLQuery("Select cedula, password, id_rol, nombre from Usuario where cedula = '"+cedula+"'");
        List<Object[]> rows = query.list();
        Usuario usuario = new Usuario();
        for(Object[] row : rows){ 
            usuario.setCedula(row[0].toString());
            usuario.setPassword(row[1].toString());
            usuario.setCodigorol(Integer.parseInt(row[2].toString()));
            usuario.setNombre(row[3].toString());
        }
        return usuario;
    }

}