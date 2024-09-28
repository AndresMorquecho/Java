package com.clearminds.maquina;

import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {


	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();

	}

	
	public ArrayList<Producto> buscarMenores(double limite){
		
		ArrayList<Producto> ProductosMenores = new ArrayList<Producto>();
		
		Celda celdaIterada;
		
		for(int i = 0; i < celdas.size();i++) {
			
			celdaIterada = celdas.get(i);
			
			if(celdaIterada.getProducto() != null) {
				
				if(celdaIterada.getProducto().getPrecio() < limite) {
					
					ProductosMenores.add(celdaIterada.getProducto());
				}	
			}
			
		}
		
		return ProductosMenores;
		
		
	}
	
	
	public void agregarCelda(Celda celda) {

		celdas.add(celda);

	}

	public void mostrarConfiguracion() {

		Celda elementoCelda;
		int contador = 1;

		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);

			System.out.println("Celda " + contador + ": " + elementoCelda.getCodigo());
			contador += 1;

		}
	}

	public Celda buscarCelda(String codCelda) {

		Celda celdaIterada;
		Celda celdaEncontrada = null;

		for (int i = 0; i < celdas.size(); i++) {
			celdaIterada = celdas.get(i);

			if (codCelda.equals(celdaIterada.getCodigo())) {

				celdaEncontrada = celdaIterada;
			}
		}

		return celdaEncontrada;
	}
	
	public Celda buscarCeldaProducto(String codProducto) {
		
		Celda celdaHayada = null;
		Celda celdaIterada = null;

		for(int i = 0; i < celdas.size(); i++) {
			
			celdaIterada = celdas.get(i);
			
			if(celdaIterada.getProducto() != null) {
				if(codProducto.equals(celdaIterada.getProducto().getCodigo())) {
					celdaHayada = celdaIterada;
					break;
				}
								
			}
			

			
		}
		
			
		
		
		return celdaHayada;		
		
	}	
	
	
	public double consultarPrecio(String codCelda) {
		
		double precio = 0.0;
		
		Celda celda = buscarCelda(codCelda);
		
		if(celda != null && celda.getProducto() != null) {
			precio = celda.getProducto().getPrecio();
		}
		
		
		
		return precio;
	}
	
	
	
	
	
	public Producto buscarProductoEnCelda(String codCelda) {
		
		Producto productoHayado = null;
		Celda celdaEncontrada = null;
		Celda celdaIterada;
		
		for (int i = 0; i < celdas.size(); i++) {
			celdaIterada = celdas.get(i);

			if (codCelda.equals(celdaIterada.getCodigo())) {

				celdaEncontrada = celdaIterada;
				productoHayado = celdaEncontrada.getProducto();

				
			}
		}		
		
		
	
		return productoHayado;
		
	}
	
	

	public void cargarProducto(Producto producto, String codCelda, int cantidad) {

		Celda celdaRecuperda = buscarCelda(codCelda);
		if (celdaRecuperda != null) {
			celdaRecuperda.ingresarProducto(producto, cantidad);
		}else {
			System.out.println("No existe la celda buscada");
		}

	}

	public void mostrarProductos() {
	    Celda iterada;

	    for (int i = 0; i < celdas.size(); i++) {
	        iterada = celdas.get(i);

	        if (iterada.getProducto() != null) {
	            System.out.println("Celda: " + iterada.getCodigo() + " Stock: " + iterada.getStock() + " Producto: "
	                    + iterada.getProducto().getNombre() + " Precio: " + iterada.getProducto().getPrecio());
	        } else {
	            System.out.println("Celda: " + iterada.getCodigo() + " Sin Producto asginado");
	        }
	    }
	    
	    
	    System.out.println("Saldo: " + saldo);
	}
	
	
	public void incrementarProductos(String codProducto, int Cant) {
		
		Celda celdaEncontrada = buscarCeldaProducto(codProducto);
		
		if(celdaEncontrada.getProducto() != null) {
			
			int stockActual = celdaEncontrada.getStock();
			
			celdaEncontrada.setStock(stockActual + Cant); 
			
		}
	}
	
	
	public void vender(String codCelda) {
	  Celda celdaHayada =	buscarCelda(codCelda);
	  int Stock = celdaHayada.getStock();
	  celdaHayada.setStock( Stock -1);
	  
	  double precioProducto  = celdaHayada.getProducto().getPrecio();
	  
	  this.saldo +=  precioProducto;

	  
	  
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
	


}
