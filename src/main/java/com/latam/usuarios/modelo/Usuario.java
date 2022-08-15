package com.latam.usuarios.modelo;

//objeto que corresponde a una entidad en la base de datos
public class Usuario {
	//atributos
	private Integer idUsuario;
	private String nombre;
	private String clave;
	private Integer rut;
	private String dv;
	
	//constructor 
	public Usuario() {
		super();
	}
	//constructor con parametros
	public Usuario(Integer idUsuario, String nombre, String clave, Integer rut, String dv) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.clave = clave;
		this.rut = rut;
		this.dv = dv;
	}
	//getters y setters
	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", clave=" + clave + ", rut=" + rut + ", dv="
				+ dv + "]";
	}
}
