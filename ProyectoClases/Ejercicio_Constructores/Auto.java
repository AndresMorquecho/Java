package com.krakedev;

public class Auto {
	
	private int anio;
	private String marca;
	private Double precio;
	
	
	
	public Auto(int anio, String marca, Double precio) {
		
		this.anio = anio;
		this.marca = marca;
		this.precio = precio;
		
		
	}
	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
}
