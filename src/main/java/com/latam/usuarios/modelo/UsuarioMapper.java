package com.latam.usuarios.modelo;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//objeto que si finalidad es setear los valores de la consulta mediante la implementacion de la interfaz RowMapper
//realiza un mapeo de las filas de la base datos
public class UsuarioMapper implements RowMapper<Usuario> {
	
	//metodo para asignar los valores al Objeto entidad mediante el ResultSet
	
	public Usuario mapRow(ResultSet resultSet, int i) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(resultSet.getInt("id_usuario"));
		usuario.setNombre(resultSet.getString("nombre"));
		usuario.setClave(resultSet.getString("clave"));
		usuario.setRut(resultSet.getInt("rut"));
		usuario.setDv(resultSet.getString("dv"));
		return usuario;
	}
}
