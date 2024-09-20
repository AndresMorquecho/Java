package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Calculadora calcu;
		calcu= new Calculadora();
		
		int resultadosuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		
		 resultadoMultiplicacion = calcu.multiplicar(5,5);
		 resultadoDivision = calcu.dividir(16,2);
		 resultadoPromedio = calcu.promediar(10,2,10 );
		 resultadosuma = calcu.sumar(5, 3);
		 resultadoResta = calcu.restar(5, 2);
		 
		 System.out.println( "RESULTADO SUMA: "  + resultadosuma);
		 System.out.println( "RESULTADO RESTA: "  + resultadoResta);
		 System.out.println( "RESULTADO MULTIPLICACIÓN: "  + resultadoMultiplicacion);
		 System.out.println( "RESULTADO DIVISIÓN: "  + resultadoDivision);
		 System.out.println( "RESULTADO PROMEDIO: "  + resultadoPromedio);
		 
		 calcu.mostrarResultado();
		
		 
		 
	}

}
