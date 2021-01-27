package com.ferreteria.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_Persona")
	private int idPersona;
	
	@Column(name = "nombre_Persona")
	private String nombrePersona;
	
	@Column(name = "materno_Persona")
	private String maternoPersona;
	
	@Column(name = "paterno_Persona")
	private String paternoPersona;
	
	@Column(name = "fecha_Nacimientos_Persona")
	private String fechaNacimientosPersona;
	
	@Column(name = "genero_Persona")
	private String generoPersona;
	
	@Column(name = "correo_Electronico_Persona")
	private String correoElectronicoPersona;
	


}
