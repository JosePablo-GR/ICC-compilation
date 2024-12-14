import java.util.Random;

public class Persona{

		int edad;
		String genero;
		String talla;

		int menu;

		Menu menucito = new Menu();

		public Persona(){}//Fin constructor x omisión

		public Persona(int edad, String genero, String talla){

			this.edad = edad;
			this.genero = genero;
			this.talla = talla;

		}//Fin constructor con parámetros

		public void generaPersona(){

			Random rd = new Random();

			int numGenero = rd.nextInt(2);
			int numTalla = rd.nextInt(4)+1;

			if(numGenero == 0){

				this.genero = "Mujer";

			} else {

				this.genero = "Hombre";

			}//Fin if escoge género

			if(numTalla == 1){

				this.talla = "S";

			} else if(numTalla == 2){

				this.talla = "M";

			} else if(numTalla == 3){

				this.talla = "G";

			} else {

				this.talla = "XG";

			}//Fin if escoge talla

			int[] arrEdad = new int[95]; //Areglo con edades 5-99

			int j = 5;

			for(int i = 0; i < arrEdad.length; i++){

				arrEdad[i] = j;

				j++;

				//System.out.println(edad[i]);

			}//Fin for rellena

			int queEdad = rd.nextInt(arrEdad.length);

			this.edad = arrEdad[queEdad];

			//System.out.println(genero + " de talla " + talla + ", " + edad + " años");

			//int menu = rd.nextInt(3)+1;
			//menucito.setMenu(menu);
			//System.out.println("Pedí el menu " + menucito.getMenu());

		}//Fin método generaPersona

		//Getters
		public int getEdad(){

			return edad;

		}//Fin getEdad

		public String getGenero(){

			return genero;

		}//Fin getGenero

		public String getTalla(){

			return talla;

		}//Fin getTalla

		public String toString(){

			return genero + " de talla " + talla + ", " + edad + " años";

		}//Fin toString

}//Fin class
