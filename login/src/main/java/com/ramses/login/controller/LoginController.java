package com.ramses.login.controller;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ramses.login.entidades.Usuario;
import com.ramses.login.servicios.UsuarioService;
import com.ramses.login.utileria.UsuarioUtil;

@Controller
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private UsuarioUtil usuarioUtil;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validaLogin(Model model, @ModelAttribute("usuario") Usuario usuario) {
		Usuario user = usuarioUtil.obtenerUsuario(usuario.getPassword(), usuario);
		if(user != null && usuarioService.validarUsuario(user.getNombre())) {
			if(usuarioUtil.validaContrasena(user.getPassword(), usuario)) {
				model.addAttribute("login", user.getLogin());
				if(user.getFechaModificacion() != null && 
						user.getFechaModificacion().compareTo(LocalDate.now()) < 0) {
					return "renovarContrasena";
				}
				return "bienvenida";
			}
		}
		return "index";
	}

	@RequestMapping(value = "/renovarContrasena", method = RequestMethod.POST)
	public String renovarContrasena(Model model, @ModelAttribute("usuario") Usuario usuario) {
		String id = (String) model.getAttribute("login");
		Usuario user = usuarioService.obtenerUsuarioById(id);
		if(user != null) {
			user.setPassword(usuarioUtil.encodePassBase64(usuario.getPassword()));
			user.setFechaModificacion(LocalDate.now().plusMonths(1));
			usuarioService.actulizaUsuario(user);
			return "bienvenida";
		}
		return "index";
	
	}

	@RequestMapping(value = "/altaUsuario", method = RequestMethod.POST)
	public String altaUsuario(Model model, @ModelAttribute("usuario") Usuario usuario) {
		String passEncrpt = usuarioUtil.encodePassBase64(usuario.getPassword());
		usuario.setPassword(passEncrpt);
		usuario.setCliente(1f);
		usuario.setFechaAlta(LocalDate.now());

		Random random = new Random();
		int i = random.nextInt(100);
		String id = "login" + i;

		usuario.setLogin(id);
		usuarioService.altaUsuario(usuario);
		
		return "index";
	}

	@RequestMapping(value = "/alta", method = RequestMethod.GET)
	public String forwardAlta(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "altaUsuario";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "index";
	}

}
