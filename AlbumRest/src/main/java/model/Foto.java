package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FOTO")
public class Foto {
	
	@Id
	private Long id;
	@Column(name = "URL")
	private String url;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "FECHA_CREACION")
	private Date fechaCreacion;
	@ManyToOne
	@JoinColumn(name = "ID_ALBUM")
	private Album album;
	
	public Foto(String url, String descripcion, Date fechaCreacion) {
		super();
		this.url = url;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	

}
