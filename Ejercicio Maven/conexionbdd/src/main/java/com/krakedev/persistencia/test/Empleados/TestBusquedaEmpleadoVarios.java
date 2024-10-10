package com.krakedev.persistencia.test.Empleados;

import java.util.ArrayList;

import com.krakedev.persistencia.ejercicios.AdminEmpleado;
import com.krakedev.persistencia.entidades.Empleado;

public class TestBusquedaEmpleadoVarios {

	public static void main(String[] args) {
		
		
		try {
			ArrayList<Empleado> empleados = AdminEmpleado.BusquedaEmpleados("a");
			
			System.out.println(empleados);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
}
