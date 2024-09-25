package com.cmc.repaso.entidades;

public class Validacion {

	
	public Boolean  validarMonto(double monto) {
		
		Boolean validacion = null;
		
			if(monto > 0) {
				validacion = true;
			}else {
				validacion = false;
			}
			
			return validacion;
			
			
	}
	
	
}
