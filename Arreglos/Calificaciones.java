import java.util.Scanner;

public class Calificaciones {

	public static double[] filtroCalificaciones (double[] arreglo) {

		double[] masAltaBaja = new double[2];

		double masAlta = arreglo[0];
		double masBaja = arreglo[0];


    	for (int j = 1; j < arreglo.length; j++) {

    		if (arreglo[j] > masAlta) {

    			masAlta = arreglo[j];

    		}
        
	        if (arreglo[j] < masBaja) {

	        	masBaja = arreglo[j];

	        }

    	}

    	masAltaBaja[0] = masAlta;
		masAltaBaja[1] = masBaja;

		return masAltaBaja;

	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingresa la cantidad de materias que llevas: ");
		int materias = teclado.nextInt();

		double[] calificaciones = new double[materias];

		System.out.println();

		for (int i = 0; i < materias; i++) {

			System.out.print("Ingresa la calificación de la materia " + (i + 1) + ": ");
			double calificacion = teclado.nextDouble();

			calificaciones[i] = calificacion;
			
		}

		System.out.print("\nCalificaciones: ");
		for (double x : calificaciones) {

			System.out.print(x + ", ");
			
		}

		System.out.println();

		double[] masAltaBaja = filtroCalificaciones(calificaciones);

		if (masAltaBaja[0] != masAltaBaja[1]) {

			System.out.print("La calificación más alta es de: ");
			System.out.println(masAltaBaja[0]);

			System.out.print("La calificación más baja es de: ");
			System.out.println(masAltaBaja[1]);

		}

	}

}