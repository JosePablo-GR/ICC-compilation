import java.util.Scanner;

public class CadenaCaracter{

	public static String completa(String cadena1, char charsito){

		boolean var;
		int contadorl = 0;
		String masLetras = "";
		System.out.println();

		for(int i = 0; i < cadena1.length(); i++){

			var = charsito == cadena1.charAt(i);

			if(var){

				contadorl++;

			}

			System.out.println(cadena1.charAt(i) + " es igual a '" + charsito + "'? " + var);

			if(contadorl > 1){

				masLetras = "\nLa cadena ya contiene esa letra" + "\n" + contadorl + " veces";

			} else {

				masLetras = "\nLa cadena NO contiene esa letra";

			}

		}

		return masLetras;

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("La palabra es 'anita lava la tina'");

		System.out.println("Ingresa un char: ");
		char l = sc.next().charAt(0);

		System.out.println(completa("anita lava la tina",l));

	}

}
