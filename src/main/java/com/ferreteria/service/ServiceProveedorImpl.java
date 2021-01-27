package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Proveedor;
import com.ferreteria.repository.IRepositoryProveedor;

@Service
public class ServiceProveedorImpl implements IServiceProveedor
{
	@Autowired
	private IRepositoryProveedor IRepositoryProveedor;
	@Override
	public List<Proveedor> getAllMarcas() {
		// TODO Auto-generated method stub
		return IRepositoryProveedor.findAll();
	}

}
