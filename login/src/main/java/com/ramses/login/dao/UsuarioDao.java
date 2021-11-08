package com.ramses.login.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramses.login.entidades.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, String>{

	List<Usuario> findByNombre(String nombre);
}
