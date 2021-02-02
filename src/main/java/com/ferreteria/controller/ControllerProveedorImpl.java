package com.ferreteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Proveedor;
import com.ferreteria.service.IServiceProveedor;
import com.ferreteria.service.ServiceProveedorImpl;

@RestController
@RequestMapping("/proveedor")
public class ControllerProveedorImpl implements IControllerProveedor
{
	@Autowired
	private ServiceProveedorImpl serviceProveedorImpl;
	@RequestMapping(method = RequestMethod.GET)
	@Override
	public List<Proveedor> getAllProveedor() {

		return serviceProveedorImpl.getAllMarcas();
	}

}
