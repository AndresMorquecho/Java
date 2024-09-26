package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 =new Persona();
		
		p1.setNombre("Andres");
		p1.setApellido("Morquecho");

		Direccion dir = new Direccion();
		
		dir.setCallePrincipal("Av siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		
		p1.setDireccion(dir);
		
		
		 String nombre= p1.getNombre();
		 Direccion d1 = p1.getDireccion();
		 
		 Persona p2 = new Persona();
		 p2.setNombre("Pedro");
		 
		 Direccion d2 = new Direccion("Milagro", "Bellavista", "A18");
		 
		 
		 System.out.println(nombre);
		 System.out.println(d2.getCallePrincipal());
		 
		 p1.imprimir();
		 p2.imprimir();
		 
		 Persona p3 = new Persona();
		 p3.setDireccion(new Direccion("xx", "yy", "123"));
		 
		 p3.imprimir();
	}	

}
