import java.util.Scanner;

public class PruebaCase{

	public static void main(String... args){

		String palabraOne;
		String palabraFinal;		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa una primera palabra: ");
		palabraOne = sc.next();

		System.out.println("Ingresa una palabra a comparar");
		palabraFinal = sc.next();

		if(palabraFinal.equalsIgnoreCase(palabraOne)){

			System.out.println("\nEs la misma palabra :)");
			//System.out.println("Tal vez sea diferente ");

		} else {

			System.out.println("\nNo es la misma palabra");

		}//Fin if es la misma

	}//Fin main

}//Fin class