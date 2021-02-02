package com.ferreteria.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ferreteria.model.Usuario;

public interface IServiceUsuario 
{
	public List<Usuario> getAllUsuarios();
	public ResponseEntity<Usuario>findByNombreUsuarioService(String usuario, String password);
}
