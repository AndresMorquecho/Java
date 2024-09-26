package com.cmc.directorio.test;


import com.cmc.directorio.entidades.Telefonos;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

		

		Telefonos telf = new Telefonos("movi","09941234123" , 10);

		
		System.out.println("Operadora: " + telf.getOperadora() + " Numero: " + telf.getNumero() + " Codigo: " + telf.getCodigo() );
		
		
		
	}

}
