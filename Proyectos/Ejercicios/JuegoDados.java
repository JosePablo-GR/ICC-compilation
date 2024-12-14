import java.util.Scanner;
import java.util.Random;

public class JuegoDados{
	
	public static void Instrucciones(){

		System.out.println("\ni. Si la suma de los dados es 7 u 11 en el primer tiro, el jugador gana.");
		System.out.println("ii. Si la suma de los dados es 2, 3 o 12 en el primer tiro (llamado 'craps'), el jugador pierde.");
		System.out.println("iii. Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte en el 'punto' del jugador.");
		System.out.println("iv. Para ganar, el jugador debe seguir tirando los dados hasta que salga otra vez 'su punto'");
		System.out.println("    (es decir, que tire ese mismo valor de punto)");
		System.out.println("v. El jugador pierde si tira un *7* antes de llegar a su punto");
		System.out.println();

	}//Fin Instrucciones

	public static void main (String [] args) {

	Scanner lector = new Scanner(System.in);
	Random aleatorios = new Random();

	int dadoUno; 
	int dadoDos;
	int puntos = 0;
	int sumaDados = 0;
	boolean centinela = true;

	System.out.println("Este programa simula un juego de dados");
		
	System.out.println("¿Quieres leer las instrucciones del juego? Selecciona 1 para 'sí', cualquier otro número para 'no': ");

		int op = lector.nextInt();lector.nextLine();

		if (op == 1){

			Instrucciones();

		} //Fin if instrucciones

	System.out.println("Escribe tu nombre: ");

	String nombre = lector.nextLine();
	System.out.println("\nCada vez que quieras tirar escribe 'tirar'");

	System.out.println("Empieza a tirar: ");
	String tirada = lector.nextLine().toLowerCase();	

		if (tirada.equals("tirar")){

			dadoUno = aleatorios.nextInt(6)+1;
			dadoDos = aleatorios.nextInt(6)+1;

			System.out.println("\nEl primer dado te dio: " + dadoUno);
			System.out.println("El segundo dado te dio: " + dadoDos);

			sumaDados = dadoUno + dadoDos;

		if (sumaDados == 7 || sumaDados == 11){

					System.out.println();
					System.out.println(nombre + " ha GANADO");

			} else if (sumaDados == 2 || sumaDados == 3 || sumaDados == 12){

					System.out.println("\nCRAPS: " + nombre + " ha PERDIDO, la casa GANA");

				} else {

				puntos = sumaDados;
				System.out.println("\nPor ende, se convierten en puntos, tienes que tirar hasta llegar a una suma de " + puntos);

				sumaDados = 0;

				//System.out.println("PUNTOOOS A LLEGAR: " + puntos);
				//System.out.println("SUUUMA DADOS: " + sumaDados);

				//System.out.println("Se ejecuta solo si entra a puntos");

			while(centinela){

				System.out.println("\nSigue tirando, quieres llegar al " + puntos);
				tirada = lector.nextLine().toLowerCase();
				System.out.println();
				//System.out.println("Este es tu intento num. " + turno);

				if (tirada.equals("tirar")){

					dadoUno = aleatorios.nextInt(6)+1;
					dadoDos = aleatorios.nextInt(6)+1;

						System.out.println("El primer dado te dio: " + dadoUno);
						System.out.println("El segundo dado te dio: " + dadoDos);

				sumaDados = dadoUno + dadoDos;

					}//Fin if tirar

			if (sumaDados == 7){

				centinela = false;

				System.out.println();
				System.out.println(nombre + " ha PERDIDO porque salió suma de " + sumaDados + " :(");

			} else if (sumaDados == puntos){

				centinela = false;
				System.out.println();
				System.out.println(nombre + " ha GANADO por llegar a la suma de " + puntos + "!!");
							
							
			} //Fin ganas o pierdes
						
		} //Fin centinela 


	} //Fin if-ELSE sumas y empieza puntos

			} else {

				System.out.println("\nEsa intrucción no existe :(");

		} //Fin if-else tirar/error
		
	}//Fin main
	
}//Fin class
