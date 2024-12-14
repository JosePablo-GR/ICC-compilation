public class Estudiante extends Persona {

	String numeroCuenta;
	double[] calificaciones;

	public Estudiante (String nombre, int edad, String numeroCuenta, double[] calificaciones) {

		super(nombre,edad);
		this.numeroCuenta = numeroCuenta;
		this.calificaciones = calificaciones;

	}

	@Override
	public void saludar () {

		System.out.println("Me gusta ir a la escuela.");

	}

	public void saludar (String materia) {

		System.out.println("Mi materia preferida es " + materia + ".");

	}

	public void mostrarCalificaciones () {

		for (double x : this.calificaciones) {

			System.out.println(x);
			
		}

		System.out.println();

	}

	public String getNumeroCuenta () {

		return numeroCuenta;

	}

	public double[] getCalificaciones () {

		return calificaciones;

	}

	@Override
	public String toString () {

		return "Nombre: " + nombre + " (" + edad + ")" + "\n" + 
				"Num. Cuenta: " + numeroCuenta;

	}

}