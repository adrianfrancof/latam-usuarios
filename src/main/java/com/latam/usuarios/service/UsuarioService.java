package com.latam.usuarios.service;
import com.latam.usuarios.modelo.Usuario;
import com.latam.usuarios.vo.UsuarioVO;

public interface UsuarioService {
	
	public UsuarioVO getAllUsuarios();
	
	public UsuarioVO findByNombreAndClave(String nombre, String clave);
	
	public UsuarioVO login(String nombre, String clave);
	
	public UsuarioVO add(Usuario usuario);
	public UsuarioVO update(Usuario usuario);
	public UsuarioVO delete(Usuario usuario);
	
}