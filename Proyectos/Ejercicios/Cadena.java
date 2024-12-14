import java.util.Scanner;
import java.util.Random;

public class Cadena {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String cadena = "";

		System.out.println("Programa que sirve para ingresar caracteres a una cadena vacía");
		System.out.println("\nIngresa el caracter 0: ");
		String caracter;
			
		for (int i = 0; i < 8; i++) {

			System.out.println("\nIngresa el caracter " + i + ": ");
			caracter = entrada.next().charAt(0);

			cadena += caracter;

			System.out.println("Así va la cadena: " + cadena);

		}

		System.out.println("\nFinalmente la cadena creada quedó: ");
		System.out.println(cadena);	

	}

}
