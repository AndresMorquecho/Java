package com.cmc.evaluacion.entidades.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {

		private ArrayList<Prestamo> prestamos;
		private ArrayList<Cliente> clientes;
		
		public ArrayList<Prestamo> getPrestamos() {
			return prestamos;
		}
		public ArrayList<Cliente> getClientes() {
			return clientes;
		}
		
		public Banco() {
			clientes = new ArrayList<Cliente>();
			prestamos = new ArrayList<Prestamo>();
		}
		
		public Cliente buscarCliente(String cedula) {
			
			Cliente clientesIterados;
			Cliente clienteHayado = null;
			for(int i = 0; i < clientes.size(); i++ ) {
				
				clientesIterados = getClientes().get(i);
				
				if (clientesIterados != null) {
					
					if(clientesIterados.getCedula().equals(cedula)) {
						clienteHayado = clientesIterados;
						break;
					}
										
					
				}

				
			}
			
			return clienteHayado;
		}
		
		
		
		public  void registrarCliente(Cliente cliente) {
			
			Cliente ClienteHayado = buscarCliente(cliente.getCedula());
			
			if(ClienteHayado == null) {
				clientes.add(cliente);
				
			}else {
				System.out.println("Cliente ya existe: "  + cliente.getCedula() );
			}
			
			
			
		}
		
		
		public void asignarPrestamo(String cedula, Prestamo prestamo) {
			
			Cliente ClienteHayado = buscarCliente(cedula);
			
			if(ClienteHayado != null) {	
				
				prestamo.setCliente(ClienteHayado);
				prestamos.add(prestamo);
				
			}else {
				System.out.println("No es cliente del banco");
				
			}		
			
		}
		
		
		public ArrayList<Prestamo> buscarPrestamos(String cedula){
			
			ArrayList<Prestamo> prestamosClientes = new ArrayList<>();
			
			for(int i = 0; i < prestamos.size(); i++ ) {
				Prestamo prestamo = prestamos.get(i);
				
				if(prestamo != null && prestamo.getCliente() != null) {
					
					if(prestamo.getCliente().getCedula().equals(cedula)){
						
						prestamosClientes.add(prestamo);
					}
				}
				

				
			}

			return prestamosClientes;
		}
		
		
	
}
