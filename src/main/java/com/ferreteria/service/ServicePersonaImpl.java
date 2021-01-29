package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Persona;
import com.ferreteria.repository.IRepositoryPersona;

@Service
public class ServicePersonaImpl implements IServicePersona
{
	@Autowired
	private IRepositoryPersona iRepositoryPersona;
	@Override
	public List<Persona> getAllPersonas() {
		// TODO Auto-generated method stub
		return iRepositoryPersona.findAll();
	}
	@Override
	public Persona findByNombreUsuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return iRepositoryPersona.findByUsuarioNombreUsuario(nombreUsuario);
	}

}
