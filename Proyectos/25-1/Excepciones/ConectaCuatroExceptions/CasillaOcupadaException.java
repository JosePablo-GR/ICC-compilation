package Excepciones.ConectaCuatroExceptions;

/**
 * Excepciones  
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1
 */

/**
 * Excepción que se lanza cuando se intenta ocupar una casilla ocupada.
 */

public class CasillaOcupadaException extends Exception {

	/**
     * Constructor que crea una nueva excepción. 
     * @param mensaje Mensaje de la expcepcion. 
     */

	public CasillaOcupadaException (String mensaje) {

		super(mensaje);

	}

}