import java.util.Scanner;
import java.util.Random;

public class Automovil{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();
		MetodosAuto carroCero = new MetodosAuto();

		int opcion;
		char opcion2;
		double opcion3;
		String opcion4;
		boolean tanqueLleno;

		System.out.println("Bienvenido a tu carro nuevo");
		System.out.println("Para prenderlo presiona 0");

		opcion = entrada.nextInt();

		if(opcion == 0){

			carroCero.setEncendido(true);
			System.out.println("Genial! Como tu auto es nuevo tienes el tanque lleno (50 litros)");
			carroCero.setGasolinaActual(50.00); //Gasolina en litros
			tanqueLleno = true;

		} else {

			System.out.println("\nOk, se mantedrá apagado");
			carroCero.setEncendido(false);
			tanqueLleno = false;
		}//Fin if else encendido inicial

		while(carroCero.getEncendido()){

			System.out.println("\nAhora, ¿qué deseas hacer?");
			System.out.println("1. Avanzar");
			System.out.println("2. Cargar gasolina");
			System.out.println("3. Cargar todo el tanque");
			System.out.println("4. Carreritas");

			opcion = entrada.nextInt();

			if(opcion < 1 || opcion > 4){

				//carroCero.setEncendido(false);
				System.out.println("\nOpción inválida");

			} else {

				switch(opcion){

		case 1:

			System.out.println("\nDime cuántos kilometros quieres avanzar: ");
			int km = entrada.nextInt();

			if(km <= 0){

			System.out.println("\nNo puedes avanzar " + km + " kilometros");
			//carroCero.setEncendido(false);

			} else {

			carroCero.avanzar(km);
			tanqueLleno = false;

			}//Fin if else avanzar

			break;

		case 2:
				
			System.out.println("\n¿Cuánto de gasolina quieres? (considera que el litro cuesta $19.8)");
			System.out.println("a. En pesos");
			System.out.println("b. En litros");
			opcion2 = entrada.next().charAt(0);

			if(opcion2 == 'a' || opcion2 == 'A'){

			System.out.println("\nDe acuerdo, ingresa la cantidad de dinero que aumentarás: ");
			opcion3 = entrada.nextDouble();

				if(opcion3 <= 0){

				System.out.println("\nNo se pueden recargar $" + opcion3);

				} else if (opcion3 > 0 && opcion3 < 19.8){

				System.out.println("\nDebes al menos poner un litro ($19.8)");

				} else {

				carroCero.cargarGasolinaDinero(opcion3);

				}//Fin quieren recargar 0 o menos de 1 l

			} else if(opcion2 == 'b' || opcion2 == 'B'){

			System.out.println("\nOkay, recuerda que la capacidad máxima es de 50 l "); 
			System.out.println("Ingresa la cantidad de litros *enteros* que quieras: ");
			opcion = entrada.nextInt();

			if(opcion == 0){

			System.out.println("\nEntonces para q vienes? ._.");

			} else if (opcion < 0){

			System.out.println("\nNo se puede eso");

			} else {

			carroCero.cargarGasolinaLitros(opcion);

			}//Fin if else cargar de a litro


			} else {

			System.out.println("\nOpción incorrecta");
			//carroCero.setEncendido(false);

			}//Fin qué opción de gas litros o pesos

			break;

		case 3:

			if(tanqueLleno){

			System.out.println("\nEl tanque ya está a la máxima capacidad");

			} else {

			carroCero.cargarTodoElTanque();
			System.out.println("Listo, ya tienes los 50 l");
			}

			break;

		case 4:

			String[] nombre = new String[6];

				nombre[0] = "Meteoro";
				nombre[1] = "McQueen";
				nombre[2] = "Bolt";
				nombre[3] = "Batimovil";
				nombre[4] = "Cangremovil";
				nombre[5] = "Bumblebee";

			if(!tanqueLleno){

			carroCero.revisarGas();
			//System.out.println("");

			}//Fin if aviso

				System.out.println("\nDe acuerdo, empecemos dándole nombre a tu auto: ");
				opcion4 = entrada.next();
				String myCar = opcion4;

				System.out.println("\nLa computadora te asignará a alguien...");
				int i = aleatorios.nextInt(6);

				System.out.println(nombre[i] + " es tu contrincante :O");
				String rival = nombre[i];

				carroCero.carreritas(myCar, rival);

				System.out.println("Por haber participado se te rellenará el tanque completo :D");
				carroCero.setGasolinaActual(50.00);

			break;

		}//Fin switch

			if(carroCero.getGasolinaActual() >= 50.00){
				
				tanqueLleno = true;

			} else {

				tanqueLleno = false;

				}//Fin if tanque lleno después de todo

			}//Fin if opción incorrecta

		}//Fin while encendido

	}//Fin main

}//Fin class
