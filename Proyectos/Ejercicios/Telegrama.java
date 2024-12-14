import java.util.Scanner;

public class Telegrama {

	public static void main(String[] args) {

		Scanner t = new Scanner (System.in);

		System.out.println("Ingresa los siguientes datos:\n");

		System.out.println("Tus datos (remitente):");

		System.out.print("Nombre : ");
		String nombreRem = t.nextLine();

		System.out.print("Profesión: ");
		String profesionRem = t.nextLine();
		System.out.println();

		System.out.println("Los datos de quien recibirá (destinatario):");

		System.out.print("Nombre : ");
		String nombreDst = t.nextLine();

		System.out.println("Dirección:");

		System.out.print("	Calle: ");
		String calle = t.nextLine();

		System.out.print("	Número: ");
		int numero = t.nextInt();

		System.out.print("	Cuidad: ");
		String cuidad = t.next();

		System.out.print("	CP: ");
		String cp = t.next();

		System.out.println();
		System.out.println("Listo, ahora escribe el telegrama a enviar.");
		t.nextLine();
		String texto = t.nextLine();

		int cuantasPalabras = texto.length();

		System.out.println("\n¿Deseas enviarlo con urgencia? [Sí = 1/No = 2]");
		int urge = t.nextInt();

		double costo = (urge != 1) ? 2 : 4;

		System.out.println();
		System.out.print("De: ");
		System.out.println(nombreRem);

		System.out.print("Para: ");
		System.out.println(nombreDst);

		System.out.println("Mensaje:");
		System.out.println(texto);

		System.out.print("\nEste mensaje es ");

		System.out.print(urge != 1 ? "de prioridad normal." : "¡Urgente!");

		System.out.println(" Costo: $" + cuantasPalabras*costo);
		System.out.println("Tu mensaje tiene " + cuantasPalabras + " letras. El costo por letra es $" + costo);

		System.out.println("\nDirección: ");
		System.out.println("\t" + calle.toUpperCase() + " " + numero);
		System.out.println("\t" + cuidad + " " + cp);

	}

}