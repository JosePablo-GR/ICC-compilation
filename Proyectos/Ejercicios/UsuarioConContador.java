import java.util.Scanner;

public class UsuarioConContador{

	public static void main(String[] abs){

		int contador = 3;
		String usuarioR = "josep";
		String contraR = "yoyoyo";
		Scanner input = new Scanner(System.in);

		System.out.println("Ingresa tu usuario: ");
		String usuario = input.nextLine().toLowerCase();

		System.out.println("Ingresa tu contraseña: ");
		String contra = input.nextLine();

		if(usuario.equals(usuarioR) && !(contra.equals(contraR))){

			boolean otra = true;

			while(otra){

				System.out.println("\nContraseña incorrecta, intenta de nuevo.");
				System.out.println("Te quedan " + contador + " intentos");
				contra = input.nextLine();

				contador--;

				if(contador == 0){

					otra = false;

					System.out.println("\nYa valiste, bloqueaste tu cuenta");
					System.out.println("Intenta en 15 minutos(imaginarios)");

				} else if(contra.equals(contraR)){

					otra = false;

					System.out.println("\nBienvenido a tus datos");

				}//Fin sale ciclo

			}//Fin while otra

		} else if(usuario.equals(usuarioR) && contra.equals(contraR)){

			System.out.println("\nBienvenido a tus datos");

		} else if(usuario2){


		}else {

		System.out.println("\nNo estás registrado :(");

		}//Fin todo

	}//Fin main

}//Fin class
