package com.ferreteria.service;

import java.util.List;

import com.ferreteria.model.Producto;

public interface IServiceProducto 
{
	// Service, metodo para ontener todos los registros de la base de datos de la tabla productos
	public List<Producto> findAllProductoService();
	public List<Producto> findByNombreOrCodigo(String nombreProducto, String codigoBarra);
	
}
