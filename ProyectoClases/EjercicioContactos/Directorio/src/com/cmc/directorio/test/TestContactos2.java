package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefonos;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contacto c1 = new Contacto("Guerrero", new Telefonos("movi", "1231231233", 102), 70.0);
		Contacto c2 = new Contacto("Sanchez", new Telefonos("movi", "1231223231", 104), 40.0);
		
		AdminContactos ac = new AdminContactos();
		Contacto cMasPesado = ac.buscarMaspesado(c1, c2);
		
		System.out.println("El contacto más pesado es: " + cMasPesado.getApellido() + " Numero Celular: " +  cMasPesado.getTelefono().getNumero() +
						 	" Código: " + cMasPesado.getTelefono().getCodigo() + " Operadora: " +  cMasPesado.getTelefono().getOperadora()	);
		
		
		 boolean mismaOp=  ac.comprarOperadoras(c1, c2);
		 		
		 	System.out.println("Son de la misma Operadora: " + c1.getTelefono().getOperadora() + " y " +  c2.getTelefono().getOperadora() + " Respuesta: " + mismaOp);		
		
		
	}

}
