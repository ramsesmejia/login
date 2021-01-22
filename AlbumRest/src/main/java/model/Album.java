package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ALBUM")
public class Album {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "FECHA_CREACION")
	private Date fechaCreacion;
	@OneToMany
	private List<Foto> fotos;
	
	public Album(String nombre, Date fechaCreacion, List<Foto> fotos) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.fotos = fotos;
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public List<Foto> getFotos() {
		return fotos;
	}
	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

}
