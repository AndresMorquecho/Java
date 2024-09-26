package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda = new Celda("A1");
		System.out.println(celda.getProducto().getNombre());

		// LINEA DE ERROR 8
		// EXPLICACIÓN
		// SE ESTA INTENTANDO OBTENER EL NOMBRE DE PRODUCTO, PERO "PRODUCTO" NO ESTA
		// DEFINIDA POR LO QUE DEVUELVE UN NULL EN SU ATRIBUTO NOMBRE Y EN CUALQUIER
		// OTRO ATRIBUTO QUE SE INTENTE ACCESER MEDIANTE GET

		System.out.println("CELDA:" + celda.getProducto());
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		System.out.println("*************************************");
	}
}
