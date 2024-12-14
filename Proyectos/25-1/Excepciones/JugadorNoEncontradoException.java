package Excepciones;
/**
 * Excepciones  
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1
 */

/**
 * Excepción que se lanza cuando no se encuentra un jugador. 
 */

public class JugadorNoEncontradoException extends Exception {

	/**
     * Constructor que crea una nueva excepción. 
     * @param mensaje Mensaje de la expcepcion. 
     */

	public JugadorNoEncontradoException (String mensaje) {

		super(mensaje);

	}

}