package com.example.demo.repo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IInventarioRepo;
import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Inventario;
import com.example.demo.repo.modelo.Producto;



@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepo inventarioRepo;
	@Autowired
	private IBodegaService bodegaService;
	@Autowired
	private IProductoService productoService;
	

	@Override
	public void crearInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepo.crearInventario(inventario);
	}

	@Override
	public void actualizaInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepo.actualizaInventario(inventario);
	}

	@Override
	public Inventario buscarCodigoBarras(String codigoBarrasIndividual) {
		// TODO Auto-generated method stub
		return this.inventarioRepo.buscarCodigoBarras(codigoBarrasIndividual);
	}

	@Override
	public void ingresarProductoInventario(String numeroBodega, String codigoBarrasMaestro,
			String codigoBarrasIndividual, Producto producto) {
		// TODO Auto-generated method stub
		
		System.out.println("PRODUCTO : "+ producto.getCodigoBarras());
		Inventario inventario = new Inventario();
		this.productoService.actualizarProducto(producto);
		List<Producto> listaprod = new ArrayList<>(); 
		listaprod.add(producto);
		inventario.setCodigoBarrasIndividual(codigoBarrasIndividual);
		inventario.setProductos(listaprod);

		producto.setInventario(inventario);
		System.out.println("INVENTARIO : "+inventario.getProductos());
		
		this.crearInventario(inventario);
	}


	
	
}
