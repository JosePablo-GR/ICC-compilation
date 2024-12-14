public class Perro extends Mascota {

	String raza;

	public Perro (String nombre, String raza, int edad) {

		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		super.especie = "perro";

	}

	@Override
	public void hacerSonido () {

		System.out.println("Woof");

	}

	public boolean equals (Perro p) {

		boolean igual = true;

		igual = igual && (this.nombre.equals(p.nombre)) ? true : false;
		igual = igual && (this.raza.equals(p.raza)) ? true : false;
		igual = igual && (this.edad == p.edad) ? true : false;

		return igual;

	}

	@Override
	public String toString () {

		return nombre + " es un " + raza + " de " + edad + " años.";

	}

}