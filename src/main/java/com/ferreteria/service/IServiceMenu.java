package com.ferreteria.service;

import java.util.List;

import com.ferreteria.model.Menu;

public interface IServiceMenu {

	public List<Menu>getAllMenu();
	public Menu getOneMenuEstatus(int id);
	
}
