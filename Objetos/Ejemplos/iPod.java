import java.util.Random;

public class iPod {

	int canciones;
	int capacidad;
	String color;

	public iPod (int canciones, String color) {

		this.capacidad = 128;
		this.canciones = canciones;
		this.color = color;

	}

	//Tipo 1
	public void reproducir () {

		System.out.println("Reproduciendo música...");

	}

	//Tipo 2
	public String artistaFavorito () {

		Random rd = new Random();

		int random = rd.nextInt(3);

		String artista = " ";

		if (random == 0) {

			artista = "Adé";

		} else if (random == 1) {

			artista = "twenty one pilots";

		} else {

			artista = "Niall Horan";

		}

		return artista;

	}

	//Tipo 3
	public void crearPlaylist (int cantidad) {

		if (cantidad < 1) {

			System.out.println("El número debe ser positivo.");

		} else if (cantidad > this.canciones) {

			System.out.println("Sobrepasa el límite de canciones establecido (" + this.getCanciones() + ").");

		} else {

			System.out.println("Se ha creado una playlist con capacidad de " + cantidad +  " canciones.");

		}

	}

	//Tipo 4
	public boolean esColor (String color) {

		boolean correcto = false;

		if (color.equals(this.color)) {

			correcto = true;

		}

		return correcto;

	}

	public void setCanciones (int canciones) {

		this.canciones = canciones;

	}

	public void setColor (String color) {

		this.color = color;

	}

	public int getCanciones () {

		return canciones;

	}

	public String getColor () {

		return color;

	}

	public int getCapacidad () {

		return capacidad;

	}

	public String toString () {

		return "iPod " + color + ", de " + capacidad + " gb y límite de " + canciones + " canciones.";

	}
 
}