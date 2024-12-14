public class Persona {

	String nombre;
	int edad;

	public Persona (String name, int age) {

		nombre = name;
		edad = age;

	}

	public void saludar () {

		System.out.println("Hola me llamo " + this.getNombre() + ".");

	}

	public void setNombre (String nombre) {

		this.nombre = nombre;

	}

	public void setEdad (int edad) {

		this.edad = edad;

	}

	public String getNombre () {

		return nombre;

	}

	public int getEdad () {

		return edad;

	}

	@Override
	public String toString () {

		return "Nombre: " + nombre + " de " + edad + " años.";

	}

}
