import Excepciones.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.print("Introduce tu nombre: ");
			String nombre = sc.nextLine();

			if ((nombre.isEmpty()) || (nombre.length() < 3)) {

				throw new NombreInvalidoException("El nombre debe tener al menos 3 caracteres.");

			}

			System.out.print("Introduce tu edad: ");
			int edad = sc.nextInt();

			if (!(edad >= 18)) {

				throw new EdadInvalidaException("Debes ser mayor de 18 años.");

			}

			System.out.print("Introduce tu correo electrónico: ");
			String correo = sc.next();

			if (!(contains(correo,'@') && (mailDomain(correo)))) {

				throw new CorreoInvalidoException("El correo debe tener un formato válido.");

			}

			Usuario usuario = new Usuario(nombre,edad,correo);
			System.out.println("¡Registro exitoso!");

		} catch (NombreInvalidoException e) {

			System.out.print("Error: ");
			System.out.println(e.getMessage());

		} catch (EdadInvalidaException e) {

			System.out.print("Error: ");
			System.out.println(e.getMessage());

		} catch (CorreoInvalidoException e) {

			System.out.print("Error: ");
			System.out.println(e.getMessage());

		}

	}

	public static boolean contains(String cadena, char car) {

		boolean in = false;
		
		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == car) {

				in = true;

			}
			
		}

		return in;

	}

	public static boolean mailDomain(String correo) {

		boolean correctDomain = false;
		String dominio = "";
		String[] dominios = {".com",".mx"};

		for (int j = correo.indexOf('.'); j < correo.length(); j++) {

			dominio += correo.charAt(j);

		}

		for (int k = 0; k < dominios.length; k++) {

			if (dominio.equals(dominios[k])) {

				correctDomain = true;

			}
			
		}

		return correctDomain;

	}

}