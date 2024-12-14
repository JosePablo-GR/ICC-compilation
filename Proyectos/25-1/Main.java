import Essentials.*;
import java.io.*;
import java.util.Scanner;
import Excepciones.EntradaInvalidaException;
import Excepciones.JugadorNoEncontradoException;

/**
 * Main
 * @author José Pablo Granados Rovira
 * @author Leonardo Rodrigo Tintos Fabela
 * @version 4.0
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("¡Bienvenido a la feria de la facultad de ciencias!");
		System.out.println("Se te proporcionarán 100 créditos para jugar los dos días.");
		System.out.println("Cada juego tiene un costo de 15 créditos\n");

		System.out.print("Escoge el día: (1 o 2): ");
		String day = sc.next();
		int dia = 0;

		try {

			dia = verificaEntrada(day);

			if (!((dia == 1) || (dia == 2))) {

				System.out.println("Opción inválida.");
				return;

			}

		} catch (EntradaInvalidaException e) {

			System.err.println(e.getMessage());
			System.out.println();
			return;

		}

		int contador = 0;
		Jugador[] jugadores = new Jugador[10];

		CuadradoMagico cm = new CuadradoMagico();
		ConectaCuatro c4 = new ConectaCuatro();
		Salvado slvd = new Salvado();
		TorresDeHanoi tdh = new TorresDeHanoi();

		boolean repetir = true;

		while (repetir) {

			System.out.println("\nIngresa un opción");
			System.out.println("1. Registrar un jugador");
			System.out.println("2. Iniciar un nuevo juego");
			System.out.println("3. Ver tablero");
			System.out.println("4. Ver tus puntos");
			System.out.println("5. Guardar y salir");
			String opcion = sc.next();
			int op = 0;

			try {

				op = verificaEntrada(opcion);

			} catch (EntradaInvalidaException e) {

				System.err.println(e.getMessage());
				System.out.println();
				//return;

			}

			switch (op) {

			case 1:

				System.out.print("Escribe el nombre del usuario: ");
				String nombreJugador = sc.next();

				File archivo = new File("ListaJugadores.txt");

				if (archivo.exists()) {

					jugadores = Jugador.almacenamientoJugadores("ListaJugadores.txt");
          			contador = Jugador.contarJugadores(jugadores);

				}

				boolean existe = false;

				for (int i = 0; i < contador; i++) {

					if ((jugadores[i] != null) && (jugadores[i].obtenerNombre().equalsIgnoreCase(nombreJugador))) {
		                
		                existe = true;
		                break;

					}

        }

		        if (!existe) {

		            if (contador == jugadores.length) {

		                jugadores = Jugador.expandirArreglo(jugadores);

		            }

		            jugadores[contador] = new Jugador(nombreJugador, 100, 0);
		            contador++;

		            System.out.println("Jugador guardado correctamente.");

		        } else {

		            System.out.println("El jugador ya existe. No se agregará.");

		        }

		        Jugador.guardarJugadores("ListaJugadores.txt", jugadores);

		        System.out.println("\nLista de jugadores:");

        		for (int i = 0; i < contador; i++) {

        			System.out.println(jugadores[i]);

        		}

				break;

			case 2:

				System.out.println("Inicia sesión con el nombre que te registraste: ");
				sc.nextLine();
		        String playerName = sc.nextLine();
		        Jugador[] players = null;

        boolean registrado = false;

        try (ObjectInputStream objectIS = new ObjectInputStream(new FileInputStream("ListaJugadores.txt"))) {
           
            players = (Jugador[]) objectIS.readObject();

            for (Jugador jugador : players) {

                if (jugador.obtenerNombre().equalsIgnoreCase(playerName)) {

                    registrado = true;
                    break;

                }

            }

        } catch (FileNotFoundException e) {

            System.out.println("No existe ningún registro.");
            return;

        } catch (IOException e) {

            System.out.println(e.getMessage());
            return;

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());
            return;

        } catch (NullPointerException e) {

        	System.out.println("No te encuentras registrado. Selecciona la opción 1.");
          //return;
        	
        }

        if (registrado) {

            System.out.println("Bienvenido " + playerName);
            //Jugador jugadorActual = currentPlayer(playerName, players);

        }


        try {

        	Jugador jugadorActual = currentPlayer(playerName, players);

					System.out.println("\nJuegos:");

					int option = 0;

					if (dia == 1) {

						System.out.println("1. Cuadrado Mágico");
						System.out.println("2. Conecta Cuatro");
						option = sc.nextInt();

					} else if (dia == 2) {

						System.out.println("3. Salvado");
						System.out.println("4. Torres de Hanoi");
						option = sc.nextInt();

					} else {

						System.out.println("Hubo un problema  con la elección del día.");
						return;

					}

					if ((option == 1) && (dia == 1)) {

						cm.jugar(jugadorActual);

					} else if ((option == 2) && (dia == 1)) {

						c4.jugar(jugadorActual);
						
					} else if ((option == 3) && (dia == 2)) {

						slvd.jugar(jugadorActual);

					} else if ((option == 4) && (dia == 2)) {

						tdh.jugar(jugadorActual);

					} else {

						System.out.println("Opción inválida.");

					}

					System.out.println();
					System.out.println(jugadorActual.obtenerNombre() + ", tienes " + jugadorActual.obtenerCreditos() + " créditos");
					System.out.println();

        } catch (JugadorNoEncontradoException e) {

        	System.out.println(e.getMessage());

        }

				break;

			case 3:

				System.out.println("\n* * * * Top 3 General * * * *");

				//Listas de ganadorws en cada juego
				Jugador[] l1 = cm.obtenerGanadores();
				Jugador[] l2 = c4.obtenerGanadores();
				Jugador[] l3 = slvd.obtenerGanadores();
				Jugador[] l4 = tdh.obtenerGanadores();

				podioGeneral(l1,l2,l3,l4);

				break;

			case 4:

				try {

					System.out.println("Inicia sesión con el nombre que te registraste: ");
					String jugadorNombre = sc.next();

					Jugador jugadorActivo = currentPlayer(jugadorNombre,jugadores);

					int puntajeCuadradoM = cm.misPuntos(jugadorActivo);
					int puntajeConectaC = c4.misPuntos(jugadorActivo);
					int puntajeSalvado = slvd.misPuntos(jugadorActivo);
					int puntajeTorresDh = tdh.misPuntos(jugadorActivo);

					String estadoCM = (puntajeCuadradoM == 0) ? "Aún no tienes puntaje registrado." : String.valueOf(puntajeCuadradoM);
					String estadoC4 = (puntajeConectaC == 0) ? "Aún no tienes puntaje registrado." : String.valueOf(puntajeConectaC);
					String estadoSlvd = (puntajeSalvado == 0) ? "Aún no tienes puntaje registrado." : String.valueOf(puntajeSalvado);
					String estadoTdh = (puntajeTorresDh == 0) ? "Aún no tienes puntaje registrado." : String.valueOf(puntajeTorresDh);

					System.out.println("\t* * * * Tus puntos (" + jugadorActivo.obtenerNombre() + ") * * * * ");
					System.out.println("Cuadrado Mágico: " + estadoCM);
					System.out.println("Conecta Cuatro: " + estadoC4);
					System.out.println("Salvado: " + estadoSlvd);
					System.out.println("Torres de Hanoi: " + estadoTdh);

				} catch (JugadorNoEncontradoException e) {

					System.out.println(e.getMessage());

				}

				break;

			case 5:

				repetir = false;
				System.out.println("\nHasta luego.\n");

				break;

			}

	}

	}

	 /**
     * Método que obtiene el jugador actual de acuerdo a su nombre.
     * @param jugadorActual Nombre del jugador.
     * @param jugadores Arreglo de jugadores registrados.
     * @return Jugador asignado al nombre proporcionado.
     * @throws JugadorNoEncontradoException Si el jugador no se encuentra en el arreglo.
     */

	public static Jugador currentPlayer (String jugadorActual, Jugador[] jugadores) throws JugadorNoEncontradoException {

		for (Jugador jugador : jugadores) {

			if ((jugador != null) && (jugador.obtenerNombre().equalsIgnoreCase(jugadorActual))) {

				return jugador;

			}

		}

		throw new JugadorNoEncontradoException ("Jugador " + jugadorActual + " no encontrado.");

	}

	/**
     * Método que muestra el podio general con los tres primeros ganadores según su puntaje.
     * @param ganadoresCM Arreglo de ganadores del juego Cuadrado Mágico.
     * @param ganadoresC4 Arreglo de ganadores del juego Conecta Cuatro.
     * @param ganadoresSLVD Arreglo de ganadores del juego Salvado.
     * @param ganadoresTDH Arreglo de ganadores del juego Torres de Hanoi.
     */

	public static void podioGeneral (Jugador[] ganadoresCM, Jugador[] ganadoresC4, Jugador[] ganadoresSLVD, Jugador[] ganadoresTDH) {

		int winnersCM = ganadoresCM.length;
		int winnersC4 = ganadoresC4.length;
		int winnersSlvd = ganadoresSLVD.length;
		int winnersTdh = ganadoresTDH.length;

	    int totalGanadores =  winnersCM + winnersC4 + winnersSlvd + winnersTdh;

	    Jugador[] everyWinner = new Jugador[totalGanadores];

	    int index = 0;

	    for (Jugador ganador : ganadoresCM) {

	        everyWinner[index++] = ganador;

	    }

	    for (Jugador ganador : ganadoresC4) {

	        everyWinner[index++] = ganador;

	    }

	    for (Jugador ganador : ganadoresSLVD) {

	        everyWinner[index++] = ganador;

	    }

	    for (Jugador ganador : ganadoresTDH) {

	        everyWinner[index++] = ganador;

	    }

	    for (int i = 0; i < everyWinner.length - 1; i++) {

	        for (int j = 0; j < (everyWinner.length - i) - 1; j++) {

	            int puntajeA = everyWinner[j].obtenerPuntaje();
	            int puntajeB =  everyWinner[j + 1].obtenerPuntaje();

	            if (puntajeA < puntajeB) {

	                Jugador temp = everyWinner[j];
	                everyWinner[j] = everyWinner[j + 1];
	                everyWinner[j + 1] = temp;

	            }

	        }

	    }

	
	    for (int i = 1; i <= 3; i++) {

	        if (i < everyWinner.length) {

	            System.out.println(everyWinner[i]);

	        } else {

	            System.out.println(" - - - - ");

	        }

	    }

	}

	 /**
     * Método que verifica que la entrada proporcionada sea un número entero válido y mayor que cero.
     * @param entrada String proporcionada por el usuario.
     * @return Número entero de la entrada.
     * @throws EntradaInvalidaException Si la entrada no es un número válido o es menor o igual a cero.
     */

	public static int verificaEntrada (String entrada) throws EntradaInvalidaException {

		try {

			int numero = Integer.parseInt(entrada);

			if (numero <= 0) {

				throw new EntradaInvalidaException("No corresponde a ninguna opción (" + entrada + ").");

			}

			return numero;           

		} catch (NumberFormatException e) {

			throw new EntradaInvalidaException("La entrada no es un número.");

		}

	}

}