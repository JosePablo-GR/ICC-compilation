public class Usuario {

	String nombre;
	int edad;
	String correo;

	public Usuario (String nombre, int edad, String correo) {

		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;

	}

	@Override
	public String toString () {

		return "Nombre: " + nombre + "\n" +
				"Edad: " + edad + "\n" +
				"Correo electrónico: " + correo;

	}

}