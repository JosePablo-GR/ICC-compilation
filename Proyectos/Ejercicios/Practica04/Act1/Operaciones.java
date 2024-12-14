import java.util.Scanner;
import java.util.Random;

class Operaciones{

  Scanner sc = new Scanner(System.in);
  Random rand = new Random();

  int i = 1;
  int calificacion = 10;

/*
	public static int suma (int n1, int n2){

    int sumita = n1 + n2;

    return sumita;

  }//Fin suma

  public static int resta (int n1, int n2){

    int restita = n1 - n2;

    return restita;

  }//Fin resta

  */

	public void basicas(){

    while(i <= 10){

    int n = rand.nextInt(9)+1;
    int m = rand.nextInt(9)+1;

    System.out.println("\nEjercicio " + i);

    int queOperacion = rand.nextInt(2);

    if(queOperacion == 0){ //Será suma

    int suma = n + m;

    System.out.println("¿Cuánto es la suma de " + n + " + " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == suma){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }


    } else { //Será resta

    int resta = n - m;

    System.out.println("¿Cuánto es la resta de " + n + " - " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == resta){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }


    }//Fin suma o resta

    i++;

    }//Fin while

    System.out.println("\nListo, tu calificación es de " +  calificacion);

    if(calificacion >= 6 ){

      System.out.println("APROBADO");

    } else {

      System.out.println("REPROBADO");

    }//Fin aprobado o no

	}//Fin basicas

  public void intermedias(){

    while(i <= 10){

    int n = rand.nextInt(9)+1;
    int m = rand.nextInt(9)+1;

    System.out.println("\nEjercicio " + i);

    int queOperacion = rand.nextInt(3);

    if(queOperacion == 0){ //Será suma

    int suma = n + m;

    System.out.println("¿Cuánto es la suma de " + n + " + " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == suma){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }


    } else if (queOperacion == 1) { //Será resta

    int resta = n - m;

    System.out.println("¿Cuánto es la resta de " + n + " - " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == resta){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }


    } else {

    int multi = n * m;

    System.out.println("¿Cuánto es la multiplicación de " + n + " x " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == multi){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }

    }//Fin suma o resta

    i++;

    }//Fin while

    System.out.println("\nListo, tu calificación es de " +  calificacion);

    if(calificacion >= 6 ){

      System.out.println("APROBADO");

    } else {

      System.out.println("REPROBADO");

    }//Fin aprobado o no

  }//Fin intermedias

  public void avanzadas(){

    while(i <= 10){

    int n = rand.nextInt(9+1);
    int m = rand.nextInt(9+1);

    System.out.println("\nEjercicio " + i);

    int queOperacion = rand.nextInt(4);

    if(queOperacion == 0){ //Será suma

    int suma = n + m;

    System.out.println("¿Cuánto es la suma de " + n + " + " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == suma){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }


    } else if (queOperacion == 1) { //Será resta

    int resta = n - m;

    System.out.println("¿Cuánto es la resta de " + n + " - " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == resta){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }


    } else if (queOperacion == 2){ //Será multiplicación

      int multi = n * m;

    System.out.println("¿Cuánto es la multiplicación de " + n + " x " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == multi){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }

    } else if (queOperacion == 3) { //Será división

    int div = n / m;

    if(n < m || n == 0){

      while(n < m || n == 0){

      n = rand.nextInt(9)+1;

      }

      }//while if n > m

    System.out.println("¿Cuánto es la división de " + n + " ÷ " + m + "?");
    int respuesta = sc.nextInt();

    //System.out.println();

    if(respuesta == div){

      System.out.println("Muy bien:)");

    } else {

      calificacion--;

      System.out.println("Esa no es la respuesta correcta :(");

    }

    }//Fin suma, resta, multi o div

    i++;

    }//Fin while

    System.out.println("\nListo, tu calificación es de " +  calificacion);

    if(calificacion >= 6 ){

      System.out.println("APROBADO");

    } else {

      System.out.println("REPROBADO");

    }//Fin aprobado o no

  }//Fin avanzadas

}//Fin class
