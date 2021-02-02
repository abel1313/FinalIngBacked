package com.ferreteria.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.ferreteria.model.Producto;
import com.ferreteria.service.IServiceProducto;

@RestController
@RequestMapping("productos")
public class ControllerProductoImpl implements IControllerProducto
{
	//@Autowired
	//private HttpSession session;
	
	@Autowired
	private IServiceProducto iServiceProducto;
	
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	public List<Producto>getOneProducto()
	{
		//System.err.println(iServiceProducto.findAllProductoService());
		List<Producto> productos = iServiceProducto.findAllProductoService();
	//	session.setAttribute("productosAll", productos);
		return productos;
		
		
	}
	@RequestMapping(value = "/one/{nombreProducto}",method = RequestMethod.GET)
	@Override
	public List<Producto> getOneProductoController(@PathVariable("nombreProducto")String nombreProducto) 
	{
		//System.err.println(session.getAttribute("productos"));
		//System.err.println("---------------------------------------------------------------------------" +nombreProducto +" ");
			return iServiceProducto.findByNombreOrCodigo(nombreProducto, nombreProducto);
	}

}
