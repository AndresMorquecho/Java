package com.krakedev;

public class Rectangulo {
	
	private int base;
	private int altura;
	private double lado;

	
	
	
	
	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public int calcularArea() {
		int area = base* altura;
		return area;
		
	}
	
	
	public double calcularPerimetro() {
		int perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}
	
	
	public double calcularAreaCuadrado() {
		double areacuadrado = (double)  Math.pow(lado,2);
		return areacuadrado;
	}
	
	
	public double calcularPerimetroCuadrado() {
		double PerimetroCuadrado = lado * 4;
		return PerimetroCuadrado;
	}
	
}
