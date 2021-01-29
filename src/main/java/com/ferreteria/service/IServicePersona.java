package com.ferreteria.service;

import java.util.List;

import com.ferreteria.model.Persona;
import com.ferreteria.model.Usuario;

public interface IServicePersona 
{
	public List<Persona> getAllPersonas();
	public Persona findByNombreUsuario(String nombreUsuario);

}
