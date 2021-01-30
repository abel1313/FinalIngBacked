package com.ferreteria.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ferreteria.model.Producto;
import com.ferreteria.service.IServiceProducto;

@RestController
@RequestMapping("productos")
public class ControllerProductoImpl implements IControllerProducto
{
	@Autowired
	private IServiceProducto iServiceProducto;
	
	@RequestMapping("alla")
	public List<Producto>gertAll()
	{
		System.err.println("entro");
		return iServiceProducto.findAllProductoService();
	}
	@RequestMapping(value = "/all/{nombreProducto}",method = RequestMethod.GET)
	@Override
	public List<Producto> getOneProductoController(@PathVariable("nombreProducto")String nombreProducto) 
	{
		System.err.println("---------------------------------------------------------------------------" +nombreProducto.getClass() +" ");
		
		if( nombreProducto.equals("") )
		{

			System.err.println(nombreProducto + " Entro primer if ");
			return iServiceProducto.findAllProductoService();
			
		}
			System.err.println(nombreProducto + " Segundo of ");
			return iServiceProducto.findByNombreOrCodigo(nombreProducto, nombreProducto);
			
			
	}

}
