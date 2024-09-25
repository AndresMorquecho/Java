package com.krakeved.controlflujo.test;

import com.krakeved.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Validador validador = new Validador();
		validador.validarEdad(10);
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(4);
		validador.validarEdad(25);
		validador.validarEdad(-2);		
		
	}

}
