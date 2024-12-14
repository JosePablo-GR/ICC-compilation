import java.util.Scanner;
import java.util.Random;

class Operaciones{

  Random rand = new Random();
  Scanner sc = new Scanner(System.in);

  int i = 1;
  int calificacion = 10;

	public void basicas () {

    while (i <= 10) {

      int n = rand.nextInt(9) + 1;
      int m = rand.nextInt(9) + 1;

      System.out.println("\nEjercicio " + i);

      int queOperacion = rand.nextInt(2);

      if (queOperacion == 0) {

        //Suma
        int suma = n + m;

        System.out.println("¿Cuánto es la suma de " + n + " + " + m + "?");
        int respuesta = sc.nextInt();

        if (respuesta == suma) {

          System.out.println("Muy bien:)");

        } else {

          calificacion--;

          System.out.println("Esa no es la respuesta correcta :(");

        }


      } else {

        //Resta
        int resta = n - m;

        System.out.println("¿Cuánto es la resta de " + n + " - " + m + "?");
        int respuesta = sc.nextInt();

        if(respuesta == resta){

          System.out.println("Muy bien :)");

        } else {

          calificacion--;

          System.out.println("Esa no es la respuesta correcta :(");

        }


      }

      i++;

    }

    System.out.println("\nListo, tu calificación es de " +  calificacion);

    if (calificacion >= 6) {

      System.out.println("APROBADO");

    } else {

      System.out.println("REPROBADO");

    }

	}

  public void intermedias () {

    while (i <= 10) {

      int n = rand.nextInt(9) + 1;
      int m = rand.nextInt(9) + 1;

      System.out.println("\nEjercicio " + i);

      int queOperacion = rand.nextInt(3);

      if (queOperacion == 0) {

        //Suma
        int suma = n + m;

        System.out.println("¿Cuánto es la suma de " + n + " + " + m + "?");
        int respuesta = sc.nextInt();

        if (respuesta == suma) {

          System.out.println("Muy bien :)");

        } else {

          calificacion--;

          System.out.println("Esa no es la respuesta correcta :(");

        }


      } else if (queOperacion == 1) {

        //Resta
        int resta = n - m;

        System.out.println("¿Cuánto es la resta de " + n + " - " + m + "?");
        int respuesta = sc.nextInt();

        if(respuesta == resta){

          System.out.println("Muy bien :)");

        } else {

          calificacion--;

          System.out.println("Esa no es la respuesta correcta :(");

        }


      } else {

        //Multiplicación
        int multi = n * m;

        System.out.println("¿Cuánto es la multiplicación de " + n + " x " + m + "?");
        int respuesta = sc.nextInt();

        if(respuesta == multi){

          System.out.println("Muy bien:)");

        } else {

          calificacion--;

          System.out.println("Esa no es la respuesta correcta :(");

        }

      }

      i++;

    }

    System.out.println("\nListo, tu calificación es de " +  calificacion);

    if (calificacion >= 6 ) {

      System.out.println("APROBADO");

    } else {

      System.out.println("REPROBADO");

    }

  }

  public void avanzadas () {

    while (i <= 10) {

      int n = rand.nextInt(9 + 1);
      int m = rand.nextInt(9 + 1);

      System.out.println("\nEjercicio " + i);

      int queOperacion = rand.nextInt(4);

      if (queOperacion == 0) {

        //Suma
        int suma = n + m;

        System.out.println("¿Cuánto es la suma de " + n + " + " + m + "?");
        int respuesta = sc.nextInt();

        if(respuesta == suma){

          System.out.println("Muy bien:)");

        } else {

          calificacion--;

          System.out.println("Esa no es la respuesta correcta :(");

        }


      } else if (queOperacion == 1) {

        //Resta
        int resta = n - m;

        System.out.println("¿Cuánto es la resta de " + n + " - " + m + "?");
        int respuesta = sc.nextInt();

        if(respuesta == resta){

          System.out.println("Muy bien:)");

        } else {

          calificacion--;

          System.out.println("Esa no es la respuesta correcta :(");

        }


      } else if (queOperacion == 2) {

        //Multiplicación
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

      } else if (queOperacion == 3) {

        //División
        int div = n / m;

        if (n < m || n == 0) {

          while(n < m || n == 0) {

            n = rand.nextInt(9) + 1;

          }

        }

        System.out.println("¿Cuánto es la división de " + n + " ÷ " + m + "?");
        int respuesta = sc.nextInt();

        if(respuesta == div){

          System.out.println("Muy bien :)");

        } else {

          calificacion--;

          System.out.println("Esa no es la respuesta correcta :(");

        }

      }

      i++;

    }

    System.out.println("\nListo, tu calificación es de " +  calificacion);

    if (calificacion >= 6 ) {

      System.out.println("APROBADO");

    } else {

      System.out.println("REPROBADO");

    }

  }

}