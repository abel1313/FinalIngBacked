package com.ferreteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.ferreteria.model.Persona;


@Repository
public interface IRepositoryPersona extends JpaRepository<Persona, Integer>
{

/*
 	@Query("SELECT u.nombre_Usuario, p.nombre_Persona, d.pais_Direccion FROM personas p \n" + 
			"INNER JOIN  usuarios u\n" + 
			"ON p.id_UsuarioFK = u.id_Usuario\n" + 
			"INNER JOIN direcciones d \n" + 
			"ON d.id_Direccion = p.id_DirecconFK \n" + 
			"WHERE u.nombre_Usuario = :nameUser")
 * */
	 Persona findByUsuarioNombreUsuario(String nameUser);

}
