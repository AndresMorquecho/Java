package com.krakedev.persistencia.test.Empleados;

import com.krakedev.persistencia.ejercicios.AdminEmpleado;
import com.krakedev.persistencia.entidades.Empleado;

public class TestEliminarEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleadoEliminar = new Empleado();
		
		empleadoEliminar.setCodigoEmpleado(2222);
		
		try {
			AdminEmpleado.EliminarEmpleado(empleadoEliminar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al intentar eliminar" + e);
		}
		
		
		
		
		
		
	}

}
