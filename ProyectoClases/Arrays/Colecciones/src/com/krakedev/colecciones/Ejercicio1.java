package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cadenas;
		cadenas = new ArrayList<String>();
		System.out.println(cadenas.size());

		cadenas.add("Uno");
		cadenas.add("Dos");
		
		System.out.println(cadenas.size());
		
		
		System.out.println(cadenas.get(0)); 
		
		String cadena;
		for(int i =0; i < cadenas.size(); i++) {
			
			cadena = cadenas.get(i);
			
			System.out.println(cadena);
		}
		
	}

}
