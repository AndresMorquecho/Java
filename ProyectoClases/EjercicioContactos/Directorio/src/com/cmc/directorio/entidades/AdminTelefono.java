package com.cmc.directorio.entidades;

public class AdminTelefono {

	
	public void activarMensajeria(Telefonos tf1) {
		
		if(tf1.getOperadora() == "movi") {
			tf1.setTieneWhatAp(true);
		}
		
	}
	
	
	public int contarMovi(Telefonos tf1, Telefonos tf2, Telefonos tf3) {
		
			int contador = 0;
		
			if(tf1.getOperadora() == "movi") {
				
				contador += 1;
			}
			
			if(tf2.getOperadora() == "movi") {
				
				contador += 1;
			}
			
			if(tf3.getOperadora() == "movi") {
				
				contador += 1;
			}
			
			
			return contador;
			
			
		
		
	}
		
	
	public int contarClaro(Telefonos tf1, Telefonos tf2, Telefonos tf3, Telefonos tf4) {
		
		int contador = 0;
	
		if(tf1.getOperadora() == "claro") {
			
			contador += 1;
		}
		
		if(tf2.getOperadora() == "claro") {
			
			contador += 1;
		}
		
		if(tf3.getOperadora() == "claro") {
			
			contador += 1;
		}
		
		if(tf4.getOperadora() == "claro") {
			
			contador += 1;
		}		
		
		
		return contador;
		
		
	
	
}
		
		
	
	
}
