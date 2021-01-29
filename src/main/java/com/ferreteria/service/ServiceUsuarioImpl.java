package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Usuario;
import com.ferreteria.repository.IRepositoryUsuario;

@Service
public class ServiceUsuarioImpl implements IServiceUsuario
{
	@Autowired
	private IRepositoryUsuario iRepositoryUsuario;

	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return iRepositoryUsuario.findAll();
	}
	
	
}
