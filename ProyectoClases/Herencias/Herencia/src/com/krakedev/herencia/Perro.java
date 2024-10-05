package com.krakedev.herencia;

public class Perro extends Animal {

	public void ladrar() {
		System.out.println("El perro ladra");
	}
	
	
	@Override
	
	public void dormir() {
		super.dormir();
		
		System.out.println("Perro durmiendo");
	}
	
}
