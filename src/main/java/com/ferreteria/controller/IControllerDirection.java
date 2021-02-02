package com.ferreteria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.ferreteria.model.Direction;


public interface IControllerDirection 
{
	public ResponseEntity<ResponseEntity<List<Direction>>>findAll();
	public List<Direction>calando();
	

}
