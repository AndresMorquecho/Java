package com.krakedev;

public class Rectangulo {
	
	public int base;
	public int altura;
	public double lado;

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
