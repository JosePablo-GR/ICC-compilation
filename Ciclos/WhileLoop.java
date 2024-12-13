import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		//Caso 1. Con una variable de detención
		int a = 1;

		System.out.println("Tabla de multiplicar del 8");
		while (a < 11) {

			int producto = 8 * a;

			System.out.println("8x" + a + " = " + producto);

			//Evitamos ciclo infinito
			a++;

		}

		System.out.println();

		//Caso 2. Variable booleana de paro con condicional
		boolean repetirse = true;

		System.out.println("Iniciamos con una variable booleana en: " + repetirse);
		while (repetirse) {

			//System.out.println("Estado de la variable: " + repetirse);
			System.out.println("¿Deseas cambiar el estado? [y/n]");
			char change = lector.next().charAt(0);

			if (change == 'y') {

				repetirse = false;

			}

			System.out.println("Estado de la variable: " + repetirse);

		}

	}

}