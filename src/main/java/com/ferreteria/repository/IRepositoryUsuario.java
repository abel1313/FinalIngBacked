package com.ferreteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.model.Usuario;

@Repository
public interface IRepositoryUsuario extends JpaRepository<Usuario, Integer>
{
	public Usuario findByNombreUsuario(String nombreUsuaro);
}
