import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {

		Scanner read = new Scanner (System.in);

		System.out.println("Programa que dados dos números, determina si 'm' es múltiplo de 'n'");
		System.out.print("\nIngresa m: ");
		double m = read.nextDouble();

		System.out.print("Ingresa n: ");
		double n = read.nextDouble();

		System.out.println();

		if (m % n == 0) {

			System.out.println(m + " es múltiplo de " + n);

		} else {

			System.out.println(m + " NO es múltiplo de " + n);

		}
		
	}

}