package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferreteria.exeptions.BadRequest;
import com.ferreteria.model.Usuario;
import com.ferreteria.repository.IRepositoryUsuario;

import javassist.NotFoundException;

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

	@Override
	public ResponseEntity<Usuario> findByNombreUsuarioService(String usuario, String password) {

		Usuario us = iRepositoryUsuario.findByNombreUsuario(usuario);
		
		if(us == null)
		{
			throw new BadRequest("The user don't exists");
		}
			return ResponseEntity.status(HttpStatus.OK).body(us);
		
		
	}
	
	
}
