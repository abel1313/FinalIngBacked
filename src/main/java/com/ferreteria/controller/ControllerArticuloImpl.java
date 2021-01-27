package com.ferreteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Articulo;

import com.ferreteria.service.ServiceArticuloImpl;

@RestController
@RequestMapping("/articulo")
public class ControllerArticuloImpl implements IControllerArticulo
{
	@Autowired
	private ServiceArticuloImpl serviceArticulo;

	@RequestMapping(method = RequestMethod.GET)
	@Override
	public List<Articulo> getAllArticuloC() {
		// TODO Auto-generated method stub
		return serviceArticulo.getArticulos();
	}

}
