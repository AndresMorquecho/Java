package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto mc;
		AdminProducto admin = new AdminProducto();
		
		Producto productoA = new Producto("Dorito", 0.50);
		Producto productoB = new Producto("Papitas", 0.50);
		
		
		mc = admin.buscarMasCaro(productoA, productoB);
		
		if(mc == null) {
			System.out.println("Son iguales");
		}else {
		System.out.println("El más caro es: " + mc.getNombre());}
		}

}
