package com.krakedev.entidades;

public class Cliente {
	
	
	private String cedula;
	private String nombre;
	private int hijos;
	
	
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", hijos=" + hijos + "]";
	}

	public Cliente() {}
	
	public Cliente(String cedula, String nombre, int hijos) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.hijos = hijos;
	}
	
	
	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	

}
