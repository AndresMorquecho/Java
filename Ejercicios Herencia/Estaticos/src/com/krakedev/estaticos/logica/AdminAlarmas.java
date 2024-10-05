package com.krakedev.estaticos.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.entidades.Alarma;

public class AdminAlarmas {

	private ArrayList<Alarma> alarmas;
	
	
	public AdminAlarmas() {
		
		alarmas = new ArrayList<Alarma>();
		
		
	}
	
	public void agregarAlarma(Alarma alarma) {
		
		alarmas.add(alarma);
		
	}

	
	
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	
	
	
	
}
