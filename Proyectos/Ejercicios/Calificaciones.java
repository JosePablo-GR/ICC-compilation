import java.util.Random;

public class Calificaciones {

	public static void main (String [] SpiderMan) {

	Random aleatorios = new Random();

	int contCero = 0;
	int contUno = 0;
	int contDos = 0;
	int contTres = 0;
	int contCuatro = 0;
	int contCinco = 0;
	int contSeis = 0;
	int contSiete = 0;
	int contOcho = 0;
	int contNueve = 0;
	int contDiez = 0;

		for (int veces = 1; veces <= 20; veces++) {

			int califEntera = aleatorios.nextInt(11);

			if (califEntera == 10) {

				System.out.println("A");

			} else if(califEntera == 9) {

				System.out.println("B");

			} else if(califEntera == 8) {

				System.out.println("C");

			} else if(califEntera == 7) {

				System.out.println("D");

			} else if(califEntera == 6) {

				System.out.println("E");

			} else if((califEntera >= 0) && (califEntera <= 5)) {

				System.out.println("F");

			}

			if (califEntera == 0) {

				contCero++;

			} else if (califEntera == 1) {

				contUno++;

			} else if (califEntera == 2) {

				contDos++;

			} else if (califEntera == 3) {

				contTres++;

			} else if (califEntera == 4) {

				contCuatro++;

			} else if (califEntera == 5) {

				contCinco++;

			} else if (califEntera == 6) {

				contSeis++;

			} else if (califEntera == 7) {

				contSiete++;

			} else if (califEntera == 8) {

				contOcho++;

			} else if (califEntera == 9) {

				contNueve++;

			} else if (califEntera == 10) {

				contDiez++;

			} 

		}
		
		System.out.print("\n0: ");
		for (int i = 0; i < contCero; i++) {

			System.out.print("*");

		}

		System.out.print("\n1: ");
		for (int i = 0; i < contUno; i++) {

			System.out.print("*");

		}

		System.out.print("\n2: ");
		for (int i = 0; i < contDos; i++) {

		System.out.print("*");

		}

		System.out.print("\n3: ");
		for (int i = 0; i < contTres; i++) {

			System.out.print("*");

		}

		System.out.print("\n4: ");
		for (int i = 0; i < contCuatro; i++) {

			System.out.print("*");

		}

		System.out.print("\n5: ");
		for (int i = 0; i < contCinco; i++) {

			System.out.print("*");

		}

		System.out.print("\n6: ");
		for (int i = 0; i < contSeis; i++) {

			System.out.print("*");

		}

		System.out.print("\n7: ");
		for (int i = 0; i < contSiete; i++) {

			System.out.print("*");

		}

		System.out.print("\n8: ");
		for(int i = 0; i < contOcho; i++){

			System.out.print("*");

		}

		System.out.print("\n9: ");
		for (int i = 0; i < contNueve; i++) {

			System.out.print("*");

		}

		System.out.print("\n10: ");
		for (int i = 0; i < contDiez; i++) {

			System.out.print("*");

		}

		System.out.println();

	}

}