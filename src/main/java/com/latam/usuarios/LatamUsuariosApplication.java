package com.latam.usuarios;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.latam.usuarios.modelo.Usuario;
import com.latam.usuarios.service.UsuarioService;

@SpringBootApplication
public class LatamUsuariosApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LatamUsuariosApplication.class, args);
		
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		UsuarioService svc = context.getBean(UsuarioService.class);
//		Usuario auxUsuario;

		//Imprimimos la lista para verificar que hay en la base de datos
//		printUsuarios(svc);
		
//		//Obtenemos el primer usuario de la tabla
//		auxUsuario = svc.getAllUsuarios().getUsuarios().get(0);
//		
//		//Lo eliminamos e imprimimos el mensaje del resultado que entrega el servicio
//		System.out.println(svc.delete(auxUsuario).getMensaje());
//		
//		//Modificamos un poco el usuario para transformarlo en uno nuevo
//		auxUsuario.setNombre("jperez");
//		auxUsuario.setClave("12345");
//		auxUsuario.setRut(123);
//		auxUsuario.setDv("k");
//		
//		//Llamamos al servicio e imprimos el resultado de agregar al usuario a la base de datos
//		System.out.println(svc.add(auxUsuario).getMensaje());
//
//		//Imprimimos la lista para verificar cómo va todo en la base de datos
//		printUsuarios(svc);
//
//		//Modificamos al primer usuario existente en la base de datos e imprimimos el resultado
//		auxUsuario = svc.getAllUsuarios().getUsuarios().get(0);
//		auxUsuario.setNombre("rcontreras");
//		System.out.println(svc.update(auxUsuario).getMensaje());
//
//		//Volvemos a imprimir la lista completa.
//		printUsuarios(svc);
		
//		context.close();
//		
//	}
//	
//	private static void printUsuarios(UsuarioService svc) {
//		System.out.println("Lista de usuarios- - - - - - - -");
//		for(Usuario user : svc.getAllUsuarios().getUsuarios()) {			
//			System.out.println(user);
//		}
//		System.out.println("Final de la Lista de usuarios- - - - - - - -");
	}

}
