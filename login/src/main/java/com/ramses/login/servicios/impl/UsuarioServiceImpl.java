package com.ramses.login.servicios.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramses.login.dao.UsuarioDao;
import com.ramses.login.entidades.Usuario;
import com.ramses.login.servicios.UsuarioService;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public boolean validarUsuario(String nombre) {
		List<Usuario> listaUsuarios = usuarioDao.findByNombre(nombre);
		if(listaUsuarios != null && listaUsuarios.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void altaUsuario(Usuario usuario) {
		usuarioDao.save(usuario);
	}

	@Override
	public void actulizaUsuario(Usuario usuario) {
		usuarioDao.save(usuario);
	}

	@Override
	public Usuario obtenerUsuarioById(String id) {
		Optional<Usuario> usuario = usuarioDao.findById(id); 
		return usuario.isPresent() ? usuario.get() : null;
	}	

}
