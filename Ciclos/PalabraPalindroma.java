import java.util.Scanner;

public class PalabraPalindroma {

	public static void main(String [] algo) {

	   Scanner entrada = new Scanner(System.in);

       System.out.println("Escribe una palabra y sabrás si es un palíndromo:");
       String cadenaPal = entrada.nextLine();

       int i = cadenaPal.length();

       System.out.println();
       System.out.println(cadenaPal + " tiene " + i + " letras.");

       String valida = "";

       for (i = i - 1; i >= 0; i--) {

        valida += cadenaPal.charAt(i);

       }

       System.out.println();
       System.out.println(cadenaPal + " al revés es " +  valida);

        if (cadenaPal.equals(valida)) {

            System.out.println("La palabra es la misma, es un palíndromo.");

        } else {

            System.out.println("La palabra no es la misma, no un palíndromo.");

        }

	}

}