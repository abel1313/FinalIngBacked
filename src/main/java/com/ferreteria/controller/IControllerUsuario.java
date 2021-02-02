package com.ferreteria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ferreteria.model.Usuario;

public interface IControllerUsuario 
{
	public List<Usuario>getAllUsuarios();
	public ResponseEntity<Usuario> getOneUsuarioController(Usuario usuario);
}
