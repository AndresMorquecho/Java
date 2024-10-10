package com.krakedev.persistencia.test.Empleados;

import com.krakedev.persistencia.ejercicios.AdminEmpleado;
import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado = new Empleado();
		
		
		try {
			empleado.setCodigoEmpleado(2222);
			empleado.setNombre("Israel Bros");
			empleado.setFecha(Convertidor.convertirFecha("2023/10/09"));
			empleado.setHora(Convertidor.convertirHora("09:40"));
			
			AdminEmpleado.ActualizarEmpleado(empleado);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println("Revise el tipado de fecha sea el correcto" + e.getMessage());
		}
		
	}

}
