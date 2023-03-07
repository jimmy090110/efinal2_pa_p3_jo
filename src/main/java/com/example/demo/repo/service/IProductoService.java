package com.example.demo.repo.service;

import java.util.List;

import com.example.demo.repo.modelo.Producto;



public interface IProductoService {

	public void insertarProducto(Producto producto); 
	public void actualizarProducto(Producto producto);
	public Producto buscarProductoCodigoBarras(String codigoBarras);
	public List<Producto> listaProductos();
}
