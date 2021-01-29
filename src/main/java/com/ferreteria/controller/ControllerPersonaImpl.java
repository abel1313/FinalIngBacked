package com.ferreteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Persona;
import com.ferreteria.service.ServicePersonaImpl;

@RestController
@RequestMapping("/personas")
public class ControllerPersonaImpl 
{
	@Autowired
	private ServicePersonaImpl servicePersonaImpl;
	
	@RequestMapping(value = "/one/{name}", method = RequestMethod.GET)
	public Persona getOneUsuarioByNameUser(@PathVariable("name")String name)
	{
		return servicePersonaImpl.findByNombreUsuario(name);
	}

}
