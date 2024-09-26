package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefonos;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefonos telf = new Telefonos("movi", "098234234", 20);
		AdminTelefono at = new AdminTelefono();
		
		at.activarMensajeria(telf);
	
		telf.imprimirInfo();
		
		
	}

}
