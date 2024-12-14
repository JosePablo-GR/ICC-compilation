public class Automovil {

	String modelo;
	String placas;
	int anio;
	char engomado;
	int puertas;

	public Automovil (String modelo, String placas, int anio, char engomado) {

		this.modelo = modelo;
		this.placas = placas;
		this.anio = anio;
		this.puertas = 4;

	}

	public Automovil (String modelo, String placas, int anio, char engomado, int puertas) {

		this.modelo = modelo;
		this.placas = placas;
		this.anio = anio;
		this.puertas = puertas;

	}

	public void arrancar () {

		System.out.println("Arrancando...");

	}

	public void acelerar (int velocidad) {

		System.out.println("Acelarando a " + velocidad + "km/h.");

	}

	public void frenar () {

		System.out.println("Freno activado.");

	}

	public boolean equals (Automovil a) {

		boolean igual = true;

		igual = igual && (this.modelo.equals(a.modelo)) ? true : false;
		igual = igual && (this.placas.equals(a.placas)) ? true : false;
		igual = igual && (this.anio == a.anio) ? true : false;
		igual = igual && (this.engomado == a.engomado) ? true : false;
		igual = igual && (this.puertas == a.puertas) ? true : false ;

		return igual;

	}

	@Override
	public String toString () {

		String formato = modelo + " (" + anio + ") con placas " + placas;

		if (puertas != 4) {

			formato += "y tiene " + puertas + " puertas";

		}
			formato += ".";

		return formato;

	}

}