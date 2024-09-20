package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
			
		
		productoA.nombre = "Paracetamol 1GR";
		productoA.descripcion = "Contra el dolor";
		productoA.precio = 1.20;
		productoA.stockActual = 200;

		
		productoB.nombre = "Mentol Chino";
		productoB.descripcion = "Para dolores musculares";
		productoB.precio = 1;
		productoB.stockActual = 100;
		
		
		productoC.nombre = "Cicatricure";
		productoC.descripcion = "Crema para las cicatrices ";
		productoC.precio = 8.10;
		productoC.stockActual = 20;
		
		
		System.out.println("Producto A Nombre: " + productoA.nombre + " Descripción: " + productoA.descripcion + " Precio: " + productoA.precio + " Stock: " + productoA.stockActual );
		System.out.println("Producto B Nombre: " + productoB.nombre + " Descripción: " + productoB.descripcion + " Precio: " + productoB.precio + " Stock: " + productoB.stockActual );		
		System.out.println("Producto C Nombre: " + productoC.nombre + " Descripción: " + productoC.descripcion + " Precio: " + productoC.precio + " Stock: " + productoC.stockActual );

		
		
	}

}
