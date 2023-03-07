package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.service.IBodegaService;

	

@SpringBootApplication
public class Efinal2PaP3EcApplication implements CommandLineRunner {

	@Autowired
	private IBodegaService bodegaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal2PaP3EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Bodega bodega = new Bodega();
		bodega.setNombre("Bodega Land");
		bodega.setNumeroBodega("A12");
		bodega.setTelefono("0722641");
		bodega.setDireccion("12 de Febrero");
		this.bodegaService.insertarBodega(bodega);
		
		
	}

}
