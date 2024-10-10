package com.krakedev.persistencia.test.Personas;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.ejercicios.AdminPersonas;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.utils.Convertidor;


//System.out.printLn solo se va poder usar en los test

public class TestAdminisPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EstadoCivil estadoCivil = new EstadoCivil("U", "Unión Libre");
		
		Personas p = new Personas("0478901233","Luisa" , "Fajardo", estadoCivil);
		
		
		try {
			Date fechaNac = Convertidor.convertirFecha("2000/23/23");
			Date horaNac = Convertidor.convertirHora("11:23");
			
			
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorra(new BigDecimal(1230.45));
			p.setNumerHojos(10);
			
			
			AdminPersonas.insertar(p);
			
						
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el sistema: " + e.getMessage());
		}
		
		

		
		
		
		
	}

}
