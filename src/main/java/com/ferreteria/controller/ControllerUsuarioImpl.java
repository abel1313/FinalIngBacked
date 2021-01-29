package com.ferreteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Usuario;
import com.ferreteria.service.IServiceUsuario;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuarioImpl 
{
	@Autowired
	private IServiceUsuario iServiceUsuario;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Usuario>finAllUsuarios()
	{
		return iServiceUsuario.getAllUsuarios();
	}

}
