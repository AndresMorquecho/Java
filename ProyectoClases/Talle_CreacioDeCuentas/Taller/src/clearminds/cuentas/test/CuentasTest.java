package clearminds.cuentas.test;

import clearminds.cuentas.*;

public class CuentasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuenta cuenta1 = new Cuenta("03476");
		Cuenta cuenta2 = new Cuenta("034766", "C", 98.0);
		Cuenta cuenta3 = new Cuenta("03476");
		Cuenta cuenta4 = new Cuenta("0987");
		Cuenta cuenta5 = new Cuenta("0557", "C", 10.0);
		Cuenta cuenta6 = new Cuenta("0666", "A", 0.0);
		
		cuenta1.setSaldo(675.0);
		cuenta3.setTipo("C");
	
		
		System.out.println("----------Valores Iniciales----------");
		
		cuenta1.ImprimirCuentas();
		cuenta2.ImprimirCuentas();
		cuenta3.ImprimirCuentas();
		
		
		System.out.println("----------Valor Modificados----------");
		
		
		
		cuenta1.setSaldo(444.0);
		cuenta3.setSaldo(567.0);
		cuenta2.setTipo("D");
		
		
		cuenta1.ImprimirCuentas();
		cuenta2.ImprimirCuentas();
		cuenta3.ImprimirCuentas();
		
		
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10.0);
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	
		
		
		
	}
	
	
		

	
	
	
}
