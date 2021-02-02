package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Menu;

import com.ferreteria.repository.IRepositoryMenu;

@Service
public class ServiceMenuImpl implements IServiceMenu
{
	@Autowired
	private IRepositoryMenu iRepositoryMenu;
	
	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return iRepositoryMenu.findAll();
	}

	@Override
	public Menu getOneMenuEstatus(int idS) {
		return iRepositoryMenu.getOne(idS);
	}



}
