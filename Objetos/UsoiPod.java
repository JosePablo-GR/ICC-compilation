import java.util.Scanner;

public class UsoiPod {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		iPod reproductor = new iPod(30,"azul");

		//System.out.println(reproductor);
		System.out.println(reproductor);

		String artista = reproductor.artistaFavorito().trim();
		System.out.println("Tu artista favorito tiene " + artista.length() + " letras.");
		System.out.println("¿Adivinas quién es?\n");

		System.out.println("Se te asignó " + reproductor.getCanciones() + " canciones como límite.");
		System.out.println("¿Quieres cambiarlo? Esta acción no puede ser deshecha. [y/n]");
		char opcion = teclado.next().charAt(0);

		if (opcion == 'y') {

			System.out.print("Elige la capacidad de canciones: ");
			int canciones = teclado.nextInt();

			reproductor.setCanciones(canciones);

		}

		System.out.println("\n¡Momento de crear una playlist!");
		System.out.println("¿De cuantas canciones quieres tu playlist? Toma en cuanta la capcidad.");
		int playlist = teclado.nextInt();

		reproductor.crearPlaylist(playlist);

		System.out.println("\n¿El reproductor es color " + reproductor.color + "?: " + reproductor.esColor(reproductor.getColor()));
		System.out.println("¿El reproductor es color rojo?: " + reproductor.esColor("rojo"));

		reproductor.reproducir();

	}

}