package com.ferreteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Usuario;
import com.ferreteria.service.IServiceUsuario;

@RestController
@RequestMapping("/ferreteria/usuarios")
public class ControllerUsuarioImpl implements IControllerUsuario
{
	@Autowired
	private IServiceUsuario iServiceUsuario;
	
	@RequestMapping(method = RequestMethod.GET)
	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return iServiceUsuario.getAllUsuarios();
	}
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	@Override
	public ResponseEntity<Usuario> getOneUsuarioController(@RequestBody Usuario usuario) {
		System.err.println(usuario.getNombreUsuario() + usuario.getContraUsuario());
		return iServiceUsuario.findByNombreUsuarioService(usuario.getNombreUsuario(), usuario.getContraUsuario());
	}

}
