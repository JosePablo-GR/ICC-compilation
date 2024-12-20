/**
 * @author José Pablo Granados Rovira
 * @version 1.0
 * @see Articulo
 */ 
public class Libro extends Articulo {

	private String editorial;

	/**
	 * Método constructor que inicializa los atributos del la clase Libro.
	 * @param titulo : Título del libro.
	 * @param autor : Autor del libro.
	 * @param editorial : Editorial que publica el libro.
	 * @param anio : Año de publicación del libro.
	 */ 
	public Libro (String titulo, String autor, String editorial, String anio) {

		super(titulo, autor, anio);
		this.editorial = editorial;

	}

	/**
	 * Método toString que da formato a los atributos de la clase Libro.
	 * @return String - Formato que muestra los atributos. 
	 */ 
	@Override
	public String toString () {

		return "- - - - - - - - - - - - - - - -\n" +
				"Título: " + titulo + "\n" +
				"Autor: " + autor + "\n" +
				"Editorial: " + editorial + "\n" +
				"Año de publicación: " + anio + "\n" +
				"- - - - - - - - - - - - - - - -\n";

	}

	/**
	 * Método para darle valor al atributo editorial.
	 * @param editorial : Editorial que publica el libro.
	 */ 
	public void asignarEditorial (String editorial) {

		this.editorial = editorial;

	}

	/** Método para obtener el valor del atributo editorial.
	 * @return String - Editorial que publica el libro.
	 */ 
	public String obtenerEditorial () {

		return editorial;

	}

}