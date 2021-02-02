package com.ferreteria.service;

import java.util.List;


import org.springframework.http.ResponseEntity;
import com.ferreteria.model.Direction;


public interface IServiceDirection 
{

	public ResponseEntity<List<Direction>> getAllDirection();
	public List<Direction>getCalando();
	
	

}
