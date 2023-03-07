package com.example.demo.repo.modelo;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;



@Entity
@Table(name = "bodega")
public class Bodega {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("bodega_seq"))
	@SequenceGenerator(name = "bodega_seq", sequenceName = "bodega_seq",allocationSize = 1)
	@Column(name="bode_id")
	private Integer id;
	@Column(name="bode_numero_bodega")
	private String numeroBodega;
	@Column(name="bode_nombre")
	private String nombre;
	@Column(name="bode_direccion")
	private String direccion;
	
	@Column(name="bode_telefono")
	private String telefono;
	
	
	

	@OneToMany(mappedBy = "bodega",cascade=CascadeType.ALL) 
	private List<Inventario> inventario;

	
	//Set and Get
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroBodega() {
		return numeroBodega;
	}

	public void setNumeroBodega(String numeroBodega) {
		this.numeroBodega = numeroBodega;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}
	
	
	
	
}
