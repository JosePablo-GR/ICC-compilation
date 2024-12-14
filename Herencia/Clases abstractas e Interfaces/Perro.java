public class Perro {

	String nombre;
	String raza;
	int edad;

	public Perro (String nombre, String raza, int edad) {

		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;

	}

	public void ladrar () {

		System.out.println("Woof");

	}

	@Override
	public String toString () {

		return nombre + " es un " + raza + " de " + edad + " años."

	}

}