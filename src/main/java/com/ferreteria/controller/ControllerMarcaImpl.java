package com.ferreteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Marca;

import com.ferreteria.service.ServiceMarcaImpl;

@RestController
@RequestMapping("/marca")
public class ControllerMarcaImpl implements IControllerMarca
{
	@Autowired
	private ServiceMarcaImpl IServiceMarca;
	
	@RequestMapping(method = RequestMethod.GET)
	@Override
	public List<Marca> controllerGetAllMarcas() {
		return IServiceMarca.getAllMarcas();
	}

}
