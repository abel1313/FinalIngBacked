package com.ferreteria.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.model.Cliente;

@Repository
public interface IRepositoryCliente extends JpaRepository<Cliente, Integer>
{
	
	
}
