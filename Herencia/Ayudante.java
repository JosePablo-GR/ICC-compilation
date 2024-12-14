public class Ayudante extends Estudiante {

	int gruposAsignados;
	String tesis;

	public Ayudante (String nombre, int edad, String numeroCuenta, double[] calificaciones, int gruposAsignados, String tesis) {

		super(nombre, edad, numeroCuenta, calificaciones);
		this.gruposAsignados = gruposAsignados;
		this.tesis = tesis;

	}

	@Override
	public void saludar () {

		System.out.println("Estoy emocionado por enseñarles.");

	}

	public boolean verCalificaciones (Estudiante alumno) {

		double[] califAlumno = alumno.calificaciones;
		//int[] califAlumno = alumno.getCalificaciones();

		double suma = 0;
		int materias = califAlumno.length;

		for (double x : califAlumno) {

			suma += x;

		}

		float promedio = (float) suma / materias;

		System.out.println("El promedio de " + alumno.nombre + " es de " + promedio);
		System.out.println("En actas aparecerá " + (promedio = (float) Math.ceil(promedio)));

		//boolean aprobado = (promedio >= 6) ? true : false;

		return (promedio >= 6) ? true : false;

	}

	public void setGruposAsignados (int gruposAsignados) {

		this.gruposAsignados = gruposAsignados;

	}

	public int getGruposAsignados () {

		return gruposAsignados;

	}

	public String getTesis () {

		return tesis;

	}

	@Override
	public String toString () {

		return super.toString() + "\n" +
				"Número de grupos asignados: " + gruposAsignados + "\n" +
				"Tema de tesis actual: " + tesis;

	}

}