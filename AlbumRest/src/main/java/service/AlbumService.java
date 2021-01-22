package service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dao.IAlbumDAO;
import model.Album;
import model.Foto;

@Service
public class AlbumService {
	
	private IAlbumDAO dao;
	
	public Album getAlbumById(Long id) {
		Optional<Album> a = dao.findById(id);
		Album album = a.get();
		return album;
	}
	
	public Album crearAlbum(Album album) {
		return dao.save(album);
	}
	
	public void deleteAlbum(Long id) {
		dao.deleteById(id);
	}
	
	public Album agregarFoto(List<Foto> fotos, Long id) {
		Album a = getAlbumById(id);
		if(a != null) {
			for(Foto f : fotos) {
				a.getFotos().add(f);
			}
			return crearAlbum(a);
		}
		return null;
	}

}
