package com.krakedev.estaticos.utils;



public class Util {

	
	public static String formartearDia(int NumeroDia) {
		
		if(NumeroDia == 1) {
			return "Lunes";
		}else if(NumeroDia == 2) {
			return "Martes";
		}else if(NumeroDia == 3) {
			return "Miercoles";
		}else if(NumeroDia == 4) {
			return "Jueves";
		}else if(NumeroDia == 5) {
			return "Viernes";
		}else if(NumeroDia == 6) {
			return "Sabado";
		}else if(NumeroDia == 7) {
			return "Domingo";
		}else {
			return "Error";
		}
		
	}


	
	
	
}
