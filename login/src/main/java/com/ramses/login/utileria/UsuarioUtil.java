package com.ramses.login.utileria;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramses.login.dao.UsuarioDao;
import com.ramses.login.entidades.Usuario;

@Component
public class UsuarioUtil {
	
	@Autowired
	private UsuarioDao usuarioDao;

	public String encodePassBase64(String password) {
		byte[] passwordEncode = Base64.getEncoder().encode(password.getBytes());
		return new String(passwordEncode);
	}
	
	public String decodePassBase64(String passwordEncode) {
		byte[] passwordDecode = Base64.getDecoder().decode(passwordEncode.getBytes());
		return new String(passwordDecode);
	}
	
	public boolean validaContrasena(String password, Usuario usuario) {
		List<Usuario> listaUsuarios = usuarioDao.findByNombre(usuario.getNombre());
		if(listaUsuarios != null && !listaUsuarios.isEmpty()) {
			for(Usuario user : listaUsuarios) {
				String passGuardado = decodePassBase64(user.getPassword());
				String passIngresado = decodePassBase64(password);
				if(passIngresado.equals(passGuardado)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Usuario obtenerUsuario(String password, Usuario usuario) {
		List<Usuario> listaUsuarios = usuarioDao.findByNombre(usuario.getNombre());
		if(listaUsuarios != null && !listaUsuarios.isEmpty()) {
			for(Usuario user : listaUsuarios) {
				String passGuardado = decodePassBase64(user.getPassword());
				if(password.equals(passGuardado)) {
					return user;
				}
			}
		}
		return null;
	}
}
