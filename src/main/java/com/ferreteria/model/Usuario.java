package com.ferreteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Usuarios")
public class Usuario 
{
	@Id //LLave primaria 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name = "id_Proveedor")
	private int idUsuario;
	
	@NotNull(message = "Name may not be null")
	@Size(min = 2, max = 15)
	@Column(name = "nombre_Usuario")
	public String nombreUsuario;

	@NotNull
	@NotEmpty(message = "Password may not be empty")
	@Size(min = 2, max = 20)
	@Column(name = "contra_Usuario")
	public String contraUsuario;

	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String nombreUsuario, String contraUsuario) {
		
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.contraUsuario = contraUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraUsuario() {
		return contraUsuario;
	}

	public void setContraUsuario(String contraUsuario) {
		this.contraUsuario = contraUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", contraUsuario="
				+ contraUsuario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contraUsuario == null) ? 0 : contraUsuario.hashCode());
		result = prime * result + idUsuario;
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (contraUsuario == null) {
			if (other.contraUsuario != null)
				return false;
		} else if (!contraUsuario.equals(other.contraUsuario))
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.equals(other.nombreUsuario))
			return false;
		return true;
	}
	
	
	
	

}
