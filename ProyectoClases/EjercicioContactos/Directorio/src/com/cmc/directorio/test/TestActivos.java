package com.cmc.directorio.test;



import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefonos;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contacto c1 = new Contacto("Peñafiel", new Telefonos("movi", "1234", 4), 400);

		
		
		System.out.println("Info Contacto: Apellido: " + c1.getApellido() + " Operadora: " + c1.getTelefono().getOperadora() + " Numero: " + 
						    c1.getTelefono().getNumero() + " Codigo: " + c1.getTelefono().getCodigo() + " Tiene WhatsApp: " +  c1.getTelefono().isTieneWhatAp() + " Usuario Activo: " + c1.isActivo()	);
		
		
		// ACTIVAR MENSAJERIA
		
		AdminTelefono actMensj = new AdminTelefono();
		actMensj.activarMensajeria(c1.getTelefono());
		
		// ACTIVAR WHATSAPP
		
		AdminContactos actUs = new AdminContactos();
		actUs.activarUsuario(c1);
		
		
		System.out.println("......................PROCESO DE ACTIVACIÓN..................");
		
		
		System.out.println("Info Contacto: Apellido: " + c1.getApellido() + " Operadora: " + c1.getTelefono().getOperadora() + " Numero: " + 
			    c1.getTelefono().getNumero() + " Codigo: " + c1.getTelefono().getCodigo() + " Tiene WhatsApp: " +  c1.getTelefono().isTieneWhatAp() + " Usuario Activo: " + c1.isActivo()	);

		
	
		
	}

}
