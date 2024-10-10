package com.krakedev.persistencia.entidades;

import java.util.Date;

public class RegistrosEntrada {

	private int codigo_registro;
	private String cedula_empleado;
	private Date fecha;
	private Date hora;
	private Empleado codigoEmpleado;
	
	
	
	
	
	public RegistrosEntrada() {
		
	}
	
	public RegistrosEntrada(int codigo_registro) {
		super();
		this.codigo_registro = codigo_registro;
	}
	
	
	public RegistrosEntrada(int codigo_registro, String cedula_empleado, Date fecha, Date hora,
			Empleado codigoEmpleado) {
		super();
		this.codigo_registro = codigo_registro;
		this.cedula_empleado = cedula_empleado;
		this.fecha = fecha;
		this.hora = hora;
		this.codigoEmpleado = codigoEmpleado;
	}
	public int getCodigo_registro() {
		return codigo_registro;
	}
	public void setCodigo_registro(int codigo_registro) {
		this.codigo_registro = codigo_registro;
	}
	public String getCedula_empleado() {
		return cedula_empleado;
	}
	public void setCedula_empleado(String cedula_empleado) {
		this.cedula_empleado = cedula_empleado;
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
	public Empleado getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(Empleado codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	@Override
	public String toString() {
		return "RegistrosEntrada [codigo_registro=" + codigo_registro + ", cedula_empleado=" + cedula_empleado
				+ ", fecha=" + fecha + ", hora=" + hora + ", codigoEmpleado=" + codigoEmpleado + "]";
	}
	
	
	
	
	
	
}
