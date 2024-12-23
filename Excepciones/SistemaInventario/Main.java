import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void mostrarAnaquel (String[] anaquel) {

		int i = 0;
		
		for (String x : anaquel) {

			System.out.print(i + ": ");

			if (x == null) {

				System.out.println("Sin producto");

			} else {

				System.out.println(x);

			}

			i++;
			
		}

		System.out.println();

	}

	public static int indiceDisponible(String[] canasta) {

		int index = 0;

		for (int i = 0; i < canasta.length; i++) {

			if (canasta[i] != null) {

				index = i;

			}

		}

		return index;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		String[] anaquel = {"Manzana","Pera","Naranja","Plátano","Jugo","Leche","Huevos","Azúcar","Cereal","Café"};

		String[] inventario = new String[10];
		String[] productosCanasta = new String[anaquel.length];

		for (int i = 0; i < inventario.length; i++) {

			int vacio = rd.nextInt(2);

			inventario[i] = (vacio == 0) ? null : anaquel[i];
			//inventario[i] = null;

		}

		boolean terminado = false;

		while (!terminado) {

			try {

				int contadorVacio = 0;

				for (int j = 0; j < inventario.length; j++) {

					if (inventario[j] == null) {

						contadorVacio++;

					}

				}

				if (contadorVacio == inventario.length) {

					throw new InventarioVacioException("Alacena vacía.");

				}

				System.out.println("\nInventario actual:");
				mostrarAnaquel(inventario);

				System.out.print("\nIngresa el índice del producto que deseas obtener: ");
				int indice = Integer.parseInt(sc.next());

				if (indice < 0 || indice >= inventario.length) {

					throw new IndexOutOfBoundsException("Índice fuera de los límites del inventario.");

				} else if (inventario[indice] == null) {

					throw new ProductoNoDisponibleException("El producto en este índice no está disponible.");

				}

				productosCanasta[indiceDisponible(productosCanasta)] = inventario[indice];
				System.out.println(inventario[indice] + " se agregó a tu canasta.");
				inventario[indice] = null;

				System.out.println("¿Deseas adquirir otro producto? [y / n]");
				char seguir = sc.next().toLowerCase().charAt(0);

				if (seguir == 'n') {

					terminado = true;
					System.out.println("Gracias tu compra.");
					System.out.println("Tu canasta:");
					
					int productos = 0;

					for (int a = 0; a < productosCanasta.length; a++) {

						if (productosCanasta[a] != null) {

							System.out.println(productosCanasta[a]);
							productos++;

						}
						
					}

					System.out.println("\nCompraste "+ productos + " productos.");

				}

			} catch (NumberFormatException e) {

				System.out.println("Error: Debes ingresar un número válido.");

			} catch (IndexOutOfBoundsException e) {

				System.out.print("Error: ");
				System.out.println(e.getMessage()); 

			} catch (ProductoNoDisponibleException e) {

				System.out.print("Error: ");
				System.out.println(e.getMessage());

			} catch (InventarioVacioException e) {

				System.out.print("Error: ");
				System.out.println(e.getMessage());
				return;

			}

		}

	}

}