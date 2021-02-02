package com.ferreteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ferreteria.model.Producto;

@Repository
public interface IRepositoryProducto extends JpaRepository<Producto, Integer>
{
	@Query(value = "        SELECT p.id_Producto, p.nombre_Producto, p.codigo_Barras_Producto, p.descripcion_Producto, p.caracteristicas_Producto,\n" + 
			"        p.existencia_Producto, p.precio_Producto, id_proveedorfk, prov.nombre_Proveedor \n" + 
			"        FROM productos p\n" + 
			"        INNER JOIN proveedores prov\n" + 
			"        ON p.id_ProveedorFK  = prov.id_Proveedor \n" + 
			"        WHERE p.nombre_Producto LIKE %:nomProducto% OR p.codigo_Barras_Producto LIKE %:codBarra%", nativeQuery = true)
	public List<Producto>findBynombreProductoOrCodigoBarrasProducto(@Param("nomProducto")String nombreProducto, @Param("codBarra")String codigoBarraProducto);

}
