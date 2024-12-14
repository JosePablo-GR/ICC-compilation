import java.util.Scanner;

public class FormulaGeneral{

	public static void main(String[] args){

		boolean imaginario =  false;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Este programa calcula basado en la fórmula general el resultado dado tres números");

		System.out.print("\nIngresa el valor 'a': ");
		double a = entrada.nextDouble();

		System.out.print("Ingresa el valor 'b': ");
		double b = entrada.nextDouble();

		System.out.print("Ingresa el valor 'c': ");
		double c = entrada.nextDouble();

		double dentroRaiz = Math.pow(b,2) - 4*(a*c); //Elevar al cuadrado y restar

		if(dentroRaiz < 0){

		 	imaginario = true;

		}

		double raiz = Math.sqrt(dentroRaiz);
		double opPosi = -b + raiz; //Fórmula general con +
		double opNega = -b - raiz; //Fórmula general con -

		double resul_finalUno = opPosi/(2*a);
		double resul_finalDos = opNega/(2*a);

		if(imaginario){

			System.out.println("\nLa ecuación no tiene solución");

		} else {

			if(resul_finalUno != resul_finalDos){

			System.out.println("\nx1 = " + resul_finalUno);
			System.out.println("x2 = " + resul_finalDos);

		} else {

			System.out.println("\nLa ecuación solo tiene una solución que es:\n" + resul_finalUno);

		}

		}//Fin if boolean Im

	}//Fin main

}//Fin class
