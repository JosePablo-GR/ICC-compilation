import Essentials.*;
import Excepciones.EntradaInvalidaException;
import Excepciones.ConectaCuatroExceptions.*;

import java.util.Scanner;
import java.util.Random;

/**
 * La clase del juego Conecta Cuatro. 
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1.3
 */

public class ConectaCuatro extends Juego {

   /**
    * Arreglo de jugadores ganadores.
    */

	private Jugador[] ganadores;

	/**
     * Constructor de la clase.
	 * Inicializa con un arreglo de 0 jugadores.
     */

	public ConectaCuatro ()	{

		this.ganadores = new Jugador[0];

	}

	/**
     * Método que representa el tablero actual del juego.
     * @param tablero Tablero de juego representado como una matriz de caracteres.
     */

	public static void representaTablero (char[][] tablero) {

		final String RESET = "\u001B[0m";
		final String RED = "\u001B[31m";
		final String BLUE = "\u001B[34m";

		System.out.println();

		for (int l = 1; l <= 7; l++) {

			//System.out.print("  " + l);

			if (l >= 2) {

				System.out.print(" " + l);

			} else {

				System.out.print("  " + l);

			}

		}

		System.out.println();

		for (int i = 0; i < 6; i++) {

			System.out.print((i + 1) + " ");

            for (int j = 0; j < 7; j++) {

                if (tablero[i][j] == '\0') {

                	System.out.print("- ");

                } else if (tablero[i][j] == 'X') {

                	System.out.print(RED + 'X' + RESET + " ");

                } else if (tablero[i][j] == 'O') {

                	System.out.print(BLUE + 'O' + RESET + " ");

                }

            }

            System.out.println();

        }

        System.out.println();

	}

	/**
     * Método que ncuentra la posición más baja disponible en una columna.
     * @param tablero Matriz del tablero.
     * @param columna Columna elegida.
     * @return Posición disponible o -1 si la columna está llena.
     */

	public static int lowestPosition(char[][] tablero, int columna) {

	    int position = 5;

	    try {

	        while (position >= 0) {

	            if (tablero[position][columna] == '\0') {

	                return position;

	            }

	            position--;

	        }

	        throw new ColumnaLlenaException("Columna llena.");

	    } catch (ColumnaLlenaException e) {

	    	System.out.println();
	        System.out.println(e.getMessage());

	        return -1;

	    }

	}

	/**
     * Método que checa si hay un ganador en el tablero.
     * @param tablero Matriz del tablero.
     * @param ficha Ficha para verficar ('X' o 'O').
     * @return true si hay un ganador, false de lo contrario.
     */

	public static boolean hayGanador (char[][] tablero, char ficha) {

		boolean ganador = false;

        int filas = tablero.length;
        int columnas = tablero[0].length;

        //Verifica filas
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j <= columnas - 4; j++) {

                if ((tablero[i][j] == ficha) && (tablero[i][j + 1] == ficha) && 
                    (tablero[i][j + 2] == ficha) && (tablero[i][j + 3] == ficha)) {

                    ganador = true;

                }

            }

        }

        //Verifica columnas
        for (int i = 0; i <= filas - 4; i++) {

            for (int j = 0; j < columnas; j++) {

                if ((tablero[i][j] == ficha) && (tablero[i + 1][j] == ficha) && 
                    (tablero[i + 2][j] == ficha) && (tablero[i + 3][j] == ficha)) {

                    ganador = true;

                }

            }

        }

        //Verifica diagonal uno
        for (int i = 0; i <= filas - 4; i++) {

            for (int j = 0; j <= columnas - 4; j++) {

                if ((tablero[i][j] == ficha) && (tablero[i + 1][j + 1] == ficha) && 
                    (tablero[i + 2][j + 2] == ficha) && (tablero[i + 3][j + 3] == ficha)) {

                    ganador = true;

                }

            }

        }

        //Verifica diagonal dos
        for (int i = 3; i < filas; i++) {

            for (int j = 0; j <= columnas - 4; j++) {

                if ((tablero[i][j] == ficha) && (tablero[i - 1][j + 1] == ficha) && 
                    (tablero[i - 2][j + 2] == ficha) && (tablero[i - 3][j + 3] == ficha)) {

                    ganador = true;

                }

            }

        }

        return ganador;

    }

	/**
     * Método que verifica si el tablero está lleno.
     * @param tablero Matriz del tablero.
     * @return true si el tablero está lleno, false de lo contrario.
     */

    public boolean estaLlena (char[][] tablero) {

        boolean matrizLlena = true;

        for (int i = 0; i < tablero.length; i++) {

        	for (int j = 0; j < tablero.length; j++) {

        		if (tablero[i][j] == '\0') {

                    return false;

                }

        	}

        }

        return matrizLlena;

    }

	/**
     * Método que verifica que la entrada sea en formato "m,n".
     * @param jugada Jugada ingresada por el usuario.
     * @throws EntradaInvalidaException Si el formato es incorrecto.
     */
	
	public static void verificaEntrada (String jugada) throws EntradaInvalidaException {

		if (jugada.length() < 2) {

			throw new EntradaInvalidaException("La entrada debe ser del tipo \"m,n\".") ;

		}

	}

	/**
	 * Método para que jugeuen dos jugadores.
	 * @param tablero Mtariz del tablero.
	 * @return 0 si gana el Jugador 1, 1 si gana el Jugador 2, 2 si hay empate, 3 en otros casos.
	 */

	public int jugarJugador (char[][] tablero) {

		Scanner in = new Scanner(System.in);

		System.out.println("Empecemos\n");

		boolean terminado = false;
		int estadoJuego = 3; //No significa nada
		//jugadorGano = false;

		System.out.println("Veamos el tablero inicial (vacío)");
		representaTablero(tablero);

		System.out.println("Jugador 1, tu ficha será: X");
		String player1;
		System.out.println("Jugador 2, tu ficha será: O\n");
		String player2;

		while (!terminado) {

			System.out.print("Jugador 1, escoge tu tiro: ");
			player1 = in.nextLine();

			try {

				verificaEntrada(player1);

				String[] jugadaP1 = player1.split(",");

				int x = Integer.parseInt(jugadaP1[0]) - 1; //fila
				int y = Integer.parseInt(jugadaP1[1]) - 1; //columna

				//modifiqué
				x = lowestPosition(tablero, y);

				if (tablero[x][y] != '\0') {

					throw new CasillaOcupadaException("La casilla que deseas no está disponible.");
					
				} else {

					tablero[x][y] = 'X';

					int equis = x + 1;
					int ye = y + 1;

					System.out.println("J1: Tu tirada (f:" + equis + ", c:" + ye + ") ha sido registrada");
					representaTablero(tablero);

				}

			} catch (IndexOutOfBoundsException e) {

				System.out.println("Verifica tu jugada.\n");

			} catch (NumberFormatException e) {

				System.err.println(e);

			} catch (EntradaInvalidaException e) {

				System.out.println(e.getMessage());

			} catch (CasillaOcupadaException e) {

				System.out.println(e.getMessage());

			}

			if (hayGanador(tablero,'X')) {

				System.out.println("Jugador 1 ha ganado! xx");
				terminado = true;
				estadoJuego = 0;

			}

			if (!terminado) {

				System.out.print("Jugador 2, escoge tu tiro: ");
				player2 = in.nextLine();

				try {

					verificaEntrada(player2);

					String[] jugadaP2 = player2.split(",");

					int a = Integer.parseInt(jugadaP2[0]) - 1; //fila
					int b = Integer.parseInt(jugadaP2[1]) - 1; //columna

					//modifiqué
					a = lowestPosition(tablero,b);

					if (tablero[a][b] != '\0') {

						throw new CasillaOcupadaException("La casilla que deseas no está disponible.");
						
					} else {

						tablero[a][b] = 'O';

						int ha = a + 1;
						int be = b + 1; 

						System.out.println("J2: Tu tirada (f:" + ha + ", c:" + be + ") ha sido registrada");
						representaTablero(tablero);

					}

				} catch (IndexOutOfBoundsException e) {

					System.out.println("\nVerifica tu jugada\n");

				} catch (NumberFormatException e) {

					System.out.println(e.getMessage());

				} catch (EntradaInvalidaException e) {

					System.out.println(e.getMessage());

				} catch (CasillaOcupadaException e) {

					System.out.println(e.getMessage());

				}

				if (hayGanador(tablero,'O')) {

					System.out.println("Jugador 2 ha ganado! OO");
					estadoJuego = 1;
					terminado = true;

				}

			}

			//Empate
			if (estaLlena(tablero)) {

				terminado = true;
				estadoJuego = 2;
				System.out.println("Empate.");

			}

		}

		return estadoJuego;

	}

	/**
	 * Método para jugar contra la computadora
	 * @param tablero Mtariz del tablero.
	 * @return 0 si gana el Jugador, 1 si gana la computadora, 2 si hay empate, 3 en otros casos.
     */

	public int jugarComputadora (char[][] tablero) {

		Scanner in = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("Empecemos\n");

		boolean terminado = false;
		int estadoJuego = 3;

		System.out.println("Veamos el tablero inicial (vacío)");
		representaTablero(tablero);

		System.out.println("La ficha del Jugador será: X");
		String player1;
		System.out.println("La ficha de la computadora será: O\n");
		int filaCompu;
		int columnaCompu;

		while (!terminado) {

			System.out.print("Jugador 1, escoge tu tiro: ");
			player1 = in.nextLine();

			try {

				verificaEntrada(player1);

				String[] jugadaP1 = player1.split(",");

				int x = Integer.parseInt(jugadaP1[0]) - 1; //fila
				int y = Integer.parseInt(jugadaP1[1]) - 1; //columna

				//modifiqué
				x = lowestPosition(tablero, y);

				if (tablero[x][y] != '\0') {

					throw new CasillaOcupadaException("La casilla que deseas no está disponible.");
					
				} else {

					tablero[x][y] = 'X';

					int equis = x + 1;
					int ye = y + 1;

					System.out.println("Tu tirada (f:" + equis + ", c:" + ye + ") ha sido registrada");
					representaTablero(tablero);

				}

			} catch (IndexOutOfBoundsException e) {

				System.out.println("Verifica tu jugada.\n");

			} catch (NumberFormatException e) {

				System.err.println(e);

			} catch (EntradaInvalidaException e) {

				System.out.println(e.getMessage());

			} catch (CasillaOcupadaException e) {

				System.out.println(e.getMessage());

			}

			if (hayGanador(tablero,'X')) {

				System.out.println("El jugador ha ganado! xx");
				estadoJuego = 0;
				terminado = true;

			}

			if (!terminado) {

				filaCompu = rd.nextInt(6);
				columnaCompu = rd.nextInt(7);

				int a = filaCompu;
				int b = columnaCompu;

				a = lowestPosition(tablero,b);

				if (tablero[a][b] != '\0') {

					while (tablero[a][b] != '\0') {

						a = rd.nextInt(6);
						b = rd.nextInt(7);

					}
						
				} else {

					tablero[a][b] = 'O';

					int ha = a + 1;
					int be = b + 1; 

					System.out.println("La computadora tiró en f:" + ha + ", c:" + be);
					representaTablero(tablero);

				}

				if (hayGanador(tablero,'O')) {

					System.out.println("La computadora ha ganado! OO");
					terminado = true;
					estadoJuego = 1;

				}

			}

			//Empate
			if (estaLlena(tablero)) {

				System.out.println("Empate.");
				terminado = true;
				estadoJuego = 2;

			}

		}

		return estadoJuego;

	}

	/**
	 * Método que inicia el juego.
	 * @param jugador Jugador que va a jugar.
	 */

	@Override
	public void jugar (Jugador jugador) {

		Scanner sc = new Scanner (System.in);
		Random rd = new Random ();

		int puntosGanados = 0;
		int puntaje = jugador.obtenerPuntaje();
		int creditos = jugador.obtenerCreditos();

		//6 filas, 7 columnas
		char[][] tablero = new char[6][7];

		System.out.println("\n+ + + + + + + Bienvenido al juego Conecta 4 + + + + + + + ");
		System.out.println("Por favor elige una opción");
		System.out.println("1. Jugar con otro jugador");
		System.out.println("2. Jugar con la computadora");
		System.out.println("3. Ver lo jugadores con mayor puntuación");
		int opcion = sc.nextInt();

		switch (opcion) {

		case 1:

			if (creditos < 15) {

	            System.out.println("No tienes suficientes créditos para jugar.");
	            return;//Mata el ciclo

	        }

			creditos -= 15;
			jugador.asignarCreditos(creditos);

			int gameStatus = jugarJugador(tablero);

			if (gameStatus == 0) { //Ganador

				puntosGanados = 10;

			} else if (gameStatus == 1) { //Derrota

				puntosGanados = 2;

			} else if (gameStatus == 2) { //Empate

				puntosGanados = 5;

			} else {

				System.out.println("Ocurrió un error al registrar el puntaje.");

			}

			puntaje += puntosGanados;
			jugador.asignarPuntaje(puntaje);

			agregarGanador(jugador); //local
			System.out.println("Jugador agregado a la lista.");

			Jugador.actualizarArchivo(jugador); //glbal

			break;

		case 2:

			if (creditos < 15) {

	            System.out.println("No tienes suficientes créditos para jugar.");
	            return;//Mata el ciclo

	        }

			creditos -= 15;
			jugador.asignarCreditos(creditos);

			int estadoDelJuego = jugarComputadora(tablero);

			if (estadoDelJuego == 0) { //Ganador

				puntosGanados = 10;

			} else if (estadoDelJuego == 1) { //Derrota

				puntosGanados = 2;

			} else if (estadoDelJuego == 2) { //Empate

				puntosGanados = 5;

			} else {

				System.out.println("Ocurrió un error.");

			}

			puntaje += puntosGanados;
			jugador.asignarPuntaje(puntaje);

			//Podio local
			agregarGanador(jugador);
			System.out.println("Jugador agregado a la lista.");

			Jugador.actualizarArchivo(jugador);//Archivo global

			break;

		case 3:

			mostrarGanadores();

			break;

		default:

			System.out.println("Opción inválida.");

		}

	}

	/**
	 * Método para obtener a los ganadores.
	 * @return Arreglo de juagdores.
	 */

	public Jugador[] obtenerGanadores () {

		return ganadores;

	}

	/**
	 * Método para obtener los puntos de un jugador especificio.
	 * @param jugador Del que se obtendran los puntos.
	 * @return Puntos del jugador.
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
	 * Método para agregar un ganador 
	 * @param jugador El cual es el nuevo ganador.
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
	 * Método para mostrar a los gandores.
	 * si no hay ganadores, muestra un mensaje indicando que aún no hay ganadores.
	 */

	@Override
    public void mostrarGanadores () {

        System.out.println("\n* * * * Top 3 \"Conecta Cuatro\" * * * *");

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