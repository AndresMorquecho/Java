package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {

		Persona p;
		Persona p2 = new Persona();
		p = new Persona();

		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);


		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());


		p2.setNombre("Angelina");


		System.out.println("Nombre de p2: " + p2.getNombre());
		System.out.println("Nombre de p: " + p.getNombre());
	}
}

