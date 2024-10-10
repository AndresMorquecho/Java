package com.krakedev.persistencia.test.Empleados;

import com.krakedev.persistencia.ejercicios.AdminEmpleado;
import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.utils.Convertidor;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado = new Empleado();
	
		
		try {
			empleado.setCodigoEmpleado(2222);
			empleado.setNombre("Ricardo Gonzales");
			
			empleado.setFecha(Convertidor.convertirFecha("2024/10/09"));
			empleado.setHora(Convertidor.convertirHora("13:45"));
		
			AdminEmpleado.AgregarEmpleado(empleado);
			
		} catch (Exception e) {

			System.out.println("Error en el tipado de fecha");
		}
		
		
		
		
		
		
	}

}
