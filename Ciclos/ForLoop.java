import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Contar de 1 en 1
		for (int i = 1; i <= 15; i++) {

			System.out.println("Esta es la iteración " + i);

		}

		System.out.println();

		//Contar de 2 en 2
		for (int j = 0; j <= 100; j += 2) {

			System.out.println("Este es un número par: " + j);

		}

		System.out.println();

		System.out.println("¡Cuenta regresiva!");
		//Contar hacia atrás de 1 en 1
		for (int k = 10; k > -1; k --) {

			System.out.println(k);

		}

		System.out.println();

		//Contamos cómo desee el usuario
		System.out.print("Ingresa un número hasta el cuál quieres contar : ");
		int limite = sc.nextInt();

		System.out.print("Ingresa los saltos que quieres entre números: ");
		int n = sc.nextInt();

		System.out.println("Contaremos de " + n + " en " + n + " hasta el " + limite + ", iniciando desde el 0.\n");
		for (int i = 0; i <= limite; i += n) {

			System.out.println(i);

		}

	}

}