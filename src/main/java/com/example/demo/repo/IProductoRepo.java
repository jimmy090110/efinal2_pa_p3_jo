package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Producto;



public interface IProductoRepo {

	public void insertarProducto(Producto producto); 
	public void actualizarProducto(Producto producto);

	public Producto buscarProductoCodigoBarras(String codigoBarras);
	public List<Producto> listaProductos();
	
}
