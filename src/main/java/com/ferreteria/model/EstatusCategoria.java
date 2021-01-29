package com.ferreteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "estatuscategoria")
public class EstatusCategoria 
{
	@Id //LLave primaria 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name = "id_EstatusCategoria")
	private int idEstatusCategoria;
	
	@NotNull(message = "Name may not be null")
	@Size(min = 2, max = 15)
	@Column(name = "nombre_EstatusCategoria")
	private String nombreEstatusCategoria;
	
	@NotNull(message = "Name may not be null")
	@Size(min = 2, max = 15)
	@Column(name = "estatusCategoria")
	private String estatusCategoria;

	
	public EstatusCategoria() {}

	public EstatusCategoria(int idEstatusCategoria,
			@NotNull(message = "Name may not be null") @Size(min = 2, max = 15) String nombreEstatusCategoria,
			@NotNull(message = "Name may not be null") @Size(min = 2, max = 15) String estatusCategoria) {
		
		this.idEstatusCategoria = idEstatusCategoria;
		this.nombreEstatusCategoria = nombreEstatusCategoria;
		this.estatusCategoria = estatusCategoria;
	}

	public int getIdEstatusCategoria() {
		return idEstatusCategoria;
	}

	public void setIdEstatusCategoria(int idEstatusCategoria) {
		this.idEstatusCategoria = idEstatusCategoria;
	}

	public String getNombreEstatusCategoria() {
		return nombreEstatusCategoria;
	}

	public void setNombreEstatusCategoria(String nombreEstatusCategoria) {
		this.nombreEstatusCategoria = nombreEstatusCategoria;
	}

	public String getEstatusCategoria() {
		return estatusCategoria;
	}

	public void setEstatusCategoria(String estatusCategoria) {
		this.estatusCategoria = estatusCategoria;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

}
