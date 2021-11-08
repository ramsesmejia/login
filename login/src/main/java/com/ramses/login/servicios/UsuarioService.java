package com.ramses.login.servicios;

import com.ramses.login.entidades.Usuario;

public interface UsuarioService {
	
	void altaUsuario(Usuario usuario);
	
	boolean validarUsuario(String nombre);
	
	void actulizaUsuario(Usuario usuario);
	
	Usuario obtenerUsuarioById(String id);
}
