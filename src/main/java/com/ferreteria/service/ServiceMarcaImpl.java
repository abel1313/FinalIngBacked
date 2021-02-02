package com.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.model.Marca;
import com.ferreteria.repository.IMarcasRepository;
@Service
public class ServiceMarcaImpl implements IServiceMarca
{
	@Autowired
	private IMarcasRepository IMarcasRepository;
	@Override
	public List<Marca> getAllMarcas() {
		// TODO Auto-generated method stub
		return IMarcasRepository.findAll();
	}

}
