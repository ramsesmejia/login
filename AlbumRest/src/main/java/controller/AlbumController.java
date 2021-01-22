package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Album;
import model.Foto;
import service.AlbumService;

@RestController
public class AlbumController {
	
	@Autowired
	private AlbumService service;

	@GetMapping("/album")
	public Album getAlbum() {
		List<Foto> list = new ArrayList<Foto>();
		list.add(new Foto("url", "descripcion", new Date()));
		Album a = new Album("nombre", new Date(), list);
		return a;
	}
	
	@PostMapping("/album")
	public Album crearAlbum(@RequestBody Album album) {
		return service.crearAlbum(album);
	}

	@DeleteMapping("/album/{id}")
	public void deleteAlbum(@PathVariable Long id) {
		service.deleteAlbum(id);
	}

	@PostMapping("/album/{id}")
	public Album agregarFotos(@RequestBody List<Foto> fotos, @PathVariable Long id) {
		return service.agregarFoto(fotos, id);
	}
}
