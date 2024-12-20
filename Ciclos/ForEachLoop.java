public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] arregloInt = {1,2,3,4,5,5,6};

		for (int a : arregloInt) {

			System.out.print(a + ", ");
			
		}

		System.out.println();

		System.out.print("La suma de los números anteriores es: ");

		int suma = 0;

		for (int a : arregloInt) {

			suma += a;
			
		}

		System.out.println(suma);

		String[] arregloString = {"Hola", "mundo", ",", "sigan", "practicando", "."};

		System.out.print("Cadena: ");

		for (String b : arregloString) {

			System.out.print(b + " ");
			
		}

		char[][] matrizChar = {

			{'X','O','X','O'},
			{'O','X','O','X'},
			{'X','O','X','O'}

		}

		System.out.println("Matriz de char's: ");

		for (char[] fila : matrizChar) {

			for (char c : fila) {

				System.out.print(c + " ");
				
			}

			System.out.println();
			
		}

	}

}