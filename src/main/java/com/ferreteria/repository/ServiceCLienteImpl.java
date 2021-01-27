package com.ferreteria.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Cliente;
import com.ferreteria.service.IServiceCliente;

@Service
public class ServiceCLienteImpl implements IServiceCliente
{
	@Autowired
	private IRepositoryCliente iRepositoryCliente;

	@Override
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return iRepositoryCliente.findAll();
	}

}
