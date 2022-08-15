package com.latam.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.latam.usuarios.service.UsuarioService;
import com.latam.usuarios.vo.UsuarioVO;

@Controller
@RequestMapping(value="/saludos", method = RequestMethod.GET)
public class HomeController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		
		UsuarioVO usuarioVo = usuarioService.getAllUsuarios();
		System.out.println(usuarioVo.getUsuarios());
		model.put("usuarioVo", usuarioVo);
		return "index";
		
	}
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String hello(ModelMap model) {
//		
//		model.put("saludo", "Hola Mundo");
//		return "hello";
//		
//	}

}
