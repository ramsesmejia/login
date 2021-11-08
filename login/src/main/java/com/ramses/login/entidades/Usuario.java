package com.ramses.login.entidades;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2127406719643243080L;

	@Id
	@Column(name = "login", unique = true)
	private String login;

	@Column(name = "password")
	private String password;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "cliente")
	private Float cliente;

	@Column(name = "email")
	private String email;

	@Column(name = "fechaAlta")
	private LocalDate fechaAlta;

	@Column(name = "fechaBaja")
	private LocalDate fechaBaja;

	@Column(name = "status")
	private char status;

	@Column(name = "intentos")
	private Float intentos;

	@Column(name = "fechaRevocado")
	private LocalDate fechaRevocado;

	@Column(name = "fechaVigencia")
	private LocalDate fechaVigencia;

	@Column(name = "noAcceso")
	private Integer noAcceso;

	@Column(name = "apellidoPaterno")
	private String apellidoPaterno;

	@Column(name = "apellidoMaterno")
	private String apellidoMaterno;

	@Column(name = "area")
	private Integer area;

	@Column(name = "fechaModificacion")
	private LocalDate fechaModificacion;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getCliente() {
		return cliente;
	}

	public void setCliente(Float cliente) {
		this.cliente = cliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Float getIntentos() {
		return intentos;
	}

	public void setIntentos(Float intentos) {
		this.intentos = intentos;
	}

	public LocalDate getFechaRevocado() {
		return fechaRevocado;
	}

	public void setFechaRevocado(LocalDate fechaRevocado) {
		this.fechaRevocado = fechaRevocado;
	}

	public LocalDate getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(LocalDate fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public Integer getNoAcceso() {
		return noAcceso;
	}

	public void setNoAcceso(Integer noAcceso) {
		this.noAcceso = noAcceso;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", email=");
		builder.append(email);
		builder.append(", fechaAlta=");
		builder.append(fechaAlta);
		builder.append(", fechaBaja=");
		builder.append(fechaBaja);
		builder.append(", status=");
		builder.append(status);
		builder.append(", intentos=");
		builder.append(intentos);
		builder.append(", fechaRevocado=");
		builder.append(fechaRevocado);
		builder.append(", fechaVigencia=");
		builder.append(fechaVigencia);
		builder.append(", noAcceso=");
		builder.append(noAcceso);
		builder.append(", apellidoPaterno=");
		builder.append(apellidoPaterno);
		builder.append(", apellidoMaterno=");
		builder.append(apellidoMaterno);
		builder.append(", area=");
		builder.append(area);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append("]");
		return builder.toString();
	}

}
