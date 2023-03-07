package com.example.demo.repo.service;

import com.example.demo.repo.modelo.Inventario;
import com.example.demo.repo.modelo.Producto;

public interface IInventarioService {
	public void crearInventario(Inventario inventario);
	public void actualizaInventario(Inventario inventario);
	public Inventario buscarCodigoBarras(String codigoBarrasIndividual);
	public void ingresarProductoInventario(String numeroBodega, String codigoBarrasMaestro, String codigoBarrasIndividual, Producto producto);
}
