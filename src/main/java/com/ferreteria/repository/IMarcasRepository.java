package com.ferreteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferreteria.model.Marca;

public interface IMarcasRepository extends JpaRepository<Marca, Integer>
{

}
