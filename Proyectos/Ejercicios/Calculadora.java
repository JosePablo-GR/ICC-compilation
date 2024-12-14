import java.util.Scanner;

public class Calculadora {

	public static void main (String [] pps) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Este programa calcula la suma, resta, multipliccaión y división de dos números dados.\n");
		System.out.print("Ingresa el primer número (a): ");
		int a = entrada.nextInt();

		System.out.print("Ingresa el segundo número (b): ");
		int b = entrada.nextInt();

		System.out.println("\nEl resultado es: ");

		int suma = a + b;
		int resta = a - b;

		System.out.println("s: " + suma);
		System.out.println("r: " + resta);
		System.out.println("d: " + (a / b));
		System.out.println("m: " + (a * b));


	}


}