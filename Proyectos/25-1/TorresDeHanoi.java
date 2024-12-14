import Essentials.*;
import java.util.Scanner;
import Excepciones.EntradaInvalidaException;
import Excepciones.TorresDeHanoiExceptions.*;

/**
 * La clase de las torres de hanoi. 
 * @author José Pablo Granados Rovira
 * @author Leonardo Rodrigo Tintos Fabela
 * @version 1.0
 */

public class TorresDeHanoi extends Juego {

    private Jugador[] ganadores;

    public TorresDeHanoi () {

        this.ganadores = new Jugador[0];

    }

    /**
     * Método que muestra el estado de la torres.
     * @param torres Arreglo bidimensional que representa las torres y los discos.
     */
    public static void imprimirTorres(int[][] torres) {
        System.out.println("Estado actual de las torres:");
        for (int i = 0; i < torres.length; i++) {
            System.out.print("Torre " + (i + 1) + ": ");
            for (int j = 0; j < torres[i].length; j++) {
                if (torres[i][j] != 0) {
                    System.out.print(torres[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Método que verifica si un movimiento es valido o no.
     * @param torres Arreglo bidimensional que representa las torres.
     * @param origen número de la torre de origen 0, 1 o 2.
     * @param destino número de la torre de destino 0, 1 o 2.
     * @return true si es valido el movimiento, false en caso contrario.
     */
    public static boolean verificarMovimiento(int[][] torres, int origen, int destino) {
        int discoOrigen = -1;
        for (int i = 0; i < torres[origen].length; i++) {
            if (torres[origen][i] != 0) {
                discoOrigen = torres[origen][i];
                break;
            }
        }
        if (discoOrigen == -1) {
            return false;
        }
        int discoDestino = -1;
        for (int i = 0; i < torres[destino].length; i++) {
            if (torres[destino][i] != 0) {
                discoDestino = torres[destino][i];
                break;
            }
        }
        return discoDestino == -1 || discoOrigen < discoDestino;
    }

    /**
     * Método para mover los discos.
     * @param torres Arreglo bidimensional que representa las torres.
     * @param origen número de la torre de origen 0, 1 o 2.
     * @param destino número de la torre de destino 0, 1 o 2.
     */
    public static void moverDisco(int[][] torres, int origen, int destino) {
        int disco = 0;
        for (int i = 0; i < torres[origen].length; i++) {
            if (torres[origen][i] != 0) {
                disco = torres[origen][i];
                torres[origen][i] = 0;
                break;
            }
        }
        for (int i = torres[destino].length - 1; i >= 0; i--) {
            if (torres[destino][i] == 0) {
                torres[destino][i] = disco;
                break;
            }
        }
    }

    /**
     * Método para combroar si se completo el juego.
     * @param torres Arreglo bidimensional que representa las torres.
     * @param cantidadDiscos Número total de discos en el juego.
     * @return true si el juego termino, o false en caso contrario.
     */
    public static boolean juegoCompletado(int[][] torres, int cantidadDiscos) {
        return torres[2][0] == 1 && torres[2][cantidadDiscos - 1] == cantidadDiscos;
    }

    public static int verificaEntrada (String entrada) throws EntradaInvalidaException {

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
     * Método que inicia el juego.
     * @param jugador Jugador que va a participar.
     */

    @Override
    public void jugar (Jugador jugador) {

        Scanner scan = new Scanner(System.in);

        int puntosGanados = 0;
        int puntaje = jugador.obtenerPuntaje();
        int creditos = jugador.obtenerCreditos();

        System.out.println("\n+ + + + + + + Bienvenido al juego \"Torres de Hanoi\" + + + + + + + ");
        System.out.println("Por favor elige una opción");
        System.out.println("1. Jugar");
        System.out.println("2. Ver lo jugadores con mayor puntuación");
        int opcion = scan.nextInt();

        switch (opcion) {

        case 1:

            if (creditos < 15) {

                System.out.println("No tienes suficientes créditos para jugar.");
                return;//Mata el ciclo

            }

            creditos -= 15;
            jugador.asignarCreditos(creditos);

            int cantidadDiscos = 6; 
            int[][] torres = new int[3][cantidadDiscos];
            int movimientos = 0;

            imprimirTorres(torres);

            for (int i = 0; i < cantidadDiscos; i++) {
                torres[0][i] = i + 1;
            }

            while (true) {
                System.out.println("\nSeleccione el poste de origen del 1 al 3 o 0 para salir:");
                String origin = scan.next();

                try {

                    int origen = verificaEntrada(origin) - 1;

                    if (origen == -1) {
                        System.out.println("Fin del juego");
                        break;
                    }

                    System.out.println("Seleccione el poste de destino (1, 2 o 3):");
                    String destiny = scan.next();
                    
                    int destino = verificaEntrada(destiny) - 1;

                    if (origen >= 0 && origen < 3 && destino >= 0 && destino < 3 && verificarMovimiento(torres, origen, destino)) {
                        moverDisco(torres, origen, destino);
                        movimientos++; 
                        imprimirTorres(torres);

                        if (juegoCompletado(torres, cantidadDiscos)) {
                            System.out.println("¡Has completado el juego!");
                            System.out.println("Número total de movimientos: " + movimientos);
                            
                            int movimientosMinimos = (int) Math.pow(2, cantidadDiscos) - 1;
                            
                            if (movimientos == movimientosMinimos) {
                                puntosGanados += 10;
                            } else if (movimientos <= movimientosMinimos + 10) {
                                puntosGanados += 5;
                            } else {
                                puntosGanados += 2;
                            }

                            if (puntosGanados > 0) {

                                agregarGanador(jugador);

                            }

                            System.out.println("Se te sumaron " + puntosGanados + " puntos.");
                            break;
                        }
                    } else {
                        throw new MovimientoInvalidoException("Movimiento inválido. Intente nuevamente.");
                        
                    }

                } catch (NumberFormatException e) {

                    System.out.println(e.getMessage());

                } catch (EntradaInvalidaException e) {

                    System.out.println(e.getMessage());

                } catch (MovimientoInvalidoException e) {

                    System.err.println(e);

                }
            }

            puntaje += puntosGanados;
            jugador.asignarPuntaje(puntaje);

            agregarGanador(jugador);
            Jugador.actualizarArchivo(jugador);

            System.out.println("Puntos registrados.");

            break;

        case 2:

            mostrarGanadores();

            break;

        default:

            System.out.println("opción inválida.");

            break;

        }

    }

    /**
     * Método que devuelve un arreglo de los ganadroes.
     * @return Arreglo de jugadores ganadores.
     */
    public Jugador[] obtenerGanadores () {

        return ganadores;

    }

    /**
     * Método que obtiene los puntos de un jugador especifico.
     * @param jugador Jugador cuyos puntos se quieren obtener.
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
     * Método para agregar un jugador los ganadores
     * @param jugador Jugador que se va a agregar.
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
     * Método que muestra la lista de ganadores.
     * Si no hay ganadores muestra un mensaje. 
     */

    @Override
    public void mostrarGanadores () {

        System.out.println("\n* * * * Top 3 \"Torres de Hanoi\" * * * *");

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