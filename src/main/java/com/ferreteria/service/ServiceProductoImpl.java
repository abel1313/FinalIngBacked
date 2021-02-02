package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Producto;
import com.ferreteria.repository.IRepositoryProducto;

@Service
public class ServiceProductoImpl implements IServiceProducto
{
	@Autowired
	private IRepositoryProducto iRepositoryProducto;
	@Override
	public List<Producto> findAllProductoService() 
	{
		return iRepositoryProducto.findAll();
	}
	@Override
	public List<Producto> findByNombreOrCodigo(String nombreProducto, String codigoBarra) {
		return iRepositoryProducto.findBynombreProductoOrCodigoBarrasProducto(nombreProducto, codigoBarra);
	}

}
