package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefonos;



public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AdminTelefono tfc = new AdminTelefono();
		
		
		
		
		Telefonos tf1 = new Telefonos("movi", "01920390129", 44);
		Telefonos tf2 = new Telefonos("claro", "01922390129", 55);
		Telefonos tf3 = new Telefonos("movi", "01920210129", 66);
		
		
		int contador = tfc.contarMovi(tf1, tf2, tf3);
		
		System.out.println("Cantidad de operadoras movi: " + contador);
		
		
		
		
	}

}
