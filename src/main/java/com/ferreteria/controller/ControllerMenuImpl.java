package com.ferreteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Menu;
import com.ferreteria.service.ServiceMenuImpl;

@RestController
@RequestMapping("/menu")
public class ControllerMenuImpl 
{
	@Autowired
	private ServiceMenuImpl serviceMenuImpl;
	
	@GetMapping("/{id}")
	public Menu getOneMenu(@PathVariable int id)
	{
		return serviceMenuImpl.getOneMenuEstatus(id);
	}
	@RequestMapping("/all")
	public List<Menu> getAllMenu()
	{
		List<Menu> listMenu = null;
		try
		{
			if(serviceMenuImpl.getAllMenu() != null)
				
				listMenu = serviceMenuImpl.getAllMenu();
		}catch (Exception e) {
			System.err.println("mas error que es " +e.getMessage());
		}
		return listMenu;
	}

}
