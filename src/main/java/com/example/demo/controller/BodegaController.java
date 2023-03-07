package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.service.IBodegaService;


import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/bodegas/")
public class BodegaController {

	@Autowired
	private IBodegaService bodegaService;
	
	@GetMapping("bodega")
	public String vistaDatos(Bodega bodega) {
		return "obtenerDatos";
	}
	
	@PostMapping("insertar")
	public String insertarBodega(Bodega bodega,  Model model) {
		this.bodegaService.insertarBodega(bodega);
		return "/bodegas/bodega";
	}
	
	
}
