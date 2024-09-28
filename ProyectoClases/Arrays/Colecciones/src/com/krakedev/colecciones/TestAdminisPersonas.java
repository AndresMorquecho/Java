package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminisPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AdminPersonas admin = new AdminPersonas();
		
		admin.agregar(new Persona("Mario", "Bros", 40));
		admin.agregar(new Persona("Luigui", "Bros", 20));
		admin.agregar(new Persona("Spiderman", "Spy", 40));
		admin.imprimir();
		
		
		
		Persona p1 = admin.buscarPorNombre("Pedro");
		if (p1 != null) {
			System.out.println( p1.getNombre() +  " " + p1.getApellido());
		}else {
			System.out.println("No se encontro");
		}
		
		
		ArrayList<Persona> personasMayores  = admin.buscarMayores(25);
		System.out.println( "Personas Mayores " +  personasMayores.size());
		
	}

}
