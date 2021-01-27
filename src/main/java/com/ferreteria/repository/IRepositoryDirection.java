package com.ferreteria.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ferreteria.model.Direction;

@Repository
public interface IRepositoryDirection extends JpaRepository<Direction, Integer>
{
	
}
