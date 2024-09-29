package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {

	private String cedula;
	private String nombre;
	private String apellido;
	private String tipo;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {

		telefonos = new ArrayList<Telefono>();

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/*
	 * public void imprimir() {
	 * 
	 * 
	 * System.out.println("Cedula: " + cedula); System.out.println("Nombre: " +
	 * nombre); System.out.println("Apellido: " + apellido);
	 * System.out.println("Direccion:");
	 * System.out.println("      Calle principal: " +
	 * direccion.getCallePrincipal()); System.out.println("      Calle Secundaria: "
	 * + direccion.getCalleSecundaria());
	 * 
	 * }
	 */

	public void agregarTelefonos(Telefono telefono) {

		if (telefono != null) {
			telefonos.add(telefono);
		} else {
			System.out.println("No se agergo");
		}

	}

	public void mostrarTelefonos() {

		Telefono telefonosIterados;

		for (int i = 0; i < telefonos.size(); i++) {

			telefonosIterados = telefonos.get(i);

			if (telefonosIterados.getEstado().equals("C")) {
				System.out.println(
						"Número: " + telefonosIterados.getNumero() + ",  Tipo: " + telefonosIterados.getTipo());
			}

		}

	}

	public ArrayList<Telefono> recuerarIncorrectos() {
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<Telefono>();
		Telefono telefonosIterados;

		for (int i = 0; i < telefonos.size(); i++) {

			telefonosIterados = telefonos.get(i);

			if (telefonosIterados != null && telefonosIterados.getEstado().equals("E")) {

				telefonosIncorrectos.add(telefonosIterados);

			}

		}
		return telefonosIncorrectos;

	}

	public void imprimir() {

		System.out.println("***" + nombre + " " + apellido + "***");
		if (direccion != null) {
			System.out.println("Direccion: " + direccion.getCallePrincipal() + " " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}

	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
