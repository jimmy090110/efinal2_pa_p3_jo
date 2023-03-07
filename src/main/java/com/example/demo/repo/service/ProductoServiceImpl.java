package com.example.demo.repo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IProductoRepo;
import com.example.demo.repo.modelo.Producto;


@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo productoRepo;
	
	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.insertarProducto(producto);
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.actualizarProducto(producto);
	}


	@Override
	public Producto buscarProductoCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarProductoCodigoBarras(codigoBarras);
	}

	@Override
	public List<Producto> listaProductos() {
		// TODO Auto-generated method stub
		return this.productoRepo.listaProductos();
	}

	
	
}
