package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;


public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p1 = new Producto("PS5", 700.0);
		Double PrecioDescuento;
		
		
		
		p1.setPrecio(-700.0);
		
		System.out.println(p1.getPrecio());
	
		 PrecioDescuento = p1.calcularPrecioPromo(17.0);

		 System.out.println(PrecioDescuento);
		
	}
	

}
