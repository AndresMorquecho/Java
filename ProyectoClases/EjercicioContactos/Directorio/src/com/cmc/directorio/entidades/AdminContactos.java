package com.cmc.directorio.entidades;

public class AdminContactos {

	
	public Contacto buscarMaspesado(Contacto c1, Contacto c2) {
		
		Contacto masPesado = null;
		
			if(c1.getPeso() > c2.getPeso()) {
				masPesado = c1;
				
			}else if(c2.getPeso() > c1.getPeso()) {
				masPesado = c2;
			}
			
			return masPesado;
	}
	
	
	public boolean comprarOperadoras(Contacto c1, Contacto c2) {
		
		boolean mismoOp  = false;
		
		
		
		if(c1.getTelefono().getOperadora() == c2.getTelefono().getOperadora()) {
			mismoOp = true;
			
		}
		
		return mismoOp;
		
	}
	
	
	public void activarUsuario(Contacto c1) {
		
		if(c1.getTelefono().isTieneWhatAp()) {
			c1.setActivo(true);
			
		};
		
				}
	
}
