public class Estudiante extends Persona {

	String numeroCuenta;
	int[] calificaciones;

	public Estudiante (String nombre, int edad, String numeroCuenta, int[] calificaciones) {

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

		for (int x : this.getCalificaciones()) {

			System.out.println(x);
			
		}

		System.out.println();

	}

	public void setNumeroCuenta (String numeroCuenta) {

		this.numeroCuenta = numeroCuenta;

	}

	public void setCalificaciones (int[] calificaciones) {

		this.calificaciones = calificaciones;

	}

	public String getNumeroCuenta () {

		return numeroCuenta;

	}

	public int[] getCalificaciones () {

		return calificaciones;

	}

	@Override
	public String toString () {

		return "Nombre : " + nombre + " (" + edad + ")" + "\n" + 
				"Num. Cuenta: " + numeroCuenta;

	}

}