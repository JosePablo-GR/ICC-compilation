package Excepciones;

/**
 * Excepciones  
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1
 */

/**
 * Esta excepción se lanza cuando la entrada proporcionada no es válida.
 */

public class EntradaInvalidaException extends Exception {

	/**
     * Constructor que crea una nueva excepción. 
     * @param mensaje Mensaje de la expcepcion. 
     */
	
	public EntradaInvalidaException (String mensaje) {

		super(mensaje);

	}

}