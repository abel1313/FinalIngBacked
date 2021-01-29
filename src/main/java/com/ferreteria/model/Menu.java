package com.ferreteria.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "menus")
public class Menu 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_Menu")
	private int idMenu;
	
	@NotNull(message = "Name may not be null")
	//@Size(min = 2, max = 15	)
	@Column(name = "nombre_Menu")
	private String nombre_Menu;
	
	@OneToOne
	  @JoinColumn(name="id_Estatus_MenuFK", unique = true, nullable = false, updatable = false) 
	private EstatusMenu estatusMenu;
	

	public Menu(int idMenu, @NotNull(message = "Name may not be null") @Size(min = 2, max = 15) String nombre_Menu,
			EstatusMenu estatusMenu) {
		this.idMenu = idMenu;
		this.nombre_Menu = nombre_Menu;
		this.estatusMenu = estatusMenu;
	}

	public Menu() {}

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getNombre_Menu() {
		return nombre_Menu;
	}

	public void setNombre_Menu(String nombre_Menu) {
		this.nombre_Menu = nombre_Menu;
	}

	public EstatusMenu getEstatusMenu() {
		return estatusMenu;
	}

	public void setEstatusMenu(EstatusMenu estatusMenu) {
		this.estatusMenu = estatusMenu;
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
