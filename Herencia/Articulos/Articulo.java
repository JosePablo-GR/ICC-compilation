/**
 * @author José Pablo Granados Rovira
 * @version 1.0
 */ 

public class Articulo {

	protected String titulo;
	protected String autor;
	protected String anio;
	public String genero;
	public  String idioma;

	/**
	 * Método constructor que inicializa los atributos de un Artículo.
	 * @param titulo : Título del artículo.
	 * @param autor : Autor del artículo.
	 * @param anio : Año en el que se realizó el artículo.
	 */ 
	public Articulo (String titulo, String autor, String anio) {

		this.titulo =  titulo;
		this.autor =  autor;
		this.anio = anio;

	}

	/**
	 * @param titulo : Título del artículo.
	 * @param autor : Autor del artículo.
	 * @param anio : Año en el que se realizó el artículo.
	 * @param genero : Género del artículo.
	 * @param idioma : Idioma en el que se encuentra el artículo.
	 */ 
	public Articulo (String titulo, String autor, String anio, String genero, String idioma) {

		this.titulo =  titulo;
		this.autor =  autor;
		this.anio = anio;
		this.genero = genero;
		this.idioma = idioma;

	}

	/**
	 * Método para darle valor al atributo titulo.
	 * @param titulo : Título del artículo.
	 */ 
	public void asignarTitulo (String titulo) {

		this.titulo = titulo;

	}

	/**
	 * Método para obtener el valor del atributo titulo.
	 * @return String - Título del artículo.
	 */ 
	public String obtenerTitulo () {

		return titulo;

	}

	/**
	 * Método para darle valor al atributo autor.
	 * @param autor : Autor del artículo.
	 */ 
	public void asignarAutor (String autor) {

		this.autor = autor;

	}

	/**
	 * Método para obtener el valor del atributo autor.
	 * @return String - Autor del artículo.
	 */ 
	public String obtenerAutor () {

		return autor;

	}

	/**
	 * Método para darle valor al atributo anio.
	 * @param anio : Año en el que se realizó el artículo.
	 */ 
	public void asigarAnio (String anio) {

		this.anio = anio;

	}

	/**
	 * Método para obtener el valor del atributo anio.
	 * @return String - Año en el que se realizó el artículo.
	 */ 
	public String obtenerAnio () {

		return anio;

	}

	/**
	 * Método para darle valor al atributo genero.
	 * @param genero : Género del artículo.
	 */ 
	public void asignarGenero (String genero) {

		this.genero = genero;

	}

	/**
	 * Método para obtener el valor del atributo genero.
	 * @return String - Género del artículo.
	 */ 
	public String obtenerGenero () {

		return genero;

	}

	/**
	 * Método para darle valor al atributo idioma.
	 * @param idioma : Idioma en el que se encuentra el artículo.
	 */ 
	public void asignarIdioma (String idioma) {

		this.idioma = idioma;

	}

	/**
	 * Método para obtener el valor del atributo idioma.
	 * @return String - Idioma en el que se encuentra el artículo.
	 */ 
	public String obtenerIdioma () {

		return idioma;

	}

}