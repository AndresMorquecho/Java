package com.krakedev.persistencia.test.Personas;

import com.krakedev.persistencia.ejercicios.AdminPersonas;
import com.krakedev.persistencia.entidades.Personas;

public class TestEliminarPersona {

	public static void main(String[] args) {
		
		
		Personas p1 = new Personas();
		
		p1.setCedula("0478901233");
		
		AdminPersonas.EliminarPersona(p1);
		
		
		
		
		
	}
}
