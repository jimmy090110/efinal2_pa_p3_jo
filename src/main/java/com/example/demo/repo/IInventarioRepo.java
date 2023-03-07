package com.example.demo.repo;

import com.example.demo.repo.modelo.Inventario;

public interface IInventarioRepo {

	public void crearInventario(Inventario inventario);
	public void actualizaInventario(Inventario inventario);
	public Inventario buscarInventario(Integer id);
	public Inventario buscarCodigoBarras(String codigoBarrasIndividual);
	
	
}
