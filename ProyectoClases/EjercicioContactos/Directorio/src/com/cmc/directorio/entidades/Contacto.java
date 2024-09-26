package com.cmc.directorio.entidades;

public class Contacto {

	private String apellido;
	private boolean activo;
	private Telefonos telefono;
	private double peso;
	
	
	public Contacto(String apellido, Telefonos telefono, double peso) {
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public Telefonos getTelefono() {
		return telefono;
	}


	public void setTelefono(Telefonos telefono) {
		this.telefono = telefono;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
	
}
