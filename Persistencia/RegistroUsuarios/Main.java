import Excepciones.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {

			Usuario usuario = new Usuario();

			System.out.print("Introduce tu nombre: ");
			String nombre = sc.nextLine();
			usuario.setNombre(nombre);

			System.out.print("Introduce tu edad: ");
			int edad = Integer.parseInt(sc.next());
			usuario.setEdad(edad);

			System.out.print("Introduce tu correo electrónico: ");
			String correo = sc.next();
			usuario.setCorreo(correo);

			System.out.println("¡Registro exitoso!");
			System.out.println(usuario);

		} catch (NombreInvalidoException | EdadInvalidaException | CorreoInvalidoException e) {

			System.out.print("Error: ");
			System.out.println(e.getMessage());

		} catch (NumberFormatException e) {

			System.out.println("Error: La edad debe ser un número válido.");

		}

	}

}