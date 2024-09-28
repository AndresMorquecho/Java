package krakedev.entidades;

public class Nota {

	private Materia materia;
	private double calificacion;

	public Nota(Materia materia, double calificaion) {
			
		this.materia = materia;
		this.calificacion = calificaion;
		
	}

	public void mostrar() {

		System.out.println("Codigo Materia: " + materia.getCodigo() + " Nombre Materia" + materia.getNombre() );
		}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
