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
		
			
		
		productoA.setNombre("Paracetamol 1GR");
		productoA.setDescripcion("Contra el dolor");
		productoA.setPrecio(1.20);
		productoA.setStockActual(200);

		
		productoB.setNombre("Mentol Chino");
		productoB.setDescripcion("Para dolores musculares");
		productoB.setPrecio(1);
		productoB.setStockActual(100);
		
		
		productoC.setNombre("Cicatricure");
		productoC.setDescripcion( "Crema para las cicatrices");
		productoC.setPrecio(8.10);
		productoC.setStockActual(20);
		
		
		System.out.println("Producto A Nombre: " + productoA.getNombre() + " Descripción: " + productoA.getDescripcion() + " Precio: " + productoA.getPrecio() + " Stock: " + productoA.getStockActual() );
		System.out.println("Producto B Nombre: " + productoB.getNombre() + " Descripción: " + productoB.getDescripcion() + " Precio: " + productoB.getPrecio() + " Stock: " + productoB.getStockActual() );		
		System.out.println("Producto C Nombre: " + productoC.getNombre() + " Descripción: " + productoC.getDescripcion() + " Precio: " + productoC.getPrecio() + " Stock: " + productoC.getStockActual() );

		
		
	}

}
