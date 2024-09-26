package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefonos;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefonos telf = new Telefonos("movi", "223331312", 34);
		Contacto c = new Contacto("Morquecho", telf, 70.2);

		System.out.println("Usuario: " + c.getApellido() + " Información de Contacto: " + c.getTelefono().getOperadora()
				+ " " + c.getTelefono().getNumero() + " Peso: " + c.getPeso());

		Contacto c1 = new Contacto("Sevillano", new Telefonos("movi", "1231231233", 100), 80.0);
		Contacto c2 = new Contacto("Jaramillo", new Telefonos("claro", "1231223231", 101), 90.0);

		AdminContactos ac = new AdminContactos();
		Contacto cMasPesado = ac.buscarMaspesado(c1, c2);
		
		System.out.println("El contacto más pesado es: " + cMasPesado.getApellido() + " Numero Celular: " +  cMasPesado.getTelefono().getNumero() +
						 	" Código: " + cMasPesado.getTelefono().getCodigo() + " Operadora: " +  cMasPesado.getTelefono().getOperadora()	);
		
		
		 boolean mismaOp=  ac.comprarOperadoras(c1, c2);
		 		
		 	System.out.println("Son de la misma Operadora: " + c1.getTelefono().getOperadora() + " y " +  c2.getTelefono().getOperadora() + " Respuesta: " + mismaOp);
		 
	}
}
