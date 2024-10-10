package com.krakedev.persistencia.entidades;

import java.util.Date;

public class Empleado {

	private int codigoEmpleado;
	private String nombre;
	private Date fecha;
	private Date hora;
	
	
	
	public Empleado() {
		
	}
	
	
	@Override
	public String toString() {
		return "Empleado [codigoEmpleado=" + codigoEmpleado + ", nombre=" + nombre + ", fecha=" + fecha + ", hora="
				+ hora + "]";
	}


	public Empleado(int codigoEmpleado, String nombre, Date fecha, Date hora) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
	}
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	
	
	
	
}
