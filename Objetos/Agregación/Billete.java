public class Billete {

	int denominacion;
	String imagen;
	String numeroSerie;

	public Billete () {

		denominacion = 0;
		imagen = "Imagen en blanco";
		numeroSerie = "0 0 0 0";

	}

	public Billete (int denominacion, String imagen, String numeroSerie) {

		this.denominacion = denominacion;
		this.imagen = imagen;
		this.numeroSerie = numeroSerie;

	}

	public Billete (Billete billete) {

		denominacion = billete.getDenominacionBillete();
		imagen = billete.getImagen();
		numeroSerie = billete.getNumeroSerie();

	}

	public void setDenominacionBillete (int denominacion) {

		this.denominacion = denominacion;

	}

	public int getDenominacionBillete () {

		return denominacion;

	}

	public void setImagen (String imagen) {

		this.imagen = imagen;

	}

	public String getImagen () {

		return imagen;

	}

	public void setNumeroSerie (String numeroSerie) {

		this.numeroSerie = numeroSerie;

	}

	public String getNumeroSerie () {

		return numeroSerie;

	}

	public boolean equals (Billete b) {

		boolean igual = true;

		igual = igual && (this.denominacion == b.denominacion) ? true : false;
		igual = igual && (this.imagen.equals(b.imagen)) ? true : false;
		igual = igual && (this.numeroSerie.equals(b.numeroSerie)) ? true : false;

		return igual;

	}

	@Override
	public String toString (){

		return "\nBillete de $" + denominacion + " que tiene la figura " + imagen + " y el número de serie "
				+ numeroSerie;

	}

}
