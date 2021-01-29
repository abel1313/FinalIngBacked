package com.ferreteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estatusmenus")
public class EstatusMenu 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_Estatus_Menu")
	private int idEstatusMenu;
	
	@Column(name = "nombre_Estatus_Menu")
	private String nombreEstatusMenu;
	
	//@OneToOne( optional = false ,mappedBy = "estatusMenu")
	//private Menu menu;

	public EstatusMenu() {
		
	}
	public EstatusMenu(int idEstatusMenu, String nombreEstatusMenu, Menu menu) {
		
		this.idEstatusMenu = idEstatusMenu;
		this.nombreEstatusMenu = nombreEstatusMenu;
	//	this.menu = menu;
	}



	public int getIdEstatusMenu() {
		return idEstatusMenu;
	}

	public void setIdEstatusMenu(int idEstatusMenu) {
		this.idEstatusMenu = idEstatusMenu;
	}

	public String getNombreEstatusMenu() {
		return nombreEstatusMenu;
	}

	public void setNombreEstatusMenu(String nombreEstatusMenu) {
		this.nombreEstatusMenu = nombreEstatusMenu;
	}

	/*
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	*/
	

}
