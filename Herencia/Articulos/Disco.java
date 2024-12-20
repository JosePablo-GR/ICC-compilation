/**
 * @author José Pablo Granados Rovira
 * @version 1.0
 * @see Articulo
 */ 
public class Disco extends Articulo {

	private int canciones;

	/**
	 * Método constructor que inicializa los atributos de la clase Disco.
	 * @param titulo : Titulo del disco.
	 * @param genero : Género del disco.
	 * @param autor : Intérprete del disco.
	 * @param canciones : Número de canciones que contiene el disco.
	 * @param idioma : Idioma en el que está el disco.
	 * @param anio : Año de lanzamiento de disco.
	 */ 
	public Disco (String titulo, String genero, String autor, int canciones, String idioma, String anio) {

		super (titulo, autor, anio, genero, idioma);
		this.genero = genero;
		this.idioma = idioma;
		this.canciones = canciones;

	}

	/**
	 * Método toString que da formato a los atributos de la clase Disco.
	 * @return String - Formato que muestra los atributos. 
	 */ 
	@Override
	public String toString () {

		return "- - - - - - - - - - - - - - - -\n" +
				"Título: " + titulo + "\n" +
				"Género: " + genero + "\n" +
				"Intérprete: " + autor + "\n" +
				"Número de canciones: " + canciones + "\n" +
				"Idioma: " + idioma + "\n" +
				"Año de lanzamiento: " + anio + "\n" +
				"- - - - - - - - - - - - - - - -\n";

	}

	/**
	 * Método para darle valor al atributo canciones.
	 * @param canciones : Número de canciones que contiene el disco.
	 */ 
	public void asignarCanciones (int canciones) {

		this.canciones = canciones;

	}

	/**
	 * Método para obtener el valor del atributo canciones.
	 * @return int - Número de canciones que contiene el disco.
	 */ 
	public int obtenerCanciones () {

		return canciones;

	}

}