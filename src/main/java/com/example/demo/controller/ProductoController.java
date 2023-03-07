package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.modelo.Producto;

import com.example.demo.repo.service.IProductoService;

import ch.qos.logback.core.model.Model;




@Controller
@RequestMapping("/productos/")

public class ProductoController {


	@Autowired
	private IProductoService productoService;
	
	
	@GetMapping("producto")
	public String vistaObtenerDatos(Producto producto) {
		return "ProductoDatos";
	}
	
	@PostMapping("insertar")
	public String insertarBodega(Producto producto, BindingResult result, Model model) {
		producto.setStock(0);
		this.productoService.insertarProducto(producto);
		return "/productos/resultado";
	}

	@GetMapping("resultado")
	public String buscarTodos(Producto producto, Model modelo) {
		List<Producto> productosDisponibles = this.productoService.listaProductos();
		//modelo.addAttribute("Productos", productosDisponibles);
		return "listaProductos";
	}
	

	

	
	
	

}
