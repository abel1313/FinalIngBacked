package com.ferreteria.model;

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
@Table( name = "marcas")
public class Marca 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_Marca")
	private int idMarca;
	
	@Column(name = "nombre_Aechivo_Marca")
	private String nombreMarca;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ProveedorFK")
	private Proveedor proveedor;
	
	public Marca(){}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	
	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}



    







	


}
