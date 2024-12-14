public class Profesor extends Persona {

	Ayudante ayudante;
	String especialidad;

	public Profesor (String nombre, int edad, Ayudante ayudante, String especialidad) {

		super(nombre, edad);
		this.ayudante = ayudante;
		this.especialidad = especialidad;

	}

	@Override
	public void saludar () {

		System.out.println("Mucho gusto, soy el maestro " + this.nombre);

	}

	public void saludar (int alumnos) {

		System.out.print("Bienvenidos, ");

		if ((alumnos <= 10) && (alumnos > 0)) {

			System.out.println("dado que somos muy pocos, otorgaré puntos por asistencia.");

		} else {

			System.out.println("empecemos la clase.");

		}

	}

	private void usoVerCalificaciones (Estudiante alumno) {

		ayudante.verCalificaciones(alumno);

	} 

	protected void asignarCalificacion (Estudiante alumno) {

		for (int i = 0; i < alumno.calificaciones.length; i++) {

			alumno.calificaciones[i] = 10;

		}

	}

	@Override
	public String toString () {

		return "Mi nombre es " + nombre + ", con especialidad en " + especialidad + ".\n" +
				"Me asignaron a " + ayudante.nombre + " como ayudante " +
				"y juntos impartimos clase a " + ayudante.gruposAsignados + " grupos.";

	}

}