package com.krakedev.estaticos.entidades;

import com.krakedev.estaticos.utils.Util;

public class Alarma {

	
	private int dia;
	private int hora;
	private int minuto;
	
	
	
	
	
	public Alarma(int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}
	
	
	
	
	@Override
	public String toString() {
		
	       String diaFormateado = Util.formartearDia(dia);

	        String horaFormateada = String.format("%02d", hora);
	        String minutoFormateado = String.format("%02d", minuto);

	        return diaFormateado + ", " + horaFormateada + ":" + minutoFormateado;
	}

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	
	
	
}
