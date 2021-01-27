package com.ferreteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "direcciones")
public class Direction 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Direccion")
	private int idDireccion;
	
	 @NotNull(message = "Name cannot be null")
	 @NotEmpty
	 @Size(min = 5, max = 15, message 
	      = "About Me must be between 10 and 200 characters")
	 //  @Email(message = "Email should be valid")
	@Column(name = "pais_Direccion")
	private String paisDireccion;
	 
	 @NotNull(message = "Name cannot be null")
	 @NotEmpty
	 @Size(min = 5, max = 25, message 
	      = "About Me must be between 10 and 200 characters")
	 //  @Email(message = "Email should be valid")
	@Column(name = "estado_Direccion")
	private String estadoDireccion;
	 
	 @NotNull(message = "Name cannot be null")
	 @NotEmpty
	 @Size(min = 5, max = 25, message 
	      = "About Me must be between 10 and 25 characters")
	    @Min(value = 18, message = "Age should not be less than 18")
	    @Max(value = 150, message = "Age should not be greater than 150")
	 
	 //  @Email(message = "Email should be valid")
	@Column(name = "municipio_Direccion")
	private String municipioDireccion;
	 
	 @NotNull(message = "Name cannot be null")
	 @NotEmpty
	 @Size(min = 5, max = 35, message 
	      = "About Me must be between 10 and 35 characters")
	   // @Min(value = 18, message = "Age should not be less than 18")
	   // @Max(value = 150, message = "Age should not be greater than 150")
	 //  @Email(message = "Email should be valid")
	@Column(name = "calle_Direccion")
	private String calleDireccion;
	 
	 @NotNull(message = "Name cannot be null")
	 @NotEmpty
	 @Size(min = 5, max = 35, message 
	      = "About Me must be between 10 and 35 characters")
	   // @Min(value = 18, message = "Age should not be less than 18")
	    //@Max(value = 150, message = "Age should not be greater than 150")
	 //  @Email(message = "Email should be valid")
	@Column(name = "codigo_Postal_Direccion")
	private String codigoPostalDireccion;
	 
	 @NotNull(message = "Name cannot be null")
	 @NotEmpty
	 @Size(min = 1, max = 15, message 
	      = "About Me must be between 10 and 200 characters")
	   // @Min(value = 18, message = "Age should not be less than 18")
	  //  @Max(value = 150, message = "Age should not be greater than 150")
	 
	 //  @Email(message = "Email should be valid")
	@Column(name = "numero_Interior_Direccion")
	private String numeroInteriorDireccion;
	 
	 //  @Email(message = "Email should be valid")
	@Column(name = "numero_Exterior_Direccion")
	@Size(max=15)
	private String numeroExteriorDireccion;

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getPaisDireccion() {
		return paisDireccion;
	}

	public void setPaisDireccion(String paisDireccion) {
		this.paisDireccion = paisDireccion;
	}

	public String getEstadoDireccion() {
		return estadoDireccion;
	}

	public void setEstadoDireccion(String estadoDireccion) {
		this.estadoDireccion = estadoDireccion;
	}

	public String getMunicipioDireccion() {
		return municipioDireccion;
	}

	public void setMunicipioDireccion(String municipioDireccion) {
		this.municipioDireccion = municipioDireccion;
	}

	public String getCalleDireccion() {
		return calleDireccion;
	}

	public void setCalleDireccion(String calleDireccion) {
		this.calleDireccion = calleDireccion;
	}

	public String getCodigoPostalDireccion() {
		return codigoPostalDireccion;
	}

	public void setCodigoPostalDireccion(String codigoPostalDireccion) {
		this.codigoPostalDireccion = codigoPostalDireccion;
	}

	public String getNumeroInteriorDireccion() {
		return numeroInteriorDireccion;
	}

	public void setNumeroInteriorDireccion(String numeroInteriorDireccion) {
		this.numeroInteriorDireccion = numeroInteriorDireccion;
	}

	public String getNumeroExteriorDireccion() {
		return numeroExteriorDireccion;
	}

	public void setNumeroExteriorDireccion(String numeroExteriorDireccion) {
		this.numeroExteriorDireccion = numeroExteriorDireccion;
	}
	public Direction() {
	

	}	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public Direction(int idDireccion,
			@NotNull(message = "Name cannot be null") @NotEmpty @Size(min = 5, max = 15, message = "About Me must be between 10 and 200 characters") String paisDireccion,
			@NotNull(message = "Name cannot be null") @NotEmpty @Size(min = 5, max = 25, message = "About Me must be between 10 and 200 characters") String estadoDireccion,
			@NotNull(message = "Name cannot be null") @NotEmpty @Size(min = 5, max = 25, message = "About Me must be between 10 and 25 characters") @Min(value = 18, message = "Age should not be less than 18") @Max(value = 150, message = "Age should not be greater than 150") String municipioDireccion,
			@NotNull(message = "Name cannot be null") @NotEmpty @Size(min = 5, max = 35, message = "About Me must be between 10 and 35 characters") String calleDireccion,
			@NotNull(message = "Name cannot be null") @NotEmpty @Size(min = 5, max = 35, message = "About Me must be between 10 and 35 characters") String codigoPostalDireccion,
			@NotNull(message = "Name cannot be null") @NotEmpty @Size(min = 1, max = 15, message = "About Me must be between 10 and 200 characters") String numeroInteriorDireccion,
			@Size(max = 15) String numeroExteriorDireccion) {

		this.idDireccion = idDireccion;
		this.paisDireccion = paisDireccion;
		this.estadoDireccion = estadoDireccion;
		this.municipioDireccion = municipioDireccion;
		this.calleDireccion = calleDireccion;
		this.codigoPostalDireccion = codigoPostalDireccion;
		this.numeroInteriorDireccion = numeroInteriorDireccion;
		this.numeroExteriorDireccion = numeroExteriorDireccion;
	}
 
	

}
