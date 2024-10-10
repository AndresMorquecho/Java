package com.krakedev.persistencia.test.RegistrosEntrada;

import com.krakedev.persistencia.ejercicios.AdminRegistros_Entrada;
import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.entidades.RegistrosEntrada;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAgregarRegistroEntrada {

	
	public static void main(String[] args) {
		
		
		Empleado ep = new Empleado();
		RegistrosEntrada re = new RegistrosEntrada();
		
		ep.setCodigoEmpleado(1111);
		ep.setNombre("Fernando Parrales");

		
		try {
			re.setCodigo_registro(11);
			re.setCedula_empleado("0912345682");
			re.setFecha( Convertidor.convertirFecha("2023/12/15"));
			re.setHora(Convertidor.convertirHora("12:00"));
			re.setCodigoEmpleado(ep);
			

			AdminRegistros_Entrada.agregarRegistroEntrada(re);
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			System.out.println("Error en el tipado de fecha");
		}
		
		
		
		
	}
	
	
	
	
	
	
}
