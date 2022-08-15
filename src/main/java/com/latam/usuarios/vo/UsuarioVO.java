package com.latam.usuarios.vo;

import java.util.List;

import com.latam.usuarios.modelo.Usuario;

public class UsuarioVO {
	List<Usuario> usuarios;
	String mensaje;
	String codigo;
	
	public UsuarioVO(List<Usuario> usuarios, String mensaje, String codigo) {
		super();
		this.usuarios = usuarios;
		this.mensaje = mensaje;
		this.codigo = codigo;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "UsuarioVO [mensaje=" + mensaje + ", codigo=" + codigo + "]";
	}
}
