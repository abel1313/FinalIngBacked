package com.ferreteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.model.Articulo;

@Repository
public interface IRepositoryArticulo extends JpaRepository<Articulo, Integer>{

}
