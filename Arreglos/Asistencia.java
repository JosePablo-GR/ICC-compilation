import java.util.Random;

public class Asistencia {

	public static void main(String[] args) {

		Random rd = new Random();
		
		//Forma 1
		String[] alumnos = {"Adé","Rafael","Renato","Adele","Aline"};

		System.out.println("Hay " + alumnos.length + " alumnos en el salón.\n");

		for (int i = 0; i < alumnos.length; i++) {

			int dia = rd.nextInt(31) + 1;

			System.out.println("A " + alumnos[i] +  " le toca exponer el día " + dia);

		}

		System.out.println();

		//Forma 2
		char genero[] = new char[5];

		genero[0] = 'M';
		genero[1] = 'H';
		genero[2] = 'H';
		genero[3] = 'M';
		genero[4] = 'M';

		for (char g : genero) {

			System.out.print("El alumno es ");

			if (g == 'M') {

				System.out.println("mujer.");

			} else {

				System.out.println("hombre.");

			}
			
		}

		//Forma 4
		int[] materias;
		materias = new int[] {2,3,1,1,8};

		int alumno = 0;

		System.out.println("\nEl número de materias de " + alumnos[alumno] + " es " + materias[alumno]);

	}

}