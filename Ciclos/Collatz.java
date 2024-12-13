import java.util.Scanner;

public class Collatz {

	public static void main(String [] args){

		boolean centinela = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("Este programa calcula la sucesión de Collatz");
		System.out.print("Ingresa un número (n) con el cuál desees empezar: ");
		int num = sc.nextInt();

		System.out.println();
		System.out.println(num);

		while (num != 1) {

			while ((num % 2 == 0) && (num != 1)) {

				int div = num / 2;
				num = div;

				System.out.println(num);

			}

			while ((num % 2 != 0) && (num != 1)) {

				int multi = 3 * num + 1;
				num = multi;

				System.out.println(num);

			}

		}

	}

}