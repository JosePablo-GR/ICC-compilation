public class Gato extends Mascota {

	public Gato (String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
		super.especie = "gato";

	}

	@Override
	public void hacerSonido () {

		System.out.println("Meow");

	}

	@Override
	public String cazar () {

		String caza = super.cazar();

		caza += " y además ratones.";

		return caza;

	}

	@Override
	public int jugar () {

		int m = 2;

		System.out.println("Yo juego con una bola de estambre " + m + " veces al día.");

		return m;

	}

	@Override
	public void pasear (boolean salir) {

		System.out.print("Soy un " + especie + " y hoy");

		if (!salir) {

			System.out.println(" no salí a pasear porque yo me paso solo.");

		} else {

			System.out.println(" salí a pasear porque me consienten.");

		}

	}

	public String getNombre () {

		return nombre;

	}

	public int getEdad () {

		return edad;

	}

	public boolean equals (Gato g) {

		boolean igual = true;

		igual = igual && (this.nombre.equals(g.nombre)) ? true : false;
		igual = igual && (this.edad == g.edad) ? true : false;

		return igual;

	}

	@Override
	public String toString () {

		return nombre + " tiene " + edad + " años.";

	}

}