public class Estadistica {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,7,8,9}; // Longitud 9
		int[] numeros = {13,43,12,7,2,0,103,21,80};

		System.out.println("Arreglo: ");

		for (int a : numeros) {

			System.out.print(a + ", ");
			
		}

		int suma = 0;
		int sumaPares = 0;
		int pequenio = numeros[0]; // Suponemos que el más pequeño es el primero
		int grande = numeros[0]; // Suponemos que el más grande es el primero

		for (int  i = 0; i < numeros.length; i++) {

			// Encontrar el número más grande
			if (numeros[i] > grande) {
				
				grande = numeros[i];

			}

			// Encontrar el número más pequeño
			if (numeros[i] < pequenio) {

				pequenio = numeros[i];
				
			}

			if (i % 2 == 0) {

				sumaPares += numeros[i];

			}

			suma += numeros[i];

		}

		System.out.println("\nArreglo de longitud: " + numeros.length);
		System.out.println("Mínimo = " + pequenio);
		System.out.println("Máximo = " + grande);
		System.out.println("\nLa suma de todos los números es: " + suma);
		System.out.println("La suma de los números en los índices pares es: " + sumaPares);
		System.out.println("Recordemos que el conteo empieza desde 0");

	}

}