package com.ferreteria.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.model.Direction;
import com.ferreteria.service.IServiceDirection;


@RestController
@RequestMapping("/Direction")
public class ControllerDirectionImpl implements IControllerDirection
{	
	@Autowired( required = true)
	private IServiceDirection IServiceDirection;
	
	@RequestMapping(method = RequestMethod.GET)
	@Override
	public ResponseEntity<ResponseEntity<List<Direction>>> findAll() {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(IServiceDirection.getAllDirection());
	}
	
	
	@RequestMapping("Nuevo")
	@Override
	public List<Direction> calando() {
		// TODO Auto-generated method stub
		return IServiceDirection.getCalando();
	}
	
	@RequestMapping("seguir")
	public String ca() {
		// TODO Auto-generated method stub
		return "Sai";
	}

}
