package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto1;
		Auto auto2;
		
		auto1 = new Auto (2012,"Chevrolet" ,12500.23);
		auto2 = new Auto(2014, "KIA", 14000.53);
		
		
		/*
		
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2012);
		auto1.setPrecio(12500.23);
		
		
		auto2.setMarca("KIA");
		auto2.setAnio(2014);
		auto2.setPrecio(14000.53);				
		
		*/
		
		
		System.out.println("Datos del auto 1. Marca: " + auto1.getMarca() + " Año: " + auto1.getAnio() + " Precio: " + auto1.getPrecio()  );
		System.out.println("Datos del auto 2. Marca: " + auto2.getMarca() + " Año: " + auto2.getAnio() + " Precio: " + auto2.getPrecio()  );
		
		
	}

}
