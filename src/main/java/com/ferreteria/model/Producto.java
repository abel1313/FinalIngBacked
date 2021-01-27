package com.ferreteria.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "productos")
public class Producto 
{
	@Id //LLave primaria 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name = "id_Producto")
	private int idProducto;
	
	@NotNull(message = "Name may not be null")
	@Size(min = 2, max = 15)
	@Column(name = "nombre_Producto")
	private String nombreProducto;
	
	@NotNull(message = "Name may not be null")
	@Size(min = 2, max = 20)
	@Column(name = "codigoBarras_Producto")
	private String codigoBarrasProducto;
	
	@NotNull(message = "Name may not be null")
	@Size(min = 2, max = 50)
	@Column(name = "descripcion_Producto")
	private String descripcionProducto;
	
	@NotNull(message = "Name may not be null")
	@Size(min = 2, max = 50)
	@Column(name = "caracteristicas_Producto")
	private String caracteristicasProducto;
	
	@NotNull(message = "Name may not be null")
	@Min( value= 1)
	@Column(name = "existencia_Producto")
	private double existenciaProducto;
	
	@NotNull(message = "Name may not be null")
	@Min( value= 1)
	@Column(name = "precio_Producto")
	private double precioProducto;
	
	// varios productos son de un proveedor
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ProveedorFK")
	private Proveedor proveedor;

	
	
	
	public Producto() {
		
	}



	public Producto(int idProducto,
			@NotNull(message = "Name may not be null") @Size(min = 2, max = 15) String nombreProducto,
			@NotNull(message = "Name may not be null") @Size(min = 2, max = 20) String codigoBarrasProducto,
			@NotNull(message = "Name may not be null") @Size(min = 2, max = 50) String descripcionProducto,
			@NotNull(message = "Name may not be null") @Size(min = 2, max = 50) String caracteristicasProducto,
			@NotNull(message = "Name may not be null") @Min(1) double existenciaProducto,
			@NotNull(message = "Name may not be null") @Min(1) double precioProducto, Proveedor proveedor) {
		
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.codigoBarrasProducto = codigoBarrasProducto;
		this.descripcionProducto = descripcionProducto;
		this.caracteristicasProducto = caracteristicasProducto;
		this.existenciaProducto = existenciaProducto;
		this.precioProducto = precioProducto;
		this.proveedor = proveedor;
	}



	public int getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}



	public String getNombreProducto() {
		return nombreProducto;
	}



	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}



	public String getCodigoBarrasProducto() {
		return codigoBarrasProducto;
	}



	public void setCodigoBarrasProducto(String codigoBarrasProducto) {
		this.codigoBarrasProducto = codigoBarrasProducto;
	}



	public String getDescripcionProducto() {
		return descripcionProducto;
	}



	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}



	public String getCaracteristicasProducto() {
		return caracteristicasProducto;
	}



	public void setCaracteristicasProducto(String caracteristicasProducto) {
		this.caracteristicasProducto = caracteristicasProducto;
	}



	public double getExistenciaProducto() {
		return existenciaProducto;
	}



	public void setExistenciaProducto(double existenciaProducto) {
		this.existenciaProducto = existenciaProducto;
	}



	public double getPrecioProducto() {
		return precioProducto;
	}



	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}



	public Proveedor getProveedor() {
		return proveedor;
	}



	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}



	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", codigoBarrasProducto="
				+ codigoBarrasProducto + ", descripcionProducto=" + descripcionProducto + ", caracteristicasProducto="
				+ caracteristicasProducto + ", existenciaProducto=" + existenciaProducto + ", precioProducto="
				+ precioProducto + ", proveedor=" + proveedor + "]";
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
	
	
	
	
	
}
