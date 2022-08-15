package com.latam.usuarios.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.latam.usuarios.dao.UsuarioDAO;
import com.latam.usuarios.modelo.Usuario;
import com.latam.usuarios.vo.UsuarioVO;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioDAO dao;

	UsuarioVO respuesta;

	@Override
	public UsuarioVO findByNombreAndClave(String nombre, String clave) {
		respuesta = new UsuarioVO(new ArrayList<Usuario>(), "Ha ocurrido un error", "101" );
		try {
			Usuario usuario = dao.findByNombreAndClave(nombre, clave);
			respuesta.getUsuarios().add(usuario);
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", null != usuario ? 1 : 0));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			/*
			 * Aqui deberiamos imprimir un error con un LOGGER, pero  como no lo hemos
			 * implementado aun, lo haremos con System.err.print
			 */
			System.err.print(e);
		}
		return respuesta;
	}
	
	@Override
	public UsuarioVO getAllUsuarios() {
		respuesta = new UsuarioVO(new ArrayList<Usuario>(), "Ha ocurrido un error", "102" );
		try {
			respuesta.setUsuarios(new ArrayList<>(dao.getAllUsuarios()));
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getUsuarios().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			/*
			 * Aqui deberiamos imprimir un error con un LOGGER, pero  como no lo hemos
			 * implementado aun, lo haremos con System.err.print
			 */
			System.err.print(e);
		}
		return respuesta;
	}

	@Override
	public UsuarioVO login(String nombre, String clave) {
		respuesta = new UsuarioVO(new ArrayList<Usuario>(), "Credenciales incorrectas", "103" );
		if(nombre.length()== 0 || clave.length()==0)
			return respuesta;
		respuesta = findByNombreAndClave(nombre, clave);
		if(respuesta.getCodigo().equals("0")) {
			respuesta.setMensaje(String.format("Bienvenido %s",respuesta.getUsuarios().get(0).getNombre()));
		}
		return respuesta;
	}

	@Override
	public UsuarioVO add(Usuario usuario) { //Unhandled exception UsuarioServi
		respuesta = new UsuarioVO(new ArrayList<Usuario>(), "Ha ocurrido un error", "104" );
		try {
			int registrosActualizados = dao.add(usuario);
			respuesta.setMensaje(registrosActualizados == 1 ? "Se ha creado el usuario correctamente" : "No se ha podido crear el usuario");
			respuesta.setCodigo(registrosActualizados == 1 ? "0" : "104");
		} catch (Exception e) {
			/*
			 * Aqui deberiamos imprimir un error con un LOGGER, pero  como no lo hemos
			 * implementado aun, lo haremos con System.err.print
			 */
			System.err.print(e);
		}
		return respuesta;
	}

	@Override
	public UsuarioVO update(Usuario usuario) {
		respuesta = new UsuarioVO(new ArrayList<Usuario>(), "Ha ocurrido un error", "105" );
		try {
			int registrosActualizados = dao.update(usuario);
			respuesta.setMensaje(String.format("Se ha/n actualizado correctamente %d usuario/s", registrosActualizados));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			/*
			 * Aqui deberiamos imprimir un error con un LOGGER, pero  como no lo hemos
			 * implementado aun, lo haremos con System.err.print
			 */
			System.err.print(e);
		}
		return respuesta;
	}

	@Override
	public UsuarioVO delete(Usuario usuario) {
		respuesta = new UsuarioVO(new ArrayList<Usuario>(), "Ha ocurrido un error", "106" );
		try {
			int registrosActualizados = dao.delete(usuario);
			respuesta.setMensaje(String.format("Se ha/n eliminado correctamente a %d usuario/s", registrosActualizados));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			/*
			 * Aqui deberiamos imprimir un error con un LOGGER, pero  como no lo hemos
			 * implementado aun, lo haremos con System.err.print
			 */
			System.err.print(e);
		}
		return respuesta;
	}

}
