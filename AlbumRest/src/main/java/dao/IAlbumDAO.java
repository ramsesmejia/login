package dao;

import org.springframework.data.repository.CrudRepository;

import model.Album;

public interface IAlbumDAO extends CrudRepository<Album, Long>{

}
