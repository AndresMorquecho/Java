package com.krakedev.persistencia.test.Empleados;

import com.krakedev.persistencia.ejercicios.AdminEmpleado;
import com.krakedev.persistencia.entidades.Empleado;

public class TestEmpleadoBusquedaKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Empleado empleado = AdminEmpleado.BuscarporCodigoEmpleado(1111);

			System.out.println(empleado);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	
	
	
	
	

}
