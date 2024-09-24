package com.krakedv.test;

import com.krakedv.Demo;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo demo1 = new Demo(155, "Andres Israel");
		
		demo1.setDescripcion("Programador");
		demo1.setPeso(70.2);
		
		
		System.out.println("Nombre: " + demo1.getNombre() + " Codigo " + demo1.getCodigo()  + " descripcion: " + demo1.getDescripcion() + " Peso: " + demo1.getPeso());
		
		
	}

}
