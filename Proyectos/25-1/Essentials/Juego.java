package Essentials;

/**
 * La clase abstracta Juego.
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1.2
 */

public abstract class Juego {

    /**
     * Método abstracto para emepzar el juego.
     *
     * @param jugador El jugador que participará en el juego.
     */

	protected abstract void jugar (Jugador jugador);

     /**
     * Método abstracto para obtener los puntos de un jugador específico.
     * @param jugador El jugador del cual se quieren los puntos. 
     * @return El puntaje del jugador.
     */

    protected abstract int misPuntos (Jugador jugador);

    /**
     * Método abstracto para mostrar los ganadores del juego.
     */

	protected abstract void mostrarGanadores ();

     /**
     * Método que conrdena a los ganadores con bubble sort.
     * @param ganadores El arreglo de ganadores.
     */

    protected void ordenarGanadores (Jugador[] ganadores) {

        if (ganadores == null || ganadores.length == 0) {

            return; //Sale sin hacer nada

        }

        for (int i = 0; i < ganadores.length - 1; i++) {

             for (int j = 0; j < ganadores.length - i - 1; j++) {

                if (ganadores[j] != null && ganadores[j + 1] != null) {

                    if (ganadores[j].obtenerPuntaje() < ganadores[j + 1].obtenerPuntaje()) {

                        Jugador temp = ganadores[j];

                        ganadores[j] = ganadores[j + 1];

                        ganadores[j + 1] = temp;

                    }

                }

             }

        }

    }

}