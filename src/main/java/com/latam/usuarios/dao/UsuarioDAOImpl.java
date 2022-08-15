package com.latam.usuarios.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.latam.usuarios.modelo.Usuario;
import com.latam.usuarios.modelo.UsuarioMapper;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
	
	//@Autowired
	JdbcTemplate jdbcTemplate;
	DataSource dataSource;
	
	//@Autowired//UsuarioDAOImpl usuariDao = 
	public UsuarioDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Usuario> getAllUsuarios() {
		return jdbcTemplate.query("select * from USUARIO", new UsuarioMapper());
	}
	
	@Override
	public Usuario findByNombreAndClave(String nombre, String clave) {
		//Para ejecutar una query devolviendo un sólo registro se utiliza queryForObject
		return jdbcTemplate.queryForObject(
				//Se utilizan "?" para denotar la posición de un parámetro
				"select * from USUARIO where nombre=? and clave=?",
				//Se le pasa una implementación de RowMapper<T> (En este caso una de Usuario)
				new UsuarioMapper()
				, 
				//Se le pueden asignar parámetros al método queryForObject con un arreglo de Object
				new Object[] {nombre, clave});
	}
	
	@Override
	public int add(Usuario usuario) {
		//Para trabajar las query que insertan, actualizan o eliminan se debe tener certeza de que la operación funcionó correctamente
		//el método update de jdbcTemplate devuelve la cantidad de registros que fueron modificados eliminados o creados (dependiendo de la query que se use con el método)
		//de esta forma, podemos saber si nuestro insert funcionó correctamente.
		return jdbcTemplate.update(
				"insert into usuario values (sq_usuario.nextval, ?, ?, ?, ?)", 
				usuario.getNombre(),
				usuario.getClave(), 
				usuario.getRut(),
				usuario.getDv()
				);
	}

	@Override
	public int update(Usuario usuario) {
		
		return jdbcTemplate.update(
				"update usuario set nombre = ?, clave = ?,  rut = ?, dv = ? where id_usuario = ?", 
				usuario.getNombre(),
				usuario.getClave(), 
				usuario.getRut(),
				usuario.getDv(),
				usuario.getIdUsuario()
				);
	}

	@Override
	public int delete(Usuario usuario) {
		return jdbcTemplate.update(
				"delete from usuario where id_usuario = ?", 
				usuario.getIdUsuario()
				);
	}

}
