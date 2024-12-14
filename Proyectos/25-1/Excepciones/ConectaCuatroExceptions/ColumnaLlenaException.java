package Excepciones.ConectaCuatroExceptions;

/**
 * Excepciones  
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1
 */

/**
 * Excepción que se lanza cuando se intenta realizar una jugada en una columna que ya está llena.
 */

public class ColumnaLlenaException extends Exception{

	/**
     * Constructor que crea una nueva excepción. 
     * @param mensaje Mensaje de la expcepcion. 
     */

	public ColumnaLlenaException (String mensaje) {

		super(mensaje);

	}

}