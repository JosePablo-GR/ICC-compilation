import java.util.Scanner;

public class Palabra{

    public static void encontrarSubcadena(String primeraCadena, String segundaCadena){

        int inicio = 0;
        int longui = 0;
        int contadorUno;
        int contadorDos;
        int longitudActual;
        boolean noMatch = false;

        for(int i = 0; i < primeraCadena.length(); i++){

            for(int j = 0; j < segundaCadena.length(); j++){

                longitudActual = 0;
                contadorUno = i;
                contadorDos = j;

                while(contadorUno < primeraCadena.length() && contadorDos < segundaCadena.length() && primeraCadena.charAt(contadorUno) == segundaCadena.charAt(contadorDos)){

                    contadorUno++;
                    contadorDos++;
                    longitudActual++;

                }//Fin while

                if(longitudActual > longui){

                    longui = longitudActual;
                    inicio = i;

                }
            }
        }

        if(longui == 0){

            noMatch = true;

        }

        if(noMatch){

            System.out.println("\nNo hay ninguna subcadena contenida");

        } else {

            int suma = inicio + longui;

            String subcadena = primeraCadena.substring(inicio,suma);
            System.out.println("\nLa subcadena _máxima_ de A en B es: " + subcadena);

        }

    }//Fin método

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Ingresa la cadena A: ");
        String cadenaA = sc.nextLine();

        System.out.println("\nIngresa la cadena B: ");
        String cadenaB = sc.nextLine();
        
        encontrarSubcadena(cadenaA,cadenaB);

    }

}
