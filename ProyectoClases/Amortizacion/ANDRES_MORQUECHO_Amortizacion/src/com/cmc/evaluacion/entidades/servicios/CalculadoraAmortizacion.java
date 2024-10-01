package com.cmc.evaluacion.entidades.servicios;
import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	
	
	
	

	public static double calcularCuota(Prestamo prestamo) {

		double valorCuota;
		double co = prestamo.getMonto();
		double i = prestamo.getInteres();
		int n = prestamo.getPlazo();

		i = (i / 100) / 12;

		valorCuota = ((co * i) / (1 - Math.pow((1 + i), -n)));

		return valorCuota;

	}

	public static void generarTabla(Prestamo prestamo) {
		double CuotaFija = calcularCuota(prestamo);
		int nCuota = prestamo.getPlazo();
		double capitalInicial = prestamo.getMonto();
		
	
		
		for(int i = 1; i <= nCuota; i++) {
			Cuota cuota = new Cuota(i);
			cuota.setCuota(CuotaFija);
	        if (i == 1) {
	            cuota.setInicio(capitalInicial);
	        }	


	        prestamo.getCuotas().add(cuota);
		
			
			
		}
		

		
		 for(int i = 0; i <= nCuota - 1; i++) {
			
			
			Cuota cuotaActual = prestamo.getCuotas().get(i);
			Cuota siguienteCuota = null;
			
			if( i < nCuota -1) {
				siguienteCuota = prestamo.getCuotas().get( i+1);
			}
			
			calcularValoresCuota(prestamo.getInteres(), cuotaActual, siguienteCuota);			
		}
 

	}
	
	public static void calcularValoresCuota(double interePrestamo, Cuota CuotaActual, Cuota siguienteCuota) {
		
		
		double interes = (interePrestamo /100) /12;
		
		double interesCuota = CuotaActual.getInicio() * interes;
		double AbonoCapitalCuota = CuotaActual.getCuota() - interesCuota;
		double SaldoCuotaActual = CuotaActual.getInicio() - AbonoCapitalCuota;
		
		
		
		CuotaActual.setInteres(interesCuota);
		CuotaActual.setAbonoCapital(AbonoCapitalCuota);
		CuotaActual.setSaldo(SaldoCuotaActual);
		
		if(siguienteCuota != null) {
			 siguienteCuota.setInicio(SaldoCuotaActual);
		}

		
		
		
		
	}
	
	
	
	public static void mostrarTabla(Prestamo prestamo) {
		
		
		for(int i = 0; i < prestamo.getCuotas().size(); i++  ) {
			Cuota cuota = prestamo.getCuotas().get(i);
			
			cuota.mostrarPrestamo();
			
		}
		
	}
	
	
	

	
	
	
	
}






