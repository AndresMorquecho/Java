package com.krakedev.estaticos.test;

import java.util.ArrayList;

import com.krakedev.estaticos.entidades.Alarma;
import com.krakedev.estaticos.logica.AdminAlarmas;
import com.krakedev.estaticos.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Alarma a1 = new Alarma(DiasSemana.LUNES,5,45);
		Alarma a2 = new Alarma(DiasSemana.DOMINGO,3,00);
		Alarma a3 = new Alarma(DiasSemana.JUEVES,1,00);
		Alarma a4 = new Alarma(DiasSemana.VIERNES,2,50);
		
		
		AdminAlarmas admin = new AdminAlarmas();
		
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		admin.agregarAlarma(a4);
		
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		
		System.out.println(alarmasActuales);
		
		
		
		
	}

}
