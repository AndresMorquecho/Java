package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante e1 = new Estudiante("Andres");
		
		e1.calificar(7);
		
		System.out.println("Estudiante: " + e1.getNombre() + " Nota: " + e1.getNota() + " Resultado: " + e1.getResultado());
	}

}
