package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inicio");
		String a = "asdas";
		
		
		try {
			System.out.println("ABRE LA CONEXION BDD");
		    a.substring(3);
			System.out.println("Fin");
			System.out.println("CIERRA LA CONEXIÓN BDD");
		}catch(Exception ex) {
			System.out.println("Dentro del catch");
		}finally {
			System.out.println("Ingresa al finally");
			System.out.println("CIERRA LA CONEXIÓN BDD");
		}
		
		
		
		System.out.println("Fuera del try");

		
	}

}
