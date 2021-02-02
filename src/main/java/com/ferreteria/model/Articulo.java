package com.ferreteria.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulo implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private int idArticulo;
	
	
	private String nombreArticulo;
	
	/*@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_clientefk")
	private Cliente cliente;
	*/
	

	private Cliente cliente;
	
	public Articulo() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_articulo")
	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	@Column(name="nombre_articulo")
	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="id_clientefk")
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/*
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
*/
	
	
	

}
