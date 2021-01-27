package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Cliente;
import com.ferreteria.repository.IRepositoryCliente;

@Service
public class ServiceClienteImpl implements IServiceCliente
{
@Autowired
private IRepositoryCliente iRepositoryCliente;
	@Override
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return iRepositoryCliente.findAll();
	}

}
