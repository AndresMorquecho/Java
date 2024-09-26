package com.clearminds.maquina;


import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {

		//this.celda1.setCodigo(cod1);
		//this.celda2.setCodigo(cod2);
		//this.celda3.setCodigo(cod3);
		//this.celda4.setCodigo(cod4);
			
	       celda1 = new Celda(cod1);
	       celda2 = new Celda(cod2);
	       celda3 = new Celda(cod3);
	       celda4 = new Celda(cod4);

		
	}
	
	
	

	public void mostrarConfiguracion() {
		
	       System.out.println("Configuración de la máquina:");
	       System.out.println("Celda 1: " + celda1.getCodigo());
	       System.out.println("Celda 2: " + celda2.getCodigo());
	       System.out.println("Celda 3: " + celda3.getCodigo());
	       System.out.println("Celda 4: " + celda4.getCodigo());
	}

	
	
	
	public Celda buscarCelda(String codCelda) {

		Celda celdaHayada = null;

		if (codCelda == celda1.getCodigo()) {
			celdaHayada = celda1;
		} else if (codCelda == celda2.getCodigo()) {
			celdaHayada = celda2;
		} else if (codCelda == celda3.getCodigo()) {
			celdaHayada = celda3;
		} else if (codCelda == celda4.getCodigo()) {
			celdaHayada = celda4;
		}

		return celdaHayada;

	}

	public void cargarProducto(Producto atriProd, String codCelda, int stockIni) {

		Celda celdaRecuperada = buscarCelda(codCelda);
		
		if(celdaRecuperada != null) {
		celdaRecuperada.ingresarProducto(atriProd, stockIni);
		}
	}

	public void mostrarProductos() {

		System.out.println("***************CELDA A1");
		System.out.println( "Stock: "  + celda1.getStock());
		if(celda1.getProducto() == null){
			System.out.println("La celda no tiene producto!!!!");
		}else {
			System.out.println("Nombre Producto: "  + celda1.getProducto().getNombre());
			System.out.println("Nombre Precio: "  + celda1.getProducto().getPrecio());
			System.out.println("Nombre Código: "  + celda1.getProducto().getCodigo());
		}
		
		// PRODUCTO 2
		
		System.out.println("***************CELDA A2");
		System.out.println( "Stock: "  + celda2.getStock());
		if(celda2.getProducto() == null){
			System.out.println("La celda no tiene producto!!!!");
		}else {
			System.out.println("Nombre Producto: "  + celda2.getProducto().getNombre());
			System.out.println("Nombre Precio: "  + celda2.getProducto().getPrecio());
			System.out.println("Nombre Código: "  + celda2.getProducto().getCodigo());
		}
		
		// PRODUCTO 3
		
		System.out.println("***************CELDA A3");
		System.out.println( "Stock: "  + celda3.getStock());
		if(celda3.getProducto() == null){
			System.out.println("La celda no tiene producto!!!!");
		}else {
			System.out.println("Nombre Producto: "  + celda3.getProducto().getNombre());
			System.out.println("Nombre Precio: "  + celda3.getProducto().getPrecio());
			System.out.println("Nombre Código: "  + celda3.getProducto().getCodigo());
		}		
		
		
		// PRODUCTO 4
		
		System.out.println("***************CELDA A4");
		System.out.println( "Stock: "  + celda4.getStock());
		if(celda4.getProducto() == null){
			System.out.println("La celda no tiene producto!!!!");
		}else {
			System.out.println("Nombre Producto: "  + celda4.getProducto().getNombre());
			System.out.println("Nombre Precio: "  + celda4.getProducto().getPrecio());
			System.out.println("Nombre Código: "  + celda4.getProducto().getCodigo());
		}		
		
		
		System.out.println("Saldo: " + saldo);
	}
	
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
	       Celda celda = buscarCelda(codigoCelda);
	       if (celda != null) {
	           return celda.getProducto();
	       }
	       return null; 
		
	}
	
	
	// DUDAS

	public double consultarPrecio(String codCelda) {
		double precioProducto = 0 ;
		Producto productoHayada;
		
		  productoHayada =	buscarProductoEnCelda(codCelda);
		
		  if(productoHayada != null) {
			  precioProducto = productoHayada.getPrecio();
		  }
		
		
		
		return precioProducto;
		
	}
	
	//DUDAS
	
	public Celda buscarCeldaProducto(String codProducto) {
			
		Celda celdaHayada = null;
		
		if(celda1.getProducto() != null && codProducto == celda1.getProducto().getCodigo()) {
			celdaHayada = celda1;
		}else if(celda2.getProducto() != null && codProducto == celda2.getProducto().getCodigo()) {
			celdaHayada = celda2;
		}else if(celda3.getProducto() != null && codProducto == celda3.getProducto().getCodigo()) {
			celdaHayada = celda3;
		}else if(celda4.getProducto() != null && codProducto == celda4.getProducto().getCodigo()) {
			celdaHayada = celda4;}
			
		
		
		return celdaHayada;		
		
	}
	
		
	public void incrementarProductos(String codProducto, int cantIncremento) {
		
		Celda celdaEncontrada=  buscarCeldaProducto(codProducto);
		int stockActual = celdaEncontrada.getStock();
		celdaEncontrada.setStock( stockActual + cantIncremento);
	
	}
	
	
	public void vender(String codCelda) {
	  Celda celdaHayada =	buscarCelda(codCelda);
	  int Stock = celdaHayada.getStock();
	  celdaHayada.setStock( Stock -1);
	  
	  double precioProducto  = celdaHayada.getProducto().getPrecio();
	  
	  this.saldo +=  precioProducto;
	  
	  mostrarProductos();
	  
	  
	  
	}
	
	
	public  double venderConCambio(String codCelda, Double dineroIngresado) {
		double cambio = 0;
		
		 Celda celdaHayada = buscarCelda(codCelda);
		  int Stock = celdaHayada.getStock();
		  celdaHayada.setStock( Stock -1);
		  
		  double precioProducto  = celdaHayada.getProducto().getPrecio();
		  this.saldo +=  precioProducto;
		  
		  if(dineroIngresado > precioProducto) {
			  cambio = dineroIngresado - precioProducto;
		  }
		  
		
		
		return cambio;
	}
	
	
	
	

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	
	
	

}
