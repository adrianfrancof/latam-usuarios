package com.latam.usuarios.dao;

import java.util.List;

import com.latam.usuarios.modelo.Usuario;

public interface UsuarioDAO {
	
	/*
	 * Métodos del CRUD que ya existían
	 */
	public List<Usuario> getAllUsuarios();
	public Usuario findByNombreAndClave(String nombre, String clave);
	
	/*
	 * Nuevos métodos del CRUD
	 */
	public int add(Usuario usuario);
	public int update(Usuario usuario);
	public int delete(Usuario usuario);
	
}