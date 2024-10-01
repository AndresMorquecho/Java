package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas;
	private Cliente cliente;
	
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setCuotas(ArrayList<Cuota> cuotas) {
		this.cuotas = cuotas;
	}


	public Prestamo(double monto, double interes, int plazo) {
		cuotas = new ArrayList<Cuota>();
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
	}

	
	
	public  void mostrarPrestamo() {
		
		System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido()  );
		System.out.println("Monto: " + monto + " Interes: " + interes + "Plazo: " +  plazo );
	}
	

	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	public double getInteres() {
		return interes;
	}


	public void setInteres(double interes) {
		this.interes = interes;
	}


	public int getPlazo() {
		return plazo;
	}


	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}


	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}




	
	
	
	
	
	
}
