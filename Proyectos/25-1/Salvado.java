import Essentials.*;
//import Excepciones.SalvadoExceptions;
import Excepciones.EntradaInvalidaException;

import java.util.Random;
import java.util.Scanner;

/**
 * La clase del juego salvado. 
 * @author José Pablo Granados Rovira
 * @author Leonardo Rodrigo Tintos Fabela
 * @version 1.0
 */

public class Salvado extends Juego {

	/**
     * Arreglo que almacena a los jugadores ganadores.
     */

	private Jugador[] ganadores;

	 /**
     * Constructor por defecto que inicializa el arreglo de ganadores.
     */

	public Salvado () {

		this.ganadores = new Jugador[0];

	}

	/**
     * Método que imprime un arreglo de enteros.
     * @param arreglo Arreglo de enteros a imprimir.
     */

	public static void imprimeArreglo (int[] arreglo) {

		for (int x : arreglo) {

			System.out.print(x + ", ");
			
		}

	}

	/**
     * Método que verifica si una entrada es un número entero válido y no negativo.
     * @param entrada Cadena de texto a verificar.
     * @return Número entero si la entrada es válida.
     * @throws EntradaInvalidaException Si la entrada no es un número o es un valor no permitido.
     */

	public static int verificaEntrada (String entrada) throws EntradaInvalidaException {

        try {

            int numero = Integer.parseInt(entrada);

            if (numero < 0) {

                throw new EntradaInvalidaException("El número no puede ser negativo.");

            } else if (numero == 0) {

            	throw new EntradaInvalidaException("El número no puede ser cero.");

            }

            return numero;

        } catch (NumberFormatException e) {

            throw new EntradaInvalidaException("La entrada no es un número.");

        }

    }
	
	/**
     * Método que inicia el juego. 
     * @param jugador Jugador que participa en el juego.
     */

    @Override
	public void jugar (Jugador jugador) {

		Scanner sc = new Scanner(System.in);

		int puntosGanados = 2;
		int puntaje = jugador.obtenerPuntaje();
		int creditos = jugador.obtenerCreditos();

		System.out.println("\n+ + + + + + + Bienvenido al juego \"Salvado\" + + + + + + + ");
		System.out.println("Por favor elige una opción");
		System.out.println("1. Jugar");
		System.out.println("2. Ver lo jugadores con mayor puntuación");
		int opcion = sc.nextInt();

		switch (opcion) {

		case 1:

			if (creditos < 15) {

	            System.out.println("No tienes suficientes créditos para jugar.");
	            return;//Mata el ciclo

	        }

			creditos -= 15;
			jugador.asignarCreditos(creditos);

			int[] sillas = new int[100];
			int[] sillasInicial = new int[sillas.length]; //copia

			for (int s = 0; s < sillas.length; s++) {

				sillas[s] = s + 1;
				sillasInicial[s] = s + 1;

			}

			boolean terminado = false;

			int n = sillas.length;

			Random random = new Random();

			int constante = random.nextInt(sillas.length) + 1;
	      	
			System.out.println("Número elegido (constante): " + constante);

			int posicionActual = constante - 1;

	        int restantes = n;

	        while (restantes > 1) {


	        	for (int j = posicionActual; j < restantes - 1; j++) {

	        		sillas[j] = sillas[j + 1];

	        	}

	        	restantes--;

	            posicionActual = (posicionActual + constante - 1) % restantes;

	    
	        }

	        //System.out.println("Número salvado: " + sillas[0]);

	        int salvado = sillas[0];
	        System.out.println("Dada la lista:");
	        imprimeArreglo(sillasInicial);
	        System.out.println("y la constante _" + constante + "_");

	        while (!terminado) {

	        	System.out.println("\n¿Cuál es la silla salvada?");
		        String scanner = sc.next();

		        try {

		        	int intentoJugador = verificaEntrada(scanner);

		        	//Sumar puntos
		        	if (intentoJugador == salvado) {

		        		System.out.println("Correcto!");
		        		terminado = true;

		        		puntosGanados += 10;

		        		agregarGanador(jugador);

		        	} else {

		        		System.out.println("Incorrecto");
		        		terminado = true;

		        	}

		        } catch (EntradaInvalidaException e) {

		        	System.err.println(e.getMessage());

		        }

	        }

	        puntaje += puntosGanados;
	        jugador.asignarPuntaje(puntaje);

	        agregarGanador(jugador);
			System.out.println("Puntos registrados.");//local

			Jugador.actualizarArchivo(jugador);//global

			break;

		case 2:

			mostrarGanadores();

			break;

		default:

			System.out.println("Opción inválida.");

			break;

		}

	}

	/**
	 * Método para obtener a los ganadores.
	 * @return Arreglo de jugadrores que son ganadores.
	 */

	public Jugador[] obtenerGanadores () {

		return ganadores;

	}

	/**
	 *Método para obtener los puntos de un jugador especifico 
	 *@param jugador Jugador cuyo puntaje se desea obtener.  
	 *@return Puntos del jugador. 
	 */	

	@Override
	public int misPuntos (Jugador jugador) {

		int score = 0;

		for (Jugador ganador : ganadores) {

			if (ganador.obtenerNombre().equals(jugador.obtenerNombre())) {

				score = ganador.obtenerPuntaje();

			}

		}

    	return score;

	}

	/**
	 * Método que sirve para agreagar un ganador a la lista de ganadores.
	 * @param jugador Jugador que se va a agregar a la lista.
	 */

	public void agregarGanador (Jugador jugador) {

		Jugador[] nuevoArreglo = new Jugador[ganadores.length + 1];

		for (int i = 0; i < ganadores.length; i++) {

			nuevoArreglo[i] = ganadores[i];

		}

        nuevoArreglo[ganadores.length] = jugador;
        ganadores = nuevoArreglo;

	}


	/**
	 * Método que muestra los ganadores del juego.
	 */
	
	@Override
    public void mostrarGanadores () {

        System.out.println("\n* * * * Top 3 \"Salvado\" * * * *");

        if (!(ganadores.length == 0)) {

        	ordenarGanadores(ganadores);

            for (Jugador ganador : ganadores) {

            	System.out.println(ganador);

            }

        } else {

        	System.out.println("No hay ganadores aún.");

        }

    }

}