package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> personas;
		
		personas = new ArrayList<Persona>();
		Persona p = new Persona("xx", "yy");

		personas.add(new Persona("Andres","Peñafiel"));
		personas.add(new Persona("Selena","Sanchez"));
		personas.add(new Persona("Oscar","Guerrero"));
		
		
		System.out.println(personas.size());
	
		Persona elementoPersona;
		for(int i = 0; i < personas.size(); i ++) {
			
			elementoPersona = personas.get(i);
			
			System.out.println(elementoPersona.getNombre() + " " + elementoPersona.getApellido() );
		}
		
		
	}

}
