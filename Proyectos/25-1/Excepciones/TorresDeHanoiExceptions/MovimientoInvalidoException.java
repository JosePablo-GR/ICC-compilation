package Excepciones.TorresDeHanoiExceptions;

/**
 * Excepciones  
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1
 */

/**
 * Excepción que se lanza cuando se intenta realizar un movimiento inválido en el juego de Torres de Hanoi.
 */

public class MovimientoInvalidoException extends Exception {

	/**
     * Constructor que crea una nueva excepción. 
     * @param mensaje Mensaje de la expcepcion. 
     */

	public MovimientoInvalidoException (String mensaje) {

		super(mensaje);

	}

}