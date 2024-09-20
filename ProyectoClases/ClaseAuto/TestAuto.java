package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto1;
		Auto auto2;
		
		auto1 = new Auto ();
		auto2 = new Auto();
		
		auto1.marca = "Chevrolet";
		auto1.anio = 2012;
		auto1.precio = 12500.23;
		
		
		auto2.marca = "KIA";
		auto2.anio = 2014;
		auto2.precio = 14000.53;				
		
		
		System.out.println("Datos del auto 1. Marca: " + auto1.marca + " Año: " + auto1.anio + " Precio: " + auto1.precio  );
		System.out.println("Datos del auto 2. Marca: " + auto2.marca + " Año: " + auto2.anio + " Precio: " + auto2.precio  );
		
		
	}

}
