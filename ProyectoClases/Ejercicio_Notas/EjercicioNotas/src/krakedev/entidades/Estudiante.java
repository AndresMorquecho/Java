package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;



	public Estudiante(String cedula, String nombre, String apellido) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.cedula = cedula;
		
		notas = new ArrayList<Nota>();
	}

	public void agregarNota(Nota nuevaNota) {
	    // Verificar que la nota esté en el rango permitido antes de hacer cualquier cosa.
	    if (nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
	        System.out.println("La nota debe ser entre 0 y 10");
	        return; // Si no está en el rango, salir del método.
	    }

	    if (notas.size() > 0) {
	        boolean codigoExistente = false;

	        for (int i = 0; i < notas.size(); i++) {
	            Nota notasIteradas = notas.get(i);

	            // Asegurarse de que la materia y el código no son null.
	            if (notasIteradas.getMateria() != null && notasIteradas.getMateria().getCodigo() != null) {
	                if (nuevaNota.getMateria().getCodigo().equals(notasIteradas.getMateria().getCodigo())) {
	                    System.out.println("El código ingresado ya existe");
	                    codigoExistente = true;
	                    break;
	                }
	            }
	        }

	        if (!codigoExistente) {
	            notas.add(nuevaNota);
	        }
	    } else {
	        notas.add(nuevaNota);
	    }
	}



	public void modificarNota(String codMateria, double Nuevanota) {

		Nota notasIteradas;
		Materia materiaIterada;
		boolean encontrada = false;

		if (Nuevanota > 0 && Nuevanota <= 10) {

			for (int i = 0; i < notas.size(); i++) {

				notasIteradas = notas.get(i);

				if (notasIteradas != null && notasIteradas.getMateria() != null) {

					materiaIterada = notasIteradas.getMateria();

					if (codMateria.equals(materiaIterada.getCodigo())) {

						notasIteradas.setCalificacion(Nuevanota);
						encontrada = true;
						break;
					}

				}

				if (encontrada == false) {
					System.out.println("No se encontro el codigo");
				}

			}

		} else {
			System.out.println("La nota debe ser entre 0 y 10");
		}

	}

	public double calcularPromedioNotasEstudiante() {

		Nota notasIteradas;
		double promedio = 0.0;
		int contador = 0;
		double sumaNotas = 0;

		for (int i = 0; i < notas.size(); i++) {

			notasIteradas = notas.get(i);

			if (notasIteradas != null) {

				contador += 1;

				sumaNotas += notasIteradas.getCalificacion();

			}

			promedio = sumaNotas / contador;

		}

		return promedio;

	}

	public void mostrar() {
	    for (int i = 0; i < notas.size(); i++) {
	        Nota nota = notas.get(i); // 

	        if (nota != null) {
	            System.out.println("Nombre: " + nombre + 
	                               " Apellido: " + apellido + 
	                               " Cedula: " + cedula + 
	                               " Materia: " + nota.getMateria().getNombre() + 
	                               " Calificacion: " + nota.getCalificacion());
	        }
	    }
	}

	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
