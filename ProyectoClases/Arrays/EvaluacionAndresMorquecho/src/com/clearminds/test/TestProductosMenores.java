package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestProductosMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));
        maquina.agregarCelda(new Celda("E"));
        maquina.agregarCelda(new Celda("F"));        

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "A",1 );
		
		Producto producto2 = new Producto("PRTO", "Doritos", 0.5);
		maquina.cargarProducto(producto2, "B", 2);
		
		Producto producto3 = new Producto("KE", "Jet", 0.25);
		maquina.cargarProducto(producto3, "C", 3);
		
		Producto producto4 = new Producto("PR2O", "Detodito", 0.6);
		maquina.cargarProducto(producto4, "D", 4);
		
		Producto producto5 = new Producto("KEF4", "Tango", 1.00);
		maquina.cargarProducto(producto5, "E", 5);
		
		Producto producto6 = new Producto("ARTO", "Coca-Cola", 1.25);
		maquina.cargarProducto(producto6, "F", 6);
		

	   ArrayList<Producto> ProductolowCost = maquina.buscarMenores(1);
	   int Contador = ProductolowCost.size();
	   Producto productos;
	   System.out.println("Productos Menores: " + Contador);
	   for(int i = 0; i < ProductolowCost.size(); i++) {
		  
		   productos = ProductolowCost.get(i);
		   
		   
		   System.out.println("Nombre: " + productos.getNombre() + " Precio: " + productos.getPrecio());
		   
		   
	   }
	   
		
	}
		
		
	}

