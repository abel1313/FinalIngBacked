package com.ferreteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.model.Proveedor;

@Repository
public interface IRepositoryProveedor extends JpaRepository<Proveedor, Integer>
{

}
