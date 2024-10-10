package com.krakedev.persistencia.test.RegistrosEntrada;

import com.krakedev.persistencia.ejercicios.AdminRegistros_Entrada;
import com.krakedev.persistencia.entidades.RegistrosEntrada;

public class TestEliminarRegitrosEntrada {

	public static void main(String[] args) {
		
		
		RegistrosEntrada re = new RegistrosEntrada(11);
		
		try {
			AdminRegistros_Entrada.eliminarRegistrosEntrada(re);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al intentar eliminar el registro: " + re.getCodigo_registro());
		}
		
		
		
		
		
	}
	
}
