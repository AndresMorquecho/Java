package com.krakedev.composicion;

public class Direccion {
	
	private String callePrincipal;
	private String calleSecundaria;
	private double latitud;
	private double altitud;
	private String numero;
	
	
	
	
	
	public Direccion(String callePrincipal, String calleSecundaria, String numero) {
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
		this.numero = numero;
	}
	
	public Direccion() {};
	
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getAltitud() {
		return altitud;
	}
	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
	
	
}
