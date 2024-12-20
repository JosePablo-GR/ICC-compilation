import java.util.Scanner;

public class Main {

	public static void verificarEdad (int edad) throws EdadInvalidaException {

		if (edad < 18) {

			throw new EdadInvalidaException("Debes ser mayor de edad.");

		}

	}

	public static int verificarEntrada (String entrada) throws EntradaInvalidaException {

		try {

			int numero = Integer.parseInt(entrada);

			if (numero <= 0) {

				throw new EntradaInvalidaException("No se aceptan números negativos.");

			}

			return numero;           

		} catch (NumberFormatException e) {

			throw new EntradaInvalidaException("La entrada no es un número.");

		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Ingresa tu edad: ");
			String age = sc.next();

			int edad = verificarEntrada(age);
			verificarEdad(edad);

			System.out.println("Edad válida.");

		} catch (EntradaInvalidaException e) {

			System.err.println(e.getMessage());

		} catch (EdadInvalidaException e) {

			System.err.println(e.getMessage());

		}

	}

}