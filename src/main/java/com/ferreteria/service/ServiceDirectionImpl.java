package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferreteria.exeptions.BadRequest;
import com.ferreteria.model.Direction;
import com.ferreteria.repository.IRepositoryDirection;

@Service
public class ServiceDirectionImpl implements IServiceDirection
{
	@Autowired
	private IRepositoryDirection iRepositoryDirection;

	@Override
	public ResponseEntity<List<Direction>> getAllDirection() {
		System.out.println(iRepositoryDirection.findAll());
		if(iRepositoryDirection.findAll().size() == 0 || iRepositoryDirection.findAll() == null) 
		{
			throw new BadRequest("don't leave fields empty ");
		}else
			{
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iRepositoryDirection.findAll());
			}
		}

	@Override
	public List<Direction> getCalando() {
		return iRepositoryDirection.findAll();
	}

	

}
