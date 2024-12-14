public class Restaurante{

	public static int sumaArreglo(int[] arr){

		int sumita = 0;

		for(int i = 0; i < arr.length; i++){

			sumita += arr[i];

		}//Fin for suma valores del arreglo 

		return sumita;
		
	}//Fin método sumaArreglo

	public static void main(String[] args){

		Persona personita = new Persona();
		Ticket ticketito = new Ticket();
		Menu menucito = new Menu();

		int dineroTotal[] = new int [16];
		int contM1 = 0;
		int contM2 = 0;
		int contM3 = 0;

		for(int a = 1; a <= 15; a++){

			personita.generaPersona();

			System.out.println("\n************* Ticket " + a + " *************");
			ticketito.imprimeComprobante(personita);

			dineroTotal[a] = ticketito.getTotalidad();

			ticketito.conteoMenus(menucito.getMenu());

			if(ticketito.getCont() == 1){

			contM1++;

			} else if(ticketito.getCont() == 2){

			contM2++;

			} else if(ticketito.getCont() == 3){

			contM3++;

			}//Fin if aumenta cont

		}//Fin for 15 veces

		/*
		personita.generaPersona();

		System.out.println("\n************* Ticket n *************");
		ticketito.imprimeComprobante(personita);
		*/

		System.out.println("\nMenús vendidos: ");
		System.out.println("Menú 1: " + contM1 + " personas lo pidieron");
		System.out.println("Menú 2: " + contM2 + " personas lo pidieron");
		System.out.println("Menú 3: " + contM3 + " personas lo pidieron");

		System.out.println("\nY recaudamos $" + sumaArreglo(dineroTotal) + "!!!");

		/*
		//Imprime valores en el arreglo a sumar
	
		int j = 0;

		while(j < dineroTotal.length){

			System.out.println(dineroTotal[j]);

			j++;

		}

		*/

	}//Fin main

}//Fin class
