package com.ferreteria.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idCliente;
	
	private String nombreCliente;
	
	
	private List<Articulo> listArticulo;
	
	public Cliente() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cliente")
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	@Column(name="nombre_cliente")
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	@OneToMany(mappedBy = "cliente")
	public List<Articulo> getListArticulo() {
		return listArticulo;
	}
	public void setListArticulo(List<Articulo> listArticulo) {
		this.listArticulo = listArticulo;
	}

	
	
	
	
	
	

}
