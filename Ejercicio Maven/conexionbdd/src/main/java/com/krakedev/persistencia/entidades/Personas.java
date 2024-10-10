package com.krakedev.persistencia.entidades;
import java.math.BigDecimal;
import java.util.Date;

public class Personas {

	private String cedula;
	private  String nombre;
	private String apellido;
	
	private EstadoCivil estadoCivil;
	
	
	private int numerHojos;
	private double estatura;
	private BigDecimal cantidadAhorra;
	private Date fechaNacimiento;
	private Date horaNacimiento;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Personas() {
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Personas [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil="
				+ estadoCivil + ", numerHojos=" + numerHojos + ", estatura=" + estatura + ", cantidadAhorra="
				+ cantidadAhorra + ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento + "]";
	}





	public Personas(String cedula, String nombre, String apellido, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
	}
	
	
	
	
	
	
	public Personas(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, int numerHojos,
			double estatura, BigDecimal cantidadAhorra, Date fechaNacimiento, Date horaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.numerHojos = numerHojos;
		this.estatura = estatura;
		this.cantidadAhorra = cantidadAhorra;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
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
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getNumerHojos() {
		return numerHojos;
	}
	public void setNumerHojos(int numerHojos) {
		this.numerHojos = numerHojos;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getCantidadAhorra() {
		return cantidadAhorra;
	}
	public void setCantidadAhorra(BigDecimal cantidadAhorra) {
		this.cantidadAhorra = cantidadAhorra;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getHoraNacimiento() {
		return horaNacimiento;
	}
	public void setHoraNacimiento(Date horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}
	
	
	
	
	
	
	
}
