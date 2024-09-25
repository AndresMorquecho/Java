package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class ItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Item p1 = new Item();
		Item p2 = new Item();
		
		p1.setNombre("Coca Cola");
		p1.setProductosActuales(20);
		
		p2.setNombre("Agua");
		p2.setProductosActuales(50);
		
		p1.imprimir();
		p1.vender(4);
		p1.imprimir();
		p1.devolver(2);
		p1.imprimir();
		
		
		p2.imprimir();
		p2.vender(10);
		p2.imprimir();
		p2.devolver(1);
		p2.imprimir();
		
	}

}
