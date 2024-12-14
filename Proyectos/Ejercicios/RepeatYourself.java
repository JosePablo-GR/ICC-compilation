import java.util.Scanner;

public class RepeatYourself {

	public static void main (String [] args){

		int i = 1;
		int j = 1;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa un número el cuál se repitará las mismas veces que ese número sea: ");

		int num = entrada.nextInt();

		System.out.println();
		while(i <= j){

			while (j <= num){
			
				System.out.println(num);

				j++;
				
			}//Fin while j

			i++;

		}//Fin while i

	}//Fin main

}//Fin class
