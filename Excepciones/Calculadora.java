import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Ingresa el primer número: ");
			int a = Integer.parseInt(sc.next());

			System.out.print("Ingresa el segundo número: ");
			int b = Integer.parseInt(sc.next());

			System.out.println("Selecciona una operación");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			int operacion = Integer.parseInt(sc.next());

			switch (operacion) {

				case 1:

					System.out.println("El resultado es: " + (a + b));

					break;

				case 2:

					System.out.println("El resultado es: " + (a - b));

					break;

				case 3:

					System.out.println("El resultado es: " + (a * b));

					break;

				case 4:

					System.out.println("El resultado es: " + (a / b));

					break;

				default:

					throw new ArrayIndexOutOfBoundsException();

			}
			

		} catch (NumberFormatException e) {

			System.out.println("Error: Debes ingresar un número válido.");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Error: Opción de operación no válida.");

		} catch (ArithmeticException e) {

			System.out.println("Error: No se puede dividir por cero.");

		} finally {

			System.out.println("Programa finalizado. Gracias por usar la calculadora.");

		}

	}

}