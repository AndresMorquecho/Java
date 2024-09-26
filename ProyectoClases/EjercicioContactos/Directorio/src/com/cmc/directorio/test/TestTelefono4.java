package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefonos;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telefonos tf1 = new Telefonos("movi", "1234567799", 11);
		Telefonos tf2 = new Telefonos("movi", "12345677459", 12);
		Telefonos tf3 = new Telefonos("claro", "12345677569", 13);
		Telefonos tf4 = new Telefonos("claro", "12345672399", 14);
		

		AdminTelefono tfc = new AdminTelefono();
		int contadorclaro =  tfc.contarClaro(tf1, tf2, tf3, tf4);
			
		System.out.println("Cantdad de Operadadoras Claro: "+ contadorclaro);
		
		
		
	}

}
