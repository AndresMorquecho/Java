package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		 estudiantes = new ArrayList<Estudiante>();
	}

	public void mostrar() {

		Estudiante estudianteIterado;

		for (int i = 0; i < estudiantes.size(); i++) {

			estudianteIterado = estudiantes.get(i);

			if (estudianteIterado != null && estudianteIterado.getNotas() != null
					&& estudianteIterado.getNotas().get(i).getMateria() != null) {

				System.out.println(" Nombre: " + estudianteIterado.getNombre() + " Apellido: "
						+ estudianteIterado.getApellido() + " Cedula: " + estudianteIterado.getCedula() + " Materia: "
						+ estudianteIterado.getNotas().get(i).getMateria().getNombre() + " Materia Cod: "
						+ estudianteIterado.getNotas().get(i).getMateria().getNombre() + " Calificacion: "
						+ estudianteIterado.getNotas().get(i).getCalificacion());

			}

		}

	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		boolean estudianteHayado = false;
		Estudiante noEstaEnCurso = null;
		Estudiante estudianteIterado;

		for (int i = 0; i < estudiantes.size(); i++) {

			estudianteIterado = estudiantes.get(i);
			if (estudianteIterado != null && estudianteIterado.getCedula() !=null) {

				if (estudiante.getCedula().equals(estudianteIterado.getCedula())) {
					estudianteHayado = true;
				}
			}

		}

		if (estudianteHayado == true) {
			System.out.println("El estudiante continua en el curso");
		} else {
			noEstaEnCurso = null;
		}
		
		

		return noEstaEnCurso;
	}

	public void matricularEstudiantes(Estudiante estudiante) {

		Estudiante estudianteNoEsta;
		
		estudianteNoEsta = buscarEstudiantePorCedula(estudiante);
		
		if(estudianteNoEsta == null) {
			
			estudiantes.add(estudiante);
			
		}
		

		
	}

	
	public double calcularPromedioCurso() {
		
		double promedioCurso = 0;
		Estudiante estudiantesIterados;
		double sumaNotas = 0;
		int nEstudiantes = 0;	
		
		for(int i = 0; i < estudiantes.size(); i ++) {
			
			estudiantesIterados = estudiantes.get(i);
			
			if(estudiantesIterados !=null  && estudiantesIterados.getNotas().get(i).getMateria() != null ) {
				
				nEstudiantes += 1;
				sumaNotas += estudiantesIterados.getNotas().get(i).getCalificacion();
				
			}
			
			
			
		}
		
		
		promedioCurso = sumaNotas / nEstudiantes;
		
		return promedioCurso;
		
	}

	public void matricularEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
	
}
