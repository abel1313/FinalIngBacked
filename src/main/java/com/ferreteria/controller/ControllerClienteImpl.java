package com.ferreteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Cliente;
import com.ferreteria.service.IServiceCliente;
import com.ferreteria.service.ServiceClienteImpl;

@RestController
@RequestMapping("/cliente")
public class ControllerClienteImpl implements IControllerCliente{
	
	@Autowired
	private ServiceClienteImpl iServiceCliente;

	@RequestMapping(method = RequestMethod.GET)
	@Override
	public List<Cliente> getAllCLienteoC() {
		// TODO Auto-generated method stub
		return iServiceCliente.getClientes();
	}

}
