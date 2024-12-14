package Excepciones.CuadradoMagicoExceptions;

/**
 * Excepciones  
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1
 */

 /**
 * Excepción que se lanza cuando se intenta sobrescribir un valor que ya existe en el Cuadrado Mágico.
 */

public class SobreescrituraException extends Exception {

	/**
     * Constructor que crea una nueva excepción. 
     * @param mensaje Mensaje de la expcepcion. 
     */

	public SobreescrituraException (String mensaje) {

		super(mensaje);

	}

}