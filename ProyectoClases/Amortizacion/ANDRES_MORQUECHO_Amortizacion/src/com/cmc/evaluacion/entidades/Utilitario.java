package com.cmc.evaluacion.entidades;

import java.text.DecimalFormat;

public class Utilitario {

	    public static double redondear(double valor) {
	        DecimalFormat df = new DecimalFormat("#.00");
	        String valorFormateado = df.format(valor);
	        return Double.parseDouble(valorFormateado);
	    }
   
}

