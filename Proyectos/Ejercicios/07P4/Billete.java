public class Billete {

	int denominacionBillete;
	String imagenFigurativa;
	String numeroSerie;

	public Billete() {

		denominacionBillete = 0;
		imagenFigurativa = "";
		numeroSerie = "";

	}

	public Billete(int denominacionBillete, String imagenFigurativa, String numeroSerie) {

		this.denominacionBillete = denominacionBillete;
		this.imagenFigurativa = imagenFigurativa;
		this.numeroSerie = numeroSerie;

	}

	public Billete(Billete billete) {

		denominacionBillete = billete.obtenerDenominacionBillete();
		imagenFigurativa = billete.obtenerImagenFigurativa();
		numeroSerie = billete.obtenerNumeroSerie();

	}

	public void asignarDenominacionBillete(int denominacionBillete) {

		this.denominacionBillete = denominacionBillete;

	}

	public int obtenerDenominacionBillete() {

		return denominacionBillete;

	}

	public void asignarImagenFigurativa(String imagenFigurativa) {

		this.imagenFigurativa = imagenFigurativa;

	}

	public String obtenerImagenFigurativa() {

		return imagenFigurativa;

	}

	public void asignarNumeroSerie(String numeroSerie) {

		this.numeroSerie = numeroSerie;

	}

	public String obtenerNumeroSerie() {

		return numeroSerie;

	}

	public String toString(){

		return "Billete de $" + denominacionBillete + " que tiene la figura " + imagenFigurativa + " y el número de serie "
		+ numeroSerie;

	}

}
