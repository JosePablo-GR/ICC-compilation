import java.util.Scanner;

public class PalabraPalindroma {

	public static void main(String [] algo) {

	   Scanner entrada = new Scanner(System.in);

       System.out.println("Escribe una palabra y sabrás si es palíndroma:");
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

            System.out.println("La palabra es la misma.");

        } else {

            System.out.println("La palabra NO es la misma.");

        }

	}

}