package com.ferreteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.model.Producto;

@Repository
public interface IRepositoryProducto extends JpaRepository<Producto, Integer>
{
	public List<Producto>findBynombreProductoOrCodigoBarrasProducto(String nombreProducto, String codigoBarraProducto);

}
