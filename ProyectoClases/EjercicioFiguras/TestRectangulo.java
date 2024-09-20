package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area;
		int area2;
		double perimetro;
		double areaCuadrado;
		double perimetroCuadrado;
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo p1 = new Rectangulo();
		Rectangulo ac = new Rectangulo();
		Rectangulo pc = new Rectangulo();
		
		
		r1.base= 10;
		r1.altura=5;
		
		
		r2.base = 8;
		r2.altura  = 3;
	 			
		
		p1.altura =2;
		p1.base =4;
		
		ac.lado = 4;
		pc.lado = 3;
		
		
		perimetro  = p1.calcularPerimetro();
		area = r1.calcularArea();
		area2 = r2.calcularArea();
		areaCuadrado = ac.calcularAreaCuadrado();
		perimetroCuadrado = pc.calcularPerimetroCuadrado();
		
		System.out.println("Area de r1: " + area);
		System.out.println("Area de r2: " + area2);
		System.out.println("Perimetro de p1: " + perimetro);
		System.out.println("Area de  cuadrado ac: " + areaCuadrado);
		System.out.println("Perimetro de cuadrado pc: " + perimetroCuadrado);
		

		
		
	}

}
