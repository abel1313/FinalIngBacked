package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Articulo;
import com.ferreteria.repository.IRepositoryArticulo;

@Service
public class ServiceArticuloImpl implements IServiceArticulo 
{
@Autowired
private IRepositoryArticulo iRepositoryArticulo;

@Override
public List<Articulo> getArticulos() {
	// TODO Auto-generated method stub
	return iRepositoryArticulo.findAll();
}
	
}
