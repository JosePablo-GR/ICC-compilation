import java.util.Random;
import java.util.Scanner;

import Essentials.*;
import Excepciones.EntradaInvalidaException;
import Excepciones.CuadradoMagicoExceptions.*;

/**
 * La clase del juego Cuadrado Mágico. 
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1.3
 */

public class CuadradoMagico extends Juego {

	private Jugador[] ganadores;


	/**
	 * Constructor de la clase que crea un arreglo vacio de jugadores.
	 */

	public CuadradoMagico () {

		this.ganadores = new Jugador[0];

	}

	/**
	 * Método que reprsenta el cuadrado magico con una matriz. 
	 * @param matriz Matriz que representa al cuadrado. 
	 */

	public void representarCuadadro (int[][] matriz) {

		for (int l = 1; l <= 4; l++) {

			if (l == 1) {

				System.out.print(" ");

			}

			System.out.print("|" + l);

		}

		System.out.println();

		for (int i = 0; i < matriz.length; i++) {

			System.out.print((i + 1) + "|");

            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] == 0) {

                	System.out.print("- ");

                } else {

                	System.out.print(matriz[i][j] + " ");

                }

            }

            System.out.println();

        }

	}

	/**
	 * Método que verifica si el juego termino. 
	 * @param matriz Matriz que representa el estado actual del cuadrado.
	 * @param original Matriz de las posiciones originales que no deben sumarse.
	 * @return true si se ha alcanzado la suma de 34 en una fila, columna o diagonal, false en caso contrario.
	 */

	public boolean finishGame (int[][] matriz, boolean[][] original) {

		boolean daLaSuma = false;

	    //Verificar filas
	    for (int i = 0; i < 4; i++) {

	        int sumaFila = 0;

	        for (int j = 0; j < 4; j++) {

	        	if (!original[i][j]) {

	        		sumaFila += matriz[i][j];

	        	}

            }

	        if (sumaFila == 34) {

	            daLaSuma = true;

	        }

	    }

	    //Verificar columnas
	    for (int j = 0; j < 4; j++) {

	        int sumaColumna = 0;

	        for (int i = 0; i < 4; i++) {

	        	if (!original[i][j]) {

	        		sumaColumna += matriz[i][j];

	        	}

	        }

	        if (sumaColumna == 34) {

	            daLaSuma = true;

	        }

	    }

	    //Verificar diagonal uno
	    int sumaDiagonalUno = 0;

	    for (int i = 0; i < 4; i++) {

	    	if (!original[i][i]) {

            	sumaDiagonalUno += matriz[i][i];

        	}

	    }

	    if (sumaDiagonalUno == 34) {

	        daLaSuma = true;

	    }

	    //Verificar diagonal dos
	    int sumaDiagonalDos = 0;

	    for (int i = 0; i < 4; i++) {

	    	if (!original[i][3 - i]) {

	    		sumaDiagonalDos += matriz[i][3 - i];

	    	}

	    }

	    if (sumaDiagonalDos == 34) {

	        daLaSuma = true;

	    }

	    return daLaSuma;

	}

	/**
	 *Método que verifica si alguna fila o columna suma mas de 34 
	 * @param matriz Matriz que representa el estado actual del cuadrado.
	 * @return true si alguna fila, columna o diagonal tiene una suma mayor a 34, false si todas las sumas son válidas.
	 */

	public boolean malaJugada (int[][] matriz) {

		boolean terminado = false;

        //Verificar filas
        for (int i = 0; i < 4; i++) {

            int sumaFila = 0;

            for (int j = 0; j < 4; j++) {

                sumaFila += matriz[i][j];

            }

            if (sumaFila > 34) {

                terminado = true;

            }

        }

        //Verificar columnas
        for (int j = 0; j < 4; j++) {

            int sumaColumna = 0;

            for (int i = 0; i < 4; i++) {

                sumaColumna += matriz[i][j];

            }

            if (sumaColumna > 34) {

                terminado = true;

            }

        }

        //Verificar diagonal uno
        int sumaDiagonalUno = 0;

        for (int i = 0; i < 4; i++) {

            sumaDiagonalUno += matriz[i][i];

        }

        if (sumaDiagonalUno > 34) {

            terminado = true;

        }

        //Verificar diagonal dos
        int sumaDiagonalDos = 0;

        for (int i = 0; i < 4; i++) {

            sumaDiagonalDos += matriz[i][3 - i];

        }

        if (sumaDiagonalDos > 34) {

            terminado = true;

        }

        return terminado;

    }


	/**
	 * Método que verifica si el tablero esta lleno. 
	 * @param matriz Matriz que representa el estado actual del cuadrado.
	 * @return true si el tablero está lleno, false si hay al menos una casilla vacía.
	 */

    public boolean estaLlena (int[][] matriz) {

        boolean matrizLlena = true;

        for (int i = 0; i < 4; i++) {

        	for (int j = 0; j < 4; j++) {

        		if (matriz[i][j] == 0) {

                    return false;

                }

        	}

        }

        return matrizLlena;

    }


	/**
	 * Método que verifica si hay numeros repetidos.
	 * @param arreglo Arreglo a verificar.
	 * @return true si no hay elementos repetidos, false en caso contrario.
	 */

	public boolean arregloSinRepeticiones (int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] == arreglo[j]) {

                    return false;

                }

            }

        }

        return true;

    }

	/**
	 * Método que genera un arreglo de 4 enteros cuya suma es 34, que no se repiten y que esten entre el 1 y 16. 
	 * @return Arreglo con las especificaciones del metodo. 
	 */

	public int[] sumaTreintayCuatro () {

		Random rd = new Random();

		int[] arreglo = new int[4];

		boolean valido = false;

        while (!valido) {

            arreglo[0] = 1 + (rd.nextInt(16));
            arreglo[1] = 1 + (rd.nextInt(16));
            arreglo[2] = 1 + (rd.nextInt(16));
            arreglo[3] = 34 - arreglo[0] - arreglo[1] - arreglo[2];

            boolean sumados = arreglo[0] + arreglo[1] + arreglo[2] + arreglo[3] == 34;

            //Verifica para excluir al 0 y que no se repitan
            if ((arreglo[3] >= 1) && (arreglo[3] <= 16) && sumados && arregloSinRepeticiones(arreglo)) {

                valido = true;

            }

        }

		return arreglo;

	}

	/**
	 * Método que crea la estructura inicial del cuadrado
	 * @param estructura Entero que indica el tipo de distribuscion. 
	 * @return Arreglo de 4x4 con la distribucion especifica.
	 */

	public int[][] estructuraInicial (int estructura) {

		Random rd = new Random();

		int[][] cuadrado = new int[4][4];

		int[] numeros = sumaTreintayCuatro();
		int filaColumna = rd.nextInt(4);

		switch (estructura) {

		//Distribuye en fila
		case 0:

			for (int a = 0; a < 4; a++) {

				cuadrado[filaColumna][a] = numeros[a];
				
			}

			break;

		//Distribuye en columna
		case 1:

			for (int b = 0; b < 4; b++) {

				cuadrado[filaColumna][b] = numeros[b];

			}

			break;

		//Distribuye en diagonal
		case 2:

			for (int i = 0; i < 4; i++) {

            	cuadrado[i][i] = numeros[i];

        	}

			break;

		}

		
		return cuadrado;

	}

	/**
	 * Método que crea una matriz booleana que indica que luagres estan ocupados.
	 * @param matriz Matriz que representa el cuadro actual.
	 * @return Matriz booleana donde true indica que un lugar esta ocupado.
	 */

	public boolean[][] lugarOcupado (int[][] matriz) {

		boolean[][] matrizDeOcupados = new boolean[4][4];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				if (matriz[i][j] != 0) {

					matrizDeOcupados[i][j] = true;

				}

			}

		}

		return matrizDeOcupados;

	}

	/**
	 * Método que determina cuales numeros del 1 al 16 no estan en la matriz. 
	 * @param matriz Matriz que representa al cuadro actual. 
	 * @return Arreglo con los numeros que no están presentes. 
	 */

	public int[] numerosRestantes (int[][] matriz) {

	    int[] contador = new int[16];
    
	    for (int i = 0; i < matriz.length; i++) {

	        for (int j = 0; j < matriz[i].length; j++) {

	            int num = matriz[i][j];

	            if (num >= 1 && num <= 16) {

	                contador[num - 1]++;

	            }

	        }

	    }

	    int contadorNoEncontrados = 0;

	    for (int i = 0; i < 16; i++) {

	        if (contador[i] == 0) {

	            contadorNoEncontrados++;

	        }

	    }

	    int indice = 0;
	    int[] numerosRestantes = new int[contadorNoEncontrados];

	    for (int i = 0; i < 16; i++) {

	        if (contador[i] == 0) {

	            numerosRestantes[indice++] = i + 1;

	        }
	        
	    }

	    for (int x : numerosRestantes) {

	    	System.out.print(x + " ");
	    	
	    }

	    return numerosRestantes;

	}




	/**
	 * Método que verifica y valida una entrada string para convertirla en int
	 * @param entrada String que se va a verfificar. 
	 * @return Numero convertido. 
	 * @throws EntradaInvalidaException Si la entrada no es un número o es un número negativo.
	 */

	 public int verificaEntrada (String entrada) throws EntradaInvalidaException {

        try {

            int numero = Integer.parseInt(entrada);

            if (numero < 0) {

                throw new EntradaInvalidaException("El número no puede ser negativo.");

            }

            return numero;

        } catch (NumberFormatException e) {

            throw new EntradaInvalidaException("La entrada no es un número.");

        }

    }

	/**
	 * Método para jugar cuadrado magico. 
	 * @param jugador El jugador que va a jugar. 
	 */

	@Override
	public void jugar (Jugador jugador) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int puntosGanados = 0;
		int puntaje = jugador.obtenerPuntaje();
		int creditos = jugador.obtenerCreditos();

		System.out.println("\n+ + + + + + + Bienvenido al \"Cuadrado Mágico\" + + + + + + + ");
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

			boolean terminado = false;

			int estructura = rd.nextInt(3);

			int[][] matriz = estructuraInicial(estructura);

			System.out.println("El cuadrado mágico dado es el siguiente");
			representarCuadadro(matriz);

			boolean[][] permanentes = lugarOcupado(matriz);
			boolean[][] original = permanentes;

			while (!terminado) {

				System.out.println("Escoge una fila m, presiona Enter y después ingresa una columna n:");

				String row = sc.next();
				String column = sc.next();

				try {

					int fila = verificaEntrada(row);
					int columna = verificaEntrada(column);

					fila -= 1;
					columna -= 1;

					System.out.println("Fila: " + (fila + 1));
					System.out.println("Columna: " + (columna + 1));

					if (permanentes[fila][columna] == true) {

					throw new SobreescrituraException("La casilla elegida tiene un número permanente, no puedes sobre escribirlo.");


					} else {

						System.out.println("Ingresa el número que quieres. Tienes estos restantes:");
						int[] numbersLeft = numerosRestantes(matriz);
						System.out.println();
						String number = sc.next();

						int numero = verificaEntrada(number);

						boolean coincide = false;

						for (int o = 0; o < numbersLeft.length; o++) {

							if (numero == numbersLeft[o]) {

								coincide = true;

								matriz[fila][columna] = numero;
								permanentes = lugarOcupado(matriz);
								break;

							}

						}

						if (!coincide) {

							System.out.println(numero + " no está en las opciones.");
						
							//matriz[fila][columna] = numero;
							//permanentes = lugarOcupado(matriz);

						}

					}

				} catch (ArrayIndexOutOfBoundsException e) {

					System.err.println(e.getMessage());

				} catch (NumberFormatException e) {

					System.err.println(e.getMessage());

				} catch (SobreescrituraException e) {

					System.err.println(e.getMessage());

				} catch (EntradaInvalidaException e) {

					System.out.println(e.getMessage());

				} finally {

					System.out.println();
					representarCuadadro(matriz);

				}

				if (malaJugada(matriz)) {

					terminado = true;
					System.out.println("El juego ha acabado ya que alcanzaste una suma incorrecta.");

				} else if (estaLlena(matriz)) {

					terminado = true;
					System.out.println("La matriz está llena y ");

					if (finishGame(matriz,original)) {

						System.out.print("lograste completar el juego correctamente.");
						puntosGanados = 10;
						puntaje += puntosGanados;

						jugador.asignarPuntaje(puntaje);

					} else {

						System.out.print("no lograste completar el juego correctamente.");

					}

					if (puntosGanados != 0) {

						agregarGanador(jugador); //podio local
						System.out.println("Puntos registrados.");

					}

				}

				if (terminado) {

					Jugador.actualizarArchivo(jugador);

				}

			}

			break;

		case 2:

			mostrarGanadores();

			break;

		default:

			System.out.println("Opción inválida.");

		}
		
	}

	/**
	 * Método que sirve para obtener los ganadores
	 * @return Arreglo de jugadores que ganaron.
	 */

	public Jugador[] obtenerGanadores () {

		return ganadores;

	}

	/**
	 * Método que obtiene los puntos de un jugador especifico. 
	 * @param jugador cuyos puntos se quieren obtener.
	 * @return Puntaje del jugador. 
	 */

	@Override
	public int misPuntos (Jugador jugador) {

		for (Jugador ganador : ganadores) {

			if (ganador.obtenerNombre().equals(jugador.obtenerNombre())) {

				return ganador.obtenerPuntaje();

			}

		}

    	return 0;

	}

	/**
	 * Método para agregar un ganador. 
	 * @param jugador Jugador a agregar. 
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
	 * Método que muestra el top 3 de ganadores.
	 */

	@Override
    public void mostrarGanadores () {

        System.out.println("\n* * * * Top 3 \"Cuadrado Mágico\" * * * *");

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