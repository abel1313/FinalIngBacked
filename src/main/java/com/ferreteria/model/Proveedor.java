package com.ferreteria.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn; 
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor 
{

	private int idProveedor;
	
	
	private String nombreProveedor;
	
	// @ManyToOne
	// @JoinColumn(name="id_Proveedor")
	// private Marca marca;
	//Relacion de uno a muchos, varas marcas son de un proveedor
	@OneToMany(mappedBy = "proveedor")
	@JoinColumn(name = "id_ProveedorFK")
	private List<Marca>lisMarca;
	
	
	public Proveedor() 
	{
	}
	
	@Id //LLave primaria 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name = "id_Proveedor")
	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	@Column(name = "nombre_Proveedor")
	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	





	 
}
