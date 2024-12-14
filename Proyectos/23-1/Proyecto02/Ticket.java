public class Ticket{

	Menu menucito = new Menu();

	/*
	public void contadorMenus(Persona persona){

		menucito.queMenu(persona);

		int contM1 = 0;
		int contM2 = 0;
		int contM3 = 0;

		if(menucito.getMenu() == 1){

			contM1++;

		} else if(menucito.getMenu() == 2){

			contM2++;

		} else if(menucito.getMenu() == 3){

			contM3++;

		}//Fin if cuántos menús

		System.out.println();
		System.out.println("\nMenús vendidos: ");
		System.out.println("Menú 1: " + contM1 + " personas lo pidieron");
		System.out.println("Menú 2: " + contM2 + " personas lo pidieron");
		System.out.println("Menú 3: " + contM3 + " personas lo pidieron");

	}//Fin método contadorMenus
	*/

	public void imprimeComprobante(Persona persona){

		String extra = "";

		System.out.println("\t   Cliente atendido:");
		System.out.println("\n	    " + persona.getGenero() + ", " + persona.getEdad() + ", " + persona.getTalla());
		System.out.println("-----------------------------------");
		menucito.queMenu(persona);
		System.out.println("\t       Menú " + menucito.getMenu() + ":");
		System.out.println("\n          " + menucito.getPlatillo());

		switch(menucito.getMenu()){

			case 1:

				if(menucito.getAdicional()){

					extra = "con miel y granola adicional";

				}//Fin if adicional true

				System.out.println("\n\t  Fruta (papaya y sandía) " + extra);

				break;

			case 2:

				if(menucito.getAdicional()){

					extra = "con fruta adicional";

				}//fin if adicional true

				System.out.println("\n\t  Plato de avena " + extra);

				break;

			case 3: 

				if(menucito.getAdicional()){

					extra = "con orden de cebollitas y nopales adicional";

				}//fin if adicional true

				System.out.println("\n\t  Papas horneadas " + extra);


				break;

		}//Fin switch

		System.out.println("\n          " + menucito.getBebida());
		System.out.println("\n\t  Importe: $" + menucito.getPrecio());
		System.out.println("-----------------------------------");
		System.out.println("\t    Adicionales:\n");

		switch(menucito.getAux()){

			case 1:

				System.out.println("\t    Crema para café");

				break;

			case 2:

				System.out.println("\t    Pieza de pan dulce");

				break;

			case 3:

				System.out.println("\t    Sandwich sencillo");

				break;

			case 4:

				System.out.println("\t    Par de quesadillas");

				break;

			case 5:

				System.out.println("\t    Sandwich sencillo");
				System.out.println("\t    Par de quesadillas");

				break;

			case 6:

				System.out.println("\t    Sandwich sencillo");
				System.out.println("\t    Pieza de pan dulce");

				break;

			case 7:

				System.out.println("\t    Sandwich sencillo");
				System.out.println("\t    Dos piezas de pan dulce");

				break;

			case 8:

				System.out.println("\t    Crema para café");
				System.out.println("\t    Sandwich sencillo");

				break;

			case 9:

				System.out.println("\t    Par de quesadillas");
				System.out.println("\t    Pieza de pan dulce");

				break;

			case 10:

				System.out.println("\t    Crema para café");
				System.out.println("\t    Par de quesadillas");

				break;

			case 11:

				System.out.println("\t    Crema para café");
				System.out.println("\t    Pieza de pan dulce");

				break;

			case 12:

				System.out.println("\t    Crema para café");
				System.out.println("\t    Dos piezas de pan dulce");

				break;

			case 13:

				System.out.println("\t    Dos piezas de pan dulce");

				break;


		}//Fin switch

		//System.out.println();

	}//Fin método imprime comprobante

}//Fin class
