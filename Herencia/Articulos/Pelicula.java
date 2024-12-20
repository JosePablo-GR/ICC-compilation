/**
 * @author José Pablo Granados Rovira
 * @version 1.0
 * @see Articulo
 */ 
public class Pelicula extends Articulo {

	private String duracion;

	/**
	 * Método constructor que inicializa los atributos de la clase Pelicula.
	 * @param titulo : Título de la película.
	 * @param author : Director de la película.
	 * @param genero : Género de la película.
	 * @param duracion : Duración de la película.
	 * @param anio : Año de filmación de la película.
	 * @param idioma : Idioma en la que se encuentra la película.
	 */ 
	public Pelicula (String titulo, String autor, String genero, String duracion, String anio, String idioma){

		super (titulo, autor, anio, genero, idioma);
		this.genero = genero;
		this.idioma = idioma;
		this.duracion = duracion;

	}

	/**
	 * Método toString que da formato a los atributos de la clase Pelicula.
	 * @return String - Formato que muestra los atributos. 
	 */ 
	@Override
	public String toString () {

		return "- - - - - - - - - - - - - - - -\n" +
				"Título: " + titulo + "\n" +
				"Director: " + autor + "\n" +
				"Género: " + genero + "\n" +
				"Duración: " + duracion + "\n" +
				"Año de filmación: " + anio + "\n" +
				"Idioma: " + idioma + "\n" +
				"- - - - - - - - - - - - - - - -\n";

	}

	/**
	 * Método para darle valor al atributo duracion.
	 * @param duracion : Duración de la película.
	 */ 
	public void asignarDuracion (String duracion) {

		this.duracion = duracion;

	}

	/** Método para obtener el valor del atributo duracion.
	 * @return String - Duración de la película.
	 */ 
	public String obtenerDuracion () {

		return duracion;

	}

}