import java.util.Scanner;

public class SalaCine {

	public static void muestraSala (char[][] sala) {

		System.out.println("P A N T A L L A");
		System.out.println();

		for (char[] fila : sala) {

			for (char asiento : fila) {

				System.out.print(asiento + " ");
				
			}

			System.out.println();
			
		}

		System.out.println();

	}

	public static void muestraSala (char[][] sala, int fila) {

		System.out.println("P A N T A L L A");
		System.out.println();

		// Recorremos las filas
		for (int i = 0; i < sala.length; i++) {

			if (fila == i) {

				System.out.print("-> ");

			} else {

				System.out.print("   ");

			}

			// Recorremos las columnas
			for (int j = 0; j < sala[i].length; j++) {

				System.out.print(sala[i][j] + " ");

			}
            
            System.out.println();

		}

	}

	public static int asientosOcupados (char[][] sala) {

		int contadorAsientos = 0;

		for (int i = 0; i < sala.length; i++) {

			for  (int j = 0; j < sala[i].length; j++) {

				if (sala[i][j] == 'O') {

					contadorAsientos++;

				}

			}
			
		}

		return contadorAsientos;

	}

	public static char[][] llenarSala (char[][] sala) {

		char[][] salaNueva = new char[sala.length][];

		for (int i = 0; i < sala.length; i++) {

			salaNueva[i] = new char[sala[i].length];

		}

		for (int j = 0; j < sala.length; j++) {

			for (int k = 0; k < sala.length; k++) {

				salaNueva[j][k] = 'O';

			}

		}

		return salaNueva;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] sala = {

			{'L','L','L','L','L'},
			{'L','L','L','L','L'},
			{'L','L','L','L','L'},
			{'L','L','L','L','L'}

		};
		
		System.out.println("Bienvenido al cine, te mostramos el estado de la sala:");
		muestraSala(sala);

		System.out.println("¿Qué deseas hacer?");

		int opcion = 0;

		while (opcion != 6) {

			System.out.println("1. Reservar un lugar");
			System.out.println("2. Cancelar mi asiento reservado");
			System.out.println("3. Reservar toda una fila");
			System.out.println("4. Rentar toda la sala");
			System.out.println("5. Mostrar estado actual de la sala");
			System.out.println("6. Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.print("Ingresa la fila que quieres reservar: ");
				int fila = sc.nextInt() - 1;
				muestraSala(sala, fila);

				System.out.print("Ingresa el asiento que quieres (1-5): ");
				int asiento = sc.nextInt() - 1;

				if (sala[fila][asiento] != 'O') {

					sala[fila][asiento] = 'O';
					System.out.println("¡Asiento reservado!\n");
					muestraSala(sala);
					
				} else {

					System.out.println("Asiento ocupado.");

				}

				break;

			case 2:

				if (asientosOcupados(sala) == 0) {

					System.out.println("No hay ningún asiento reservado\n.");
					break;

				}

				System.out.println("Sala actual:\n");
				muestraSala(sala);

				System.out.println("Selecciona la [fila,asiento] que quieres cancelar");
				String cancelacion = sc.next();
				String[] arreglo = cancelacion.split(",");
				int row = Integer.parseInt(arreglo[0]) - 1;
				int seat = Integer.parseInt(arreglo[1]) - 1;

				if (sala[row][seat] == 'O') {

					sala[row][seat] = 'L';
					System.out.println("\nAsiento liberado.");

				} else {

					System.out.println("Ese asiento esta libre.\n");

				}

				break;

			case 3:

				muestraSala(sala);
				System.out.print("Ingresa la fila a reservar: ");
				int filaReserva = sc.nextInt() - 1;

				muestraSala(sala,filaReserva);

				int contador = -1;
				boolean filaReservada = false;

				for (int r = 0; r <= sala.length; r++) {

					contador++;

					if (sala[filaReserva][r] == 'O') {

						System.out.println("No puedes reservar la fila porque hay asientos ocupados.\n");
						break;
						
					}

				}

				if (contador == 4) {


					for (int r = 0; r <= sala.length; r++) {

						sala[filaReserva][r] = 'O';

					}

					System.out.println("¡Fila reservada!\n");

				}


				break;

			case 4:

				String continuar = "no";

				int personas = asientosOcupados(sala);

				if (personas == 0) {

					sala = llenarSala(sala);

				} else {

					System.out.println("Hay " + personas + " personas en la sala.");
					System.out.println("Se te cobrará $100 por sustitución de lugar\n¿Deseas continuar? [y/n]");
					continuar = sc.next().toLowerCase();

					if (continuar.charAt(0) == 'y') {

						int cobro = 100 * personas;
						System.out.println("Tu cobro será de $" + cobro);

						sala = llenarSala(sala);

					}

				}

				if ((personas == 0) || (continuar.charAt(0) == 'y')) {

					System.out.println("nLa sala es toda tuya.");

				}

				break;

			case 5:

				System.out.println();
				muestraSala(sala);

				break;

			case 6:

				System.out.println("\nHasta luego.");

				break;

			default:

				System.out.println("Opción inválida.");

				break;
				
			}

		}

	}

}