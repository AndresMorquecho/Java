package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p; // 1. Declaro una variable "p" de tipo Persona
		Persona p2 = new Persona();
		p = new Persona(); // Instanciar un objeto Persona, referenciarlo a la variable p

		// 3. Accedo a los atributos

		// Modificar Objetos de P

		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;

		System.out.println("nombre: " + p.nombre);
		System.out.println("nombre: " + p.edad);
		System.out.println("nombre: " + p.estatura);

		p2.nombre = "Angelina";

		System.out.println("nombre: " + p2.nombre);
		System.out.println("nombre: " + p.nombre);

	}

}
