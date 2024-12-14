import java.util.Scanner;
import java.util.Random;

public class Canicas{

	public void juego (){

		Scanner lector = new Scanner(System.in);
		Random aleatorio = new Random();

		boolean seRepite = true;
		boolean otraVez = true;

		System.out.println("Bienvenido, jueguemos canicas, inspirado en el Juego del Calamar");
		System.out.println("Acabo de repartir 10 canicas para la computadora y 10 para Miguel");

		int jugador = 10;
		int compu = 10;

		while (seRepite) {

			/////////Nosotros adivinamos/////////
		System.out.println("\nMiguel, es tu turno de adivinar");
		System.out.println("¿cuántas canicas quieres apostar?");
		System.out.println("Tienes " + jugador + " canicas");

		int apuestaJugador = lector.nextInt();

		if(apuestaJugador > jugador){

			System.out.println("\nNo tienes esa cantidad de canicas, elige una cantidad entre 1 y " + jugador);

		} else if(apuestaJugador <= 0){
		
		System.out.println("\nNo te hagas, tienes que apostar");	
	
		} else {

		jugador -= apuestaJugador;

		System.out.println("\nLa computadora eligirá cuántas canicas apostará...");

		int apuestaCompu = aleatorio.nextInt(compu)+1;

		if(apuestaCompu >= compu){

			compu = 0;

		} else {

			compu -= apuestaCompu;

		}//Fin compu se pasa

		boolean par;
		boolean impar;

		if(apuestaCompu % 2 == 0){

			par = true;
			impar = false;

		} else {

			impar = true;
			par = false;

		}//Fin parImpar

		System.out.println("\nMiguel, ¿crees que la cantidad que apostó la computadora es par o impar?");
		System.out.println("Escribe 'P' para par o 'I' para impar");

		char pregunta = lector.next().toUpperCase().charAt(0);

		if((par && pregunta == 'P') || (impar && pregunta == 'I')){

			System.out.println("\nAdivinaste!");

			jugador = jugador + apuestaCompu + apuestaJugador; //Jugador se lleva todo
			
			System.out.println("Te quedarás con las canicas que apostó la computadora");

			if(jugador >= 20){
				seRepite = false;

				System.out.println("\nGanaste por llegar a la cantidad de " + jugador + " canicas! :p");

			} else if (compu >= 20){
				seRepite = false;

				System.out.println("\nPerdiste porque computadora llegó a la cantidad de " + compu + " canicas! :c");

			}

		} else if((par && pregunta == 'I') || (impar && pregunta == 'P')){

			System.out.println("\nErraste");

			compu = compu + apuestaCompu + apuestaJugador; //Compu se lleva todo

			System.out.println("Ahora la computadora tiene las canicas que apostaste");

			if(jugador >= 20){
				seRepite = false;

				System.out.println("\nGanaste por llegar a la cantidad de " + jugador + " canicas! :p");

			} else if (compu >= 20){
				seRepite = false;

				System.out.println("\nPerdiste porque computadora llegó a la cantidad de " + compu + " canicas! :c");

			}

		} else {

			seRepite = false;
			System.out.println("\nEsa respuesta no coincide con ninguna instrucción");
			
		}//Fin tú apuestas 

		par = false;
		impar = false;

		if (seRepite) {

			/////////Computadora adivina/////////
		System.out.println("\nMiguel, es turno de la computadora a adivinar");
		System.out.println("La computadora adivinará si la cantidad que apuestes es par o impar");
		System.out.println("¿cuántas canicas quieres apostar?");
		System.out.println("Tienes " + jugador + " canicas");

		apuestaJugador = lector.nextInt();
		jugador -= apuestaJugador;

		apuestaCompu = aleatorio.nextInt(compu)+1;

		if(apuestaCompu >= compu){

			compu = 0;

		} else {

			compu -= apuestaCompu;

		}//Fin compu se pasa

		if(apuestaJugador % 2 == 0){

			par = true;
			impar = false;

		} else {

			impar = true;
			par = false;

		}//Fin parImpar

		int questComp = aleatorio.nextInt(2);

		if(par && questComp == 0){

			System.out.println("\nComputadora ADIVINÓ");

			compu = compu + apuestaCompu + apuestaJugador;
			
			System.out.println("\nAhora tienes " + jugador + " canicas :(");

		 	if (compu >= 20){
				seRepite = false;

				System.out.println("Y perdiste porque computadora llegó a la cantidad de " + compu + " canicas! :c");

			}

		} else {

			System.out.println("\nComputadora FALLÓ");

			jugador = jugador + apuestaCompu + apuestaJugador;

			System.out.println("\nAhora tienes " + jugador + " canicas :)");

			if(jugador >= 20){
				seRepite = false;

				System.out.println("Y ganaste por llegar a la cantidad de " + jugador + " canicas! :p");


		}//Fin adivina compu

		par = false;
		impar = false;


		}
	
		}//Fin while seRepite juego


		}//Fin se rompe ciclo

		}//Error de más canicas
	
	}//Fin main

}//Fin class
