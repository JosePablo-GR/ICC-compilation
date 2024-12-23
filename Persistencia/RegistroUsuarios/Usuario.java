import Excepciones.*;

public class Usuario {

	String nombre;
	int edad;
	String correo;

	public Usuario () {

		this.nombre = " - - - ";
		this.edad = 0;
		this.correo = " - - - ";

	}

	public Usuario (String nombre, int edad, String correo) throws NombreInvalidoException, EdadInvalidaException, CorreoInvalidoException{

		setNombre(nombre);
		setEdad(edad);
		setCorreo(correo);

	}

	public void setNombre (String nombre) throws NombreInvalidoException {

		if ((nombre.isEmpty()) || (nombre.length() < 3)) {

			throw new NombreInvalidoException("El nombre debe tener al menos 3 caracteres.");

		}

		this.nombre = nombre;

	}

	public void setEdad (int edad) throws EdadInvalidaException {

		if (!(edad >= 18)) {

			throw new EdadInvalidaException("Debes ser mayor de 18 años.");

		}

		this.edad = edad;

	}

	public void setCorreo (String correo) throws CorreoInvalidoException {

		if (!(correo.contains("@") && (correo.endsWith(".com")))) {

			throw new CorreoInvalidoException("El correo debe tener un formato válido.");

		}

		this.correo = correo;

	}

	@Override
	public String toString () {

		return "Nombre: " + nombre + "\n" +
				"Edad: " + edad + "\n" +
				"Correo electrónico: " + correo;

	}

}