package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {

	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correcto;
	private ArrayList<Contacto> incorrecto;
	

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correcto = new ArrayList<Contacto>();
		incorrecto = new ArrayList<Contacto>();
		fechaModificacion = new Date();

	}
	
	
	
	public void depurar() {
		Contacto contactoIterado;
		
		for (int i = 0; i < contactos.size(); i++) {
			
			contactoIterado = contactos.get(i);
			
			if(contactoIterado.getDireccion() == null) {
				incorrecto.add(contactoIterado);
			}else {
				correcto.add(contactoIterado);
			}
			
		}
		
		contactos.clear();
		
	}
	

	public int contarPerdidos() {
		int perdidos = 0;
		Contacto contactoIterado;

		for (int i = 0; i < contactos.size(); i++) {

			contactoIterado = contactos.get(i);

			if (contactoIterado.getDireccion() == null) {
				perdidos += 1;
			}

		}

		return perdidos;

	}
	
	
	



	public int contarFijos() {
	    int fijos = 0;
	    

	    for(int i = 0; i < contactos.size(); i++) {
	        Contacto contactoIterado = contactos.get(i);

	        for (int j = 0; j < contactoIterado.getTelefonos().size(); j++) {
	            Telefono telefonoIterado = contactoIterado.getTelefonos().get(j);
	            
	            if (telefonoIterado.getTipo().equals("Convencional") && telefonoIterado.getEstado().equals("C")) {
	                fijos += 1;
	            }
	        }
	    }
	    
	    return fijos;
	}

	

	public boolean agregarContacto(Contacto contacto) {

		boolean agregado = false;
		Contacto contactoExiste;

		contactoExiste = buscarPorCedula(contacto.getCedula());

		if (contactoExiste == null) {
			if (contacto != null) {
				contactos.add(contacto);
				agregado = true;
				fechaModificacion = new Date();

			}

		}

		return agregado;

	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(fechaModificacion);
	}

	public Contacto buscarPorCedula(String cedula) {

		Contacto contactoIterado;
		Contacto contactoEncontrado = null;

		for (int i = 0; i < contactos.size(); i++) {
			contactoIterado = contactos.get(i);

			if (contactoIterado != null && contactoIterado.getCedula() != null) {

				if (contactoIterado.getCedula().equals(cedula)) {
					contactoEncontrado = contactoIterado;
					break;
				}

			}

		}

		return contactoEncontrado;
	}

	public ArrayList<Contacto> getContacto() {
		return contactos;
	}

	public void setContacto(ArrayList<Contacto> contacto) {
		this.contactos = contacto;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrecto() {
		return correcto;
	}



	public void setCorrecto(ArrayList<Contacto> correcto) {
		this.correcto = correcto;
	}



	public ArrayList<Contacto> getIncorrecto() {
		return incorrecto;
	}



	public void setIncorrecto(ArrayList<Contacto> incorrecto) {
		this.incorrecto = incorrecto;
	}

}
