package com.cmc.repaso.entidades;

public class Producto {

	private String nombre;
	private Double precio;
	
	
	public Producto(String nombre, Double precio){
		this.nombre = nombre;
		this.precio = precio;
	}

	
	public double calcularPrecioPromo(Double PorcentajeDescuento){	
			
		double PrecioCondescuento;
		
		PrecioCondescuento = this.precio * (1 - PorcentajeDescuento / 100);
		
		return PrecioCondescuento;
		
	
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		
		if(precio < 0) {
			precio = precio * -1;
		}
		
		this.precio = precio;
	}	
	
	
	
	
}
