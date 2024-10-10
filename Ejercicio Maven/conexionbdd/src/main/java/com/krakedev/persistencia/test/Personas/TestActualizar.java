package com.krakedev.persistencia.test.Personas;

import com.krakedev.persistencia.ejercicios.AdminPersonas;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personas pAct = new Personas("0478901233","Luisa","Peñafiel", new EstadoCivil("C", "Casado"));
		
		

		try {
			pAct.setEstatura(70.0);
			pAct.setNumerHojos(2);
			pAct.setFechaNacimiento(Convertidor.convertirFecha("1999/04/27"));
			pAct.setHoraNacimiento(Convertidor.convertirHora("10:22"));
			AdminPersonas.Actualizar(pAct);
			
			
		} catch (Exception e) {


			System.out.println("Error con la conexión a la base de datos");
			
		}
		
		
		
		
	}

}
