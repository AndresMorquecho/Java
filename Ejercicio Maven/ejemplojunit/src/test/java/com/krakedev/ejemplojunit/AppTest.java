package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
       assertTrue(true);
    }

	
	@Test
	public void testSumar() {
		Calculadora c1 = new Calculadora();
		int resultado = c1.Sumar(5,10);
		assertTrue(resultado == 15);
	}
	
	
	@Test
	public void testRestar() {
		Calculadora c1 = new Calculadora();
		int resultado = c1.Restar(10,5);
		assertTrue(resultado == 5);
	}	
	
}
