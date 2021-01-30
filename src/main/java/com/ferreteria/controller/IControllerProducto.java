package com.ferreteria.controller;

import java.util.List;

import com.ferreteria.model.Producto;

public interface IControllerProducto 
{
	
	// Método que permite obtener los productos y enviarlos al cliente 
	public List<Producto> getOneProductoController(String nombreProducto);

}
