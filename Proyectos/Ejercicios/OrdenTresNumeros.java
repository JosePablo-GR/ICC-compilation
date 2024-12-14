import java.util.Scanner;

public class OrdenTresNumeros{
	
	public static void main (String [] SpiderMan){

		Scanner entrada = new Scanner(System.in);

		int cambia = 0;

		System.out.println("Este programa ordena números de menor a mayor: \n");

		System.out.println("Ingresa el primer número: ");
		int a = entrada.nextInt();

		System.out.println("\nIngresa el segundo número: ");
		int b = entrada.nextInt();

		System.out.println("\nIngresa el tercer número: ");
		int c = entrada.nextInt();

		if (a == b && b == c){
		cambia = 1;
		}

		if (a == b & a != c & b != c){
		cambia = 2;
		} 

		if (a == c & a != b & c != b){
		cambia = 3;
		} 

		if (b == c & b != a & c != a) {
		cambia = 4;
		} 
		if (a!=b && a!=c && b!=c){
		cambia = 5;
			} //Fin if cambia

		switch (cambia){

		case 1: // a == b == c

				System.out.println("");
				System.out.println(a + "(a)");
				System.out.println(b + "(b)");
				System.out.println(c + "(c)");

				System.out.println("********");

				System.out.println(a + "(a)");
				System.out.println(c + "(c)");
				System.out.println(b + "(b)");


				System.out.println("********");

				System.out.println(b + "(b)");
				System.out.println(a + "(a)");
				System.out.println(c + "(c)");

				System.out.println("********");

				System.out.println(b + "(b)");
				System.out.println(c + "(c)");
				System.out.println(a + "(a)");

				System.out.println("********");

				System.out.println(c + "(c)");
				System.out.println(a + "(a)");
				System.out.println(b + "(b)");

				System.out.println("********");

				System.out.println(c + "(c)");
				System.out.println(b + "(b)");
				System.out.println(a + "(a)");
				
				break;

		case 2: //a == b

				if (c < a && c < b){

				System.out.println("");
				System.out.println(c + "(c)");
				System.out.println(a + "(a)");
				System.out.println(b + "(b)");

				System.out.println("********");

				System.out.println(c + "(c)");
				System.out.println(b + "(b)");
				System.out.println(a + "(a)");

			} else {

				System.out.println("");
				System.out.println(b + "(b)");
				System.out.println(a + "(a)");
				System.out.println(c + "(c)");

				System.out.println("********");

				System.out.println(a + "(a)");
				System.out.println(b + "(b)");
				System.out.println(c + "(c)");				


			}
			
			break;


		case 3: // a == c

			if (b < a && b < c){

				System.out.println("");
				System.out.println(b + "(b)");
				System.out.println(a + "(a)");
				System.out.println(c + "(c)");

				System.out.println("********");

				System.out.println(b + "(b)");
				System.out.println(c + "(c)");
				System.out.println(a + "(a)");

			} else {

				System.out.println("");
				System.out.println(a + "(a)");
				System.out.println(c + "(c)");
				System.out.println(b + "(b)");

				System.out.println("********");

				System.out.println(c + "(c)");
				System.out.println(a + "(a)");
				System.out.println(b + "(b)");

			}
			
			break;

		case 4: // b == c
			
			if (a < b && a < c){

				System.out.println("");
				System.out.println(a + "(a)");
				System.out.println(b + "(b)");
				System.out.println(c + "(c)");

				System.out.println("********");

				System.out.println(a + "(a)");
				System.out.println(c + "(c)");
				System.out.println(b + "(b)");

			} else {

				System.out.println("");
				System.out.println(b + "(b)");
				System.out.println(c + "(c)");
				System.out.println(a + "(a)");

				System.out.println("********");

				System.out.println(c + "(c)");
				System.out.println(b + "(b)");
				System.out.println(a + "(a)");

			}
			
			break;

		case 5:

			if(a>b && a>c) {
				
				//A es el mayor de los tres números (b y c)
				if(b>c) {

					System.out.println("");
					System.out.println(c + "(c)");
					System.out.println(b + "(b)");
					System.out.println(a + "(a)");
				} else {

					System.out.println("");
					System.out.println(b + "(b)");
					System.out.println(c + "(c)");
					System.out.println(a + "(a)");
				}	
				
			//B es el mayor de los tres números (a y c)
			} else if(b>a && b>c) {
				if(a>c) {
					System.out.println("");
					System.out.println(c + "(c)");
					System.out.println(a + "(a)");
					System.out.println(b + "(b)");
				} else {
					System.out.println("");
					System.out.println(a + "(a)");
					System.out.println(c + "(c)");
					System.out.println(b + "(b)");
				}	

			//C es el mayor de los tres números (a y b)
			} else if(c>a && c>b) {
				if(a>b) {
					System.out.println("");
					System.out.println(b + "(b)");
					System.out.println(a + "(a)");
					System.out.println(c + "(c)");
				} else {
					System.out.println("");
					System.out.println(a + "(a)");
					System.out.println(b + "(b)");
					System.out.println(c + "(c)");
				}	
			}
			
			break;

		} //Fin switch

		System.out.println("");

	} //Fin main

} //Fin class
