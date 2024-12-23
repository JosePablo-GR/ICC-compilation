// ICC 2024-1
import java.util.Scanner;
import java.util.Random;

public class Ahorcado{

	public static String cartelera(int random){

	String pelicula = "";

	if(random == 0){

		pelicula = "avengers";

	} else if(random == 1){

		pelicula = "volver al futuro";

	} else if(random == 2){

		pelicula = "barbie";

	} else if(random == 3){

		pelicula = "batman";

	} else if(random == 4){

		pelicula = "star wars";

	} else if(random == 5){

		pelicula = "la sirenita";

	} else if(random == 6){

		pelicula = "lalaland";

	} else if(random == 7){

		pelicula = "el resplandor";

	} else if(random == 8){

		pelicula = "lilo y stitch";

	} else if(random == 9){

		pelicula = "avatar";

	}

	return pelicula;

	}

	public static String imprimeRayitas(String pelicula){

		String espacios = "";
		String blankSpace = "  ";
		String rayitas = "_ ";

		for(int i = 0; i < pelicula.length(); i++){

			if(pelicula.charAt(i) != ' '){

				espacios += rayitas;

			} else {

				espacios += blankSpace;

			}

		}

		return espacios;	

	}

	public static String respuesta(String pelicula){

		String resp = "";

		for(int a = 0; a < pelicula.length(); a++){

			if(pelicula.charAt(a) != ' '){

				resp = resp + pelicula.charAt(a) + " ";

			} else if (pelicula.charAt(a) == ' '){

				resp += "  ";

			}

		}

		return resp;

	}

	public static String completa(String pelicula, char letra){

		String masLetras = "";
		String blankSpace = "  ";
		String rayitas = "_ ";
		//boolean contenido = false;

		for(int i = 0; i < pelicula.length(); i++){

			if(pelicula.charAt(i) == letra){

				//contenido = true;
				masLetras = masLetras + letra + " ";
				//System.out.print(letra + " ");

			} else if(pelicula.charAt(i) != ' '){

				masLetras += rayitas;
				//System.out.print("_ ");

			} else {

				masLetras += blankSpace;
				//System.out.print("  ");

			}

		}

		//System.out.println();

		return masLetras;

	}

	public static String rayitasLetras(String pelicula, String cadenaLetras) {
    
    boolean encontrado;
    String palabraFinal = "";

    for(int i = 0; i < pelicula.length(); i++){

       encontrado = false;

        for(int j = 0; j < cadenaLetras.length(); j++){

            if(pelicula.charAt(i) == cadenaLetras.charAt(j)){

                palabraFinal += cadenaLetras.charAt(j) + " ";
                encontrado = true;
                break;

            }
        }

        if(!encontrado && pelicula.charAt(i) != ' '){

            palabraFinal += "_ ";

        } else if (pelicula.charAt(i) == ' '){

            palabraFinal += "  ";

        }
        
    }

    return palabraFinal;
	
	}

	public static boolean letraContenida(String letrasUsadas, char l){

		boolean esta = false;

		for(int f = 0; f < letrasUsadas.length(); f++){

			if(letrasUsadas.charAt(f) == l){

				esta = true;

			} else {

				esta = false;

			}

		}

		return esta;

	}

public static void main(String[] args){

	Random rd = new Random();
	Scanner t = new Scanner(System.in);
	int quePelicula;
	int opcionUsuario;
	byte contCompu = 0;
	byte contJugador = 0;

	System.out.println("Bienvenido al juego de El Ahorcado");
	System.out.print("\nPor favor ingresa tu nombre: ");
	String nombre = t.nextLine();

	System.out.println("Ahora, selecciona la opción que desees");
	boolean centinela = true;
	int contadorJ = 0;

	while(centinela){

		quePelicula = rd.nextInt(10);

		String pelicula = cartelera(quePelicula);

		System.out.println("\n1. Jugar");
		System.out.println("2. Ver estadísticas");
		System.out.println("3. Salir");
		opcionUsuario = t.nextInt();

		switch(opcionUsuario){

		case 1:

			int perder = 6;

			contadorJ = contadorJ+1;

			System.out.println("\nDebes ingresar solo una letra, sin acentos");
			System.out.println("La película que tienes que adivinar es la siguiente:");
			System.out.println(imprimeRayitas(pelicula));
			String answer = respuesta(pelicula);

			boolean contenido;
			int contadorMonito = 0;
			String letrasUsadas = "";

			while(perder > 0){

				contenido = false;

				System.out.println("\nIngresa una letra");
				String frase = "ponganme 10 pls";

				while(frase.length() > 1){

					frase = t.next();

					if(frase.length() > 1){

						System.out.println("\nIngresa un caracter a la vez");

					}

				}

				char letra = frase.charAt(0);
				
				String cadena = completa(pelicula,letra);

				for(int i = 0; i < pelicula.length(); i++){

					if(pelicula.charAt(i) == letra){

						contenido = true;

					}

				}

				if(!contenido){

					System.out.println("'" + letra + "' no forma parte de la palabra");
					perder--;
					contadorMonito++;

						switch(contadorMonito){

							case 6:

								System.out.println();
								System.out.println("\t 0");
								System.out.println("\tl|l");
								System.out.println("\td b");
								System.out.println("\nHas perdido la partida. Punto para la computadora");
								contCompu++;

								System.out.println("La película que no adiviniste era: " + pelicula);

								break;

							case 5:

								System.out.println();
								System.out.println("\t 0");
								System.out.println("\tl|l");
								System.out.println("\td ");

								break;

							case 4:

								System.out.println();
								System.out.println("\t 0");
								System.out.println("\tl|l");

								break;

							case 3:

								System.out.println();
								System.out.println("\t 0");
								System.out.println("\tl|");

								break;

							case 2:

								System.out.println();
								System.out.println("\t 0");
								System.out.println("\tl");

								break;

							case 1:

								System.out.println();
								System.out.println("\t 0");

								break;

						}

				} else {

						if(!(letraContenida(letrasUsadas,letra))){

						letrasUsadas += letra;

						}

					String juegoUsuario = rayitasLetras(pelicula,letrasUsadas);

					System.out.println();
					System.out.println(juegoUsuario);

					//System.out.println("answer de '" + pelicula + "': " + answer);

					if(juegoUsuario.equals(answer)){

						perder = 0;
						System.out.println("\n¡" + nombre + " has ganado la partida! Punto para ti");
						contJugador++;

						break;

					}

					}

				//}

			}//Fin while ciclo

			break;

		case 2:

			if(contadorJ == 0){

				System.out.println("\nAún no hay ningún juego registrado");

			} else {

				System.out.println("");
				System.out.println("Total de juegos: " + contadorJ);
				System.out.println("Victorias de " + nombre + ": " +  contJugador);
				System.out.println("Victorias de la computadora: " + contCompu);

			}

			break;

		case 3:

			centinela = false;
			System.out.println("\nHasta luego " + nombre + ", gracias por ejecutar el programa :)");

			break;

		default:

			System.out.println("\nOpción incorrecta intenta de nuevo");

			break;

		}

	}//Fin while

	}//Fin main

}//Fin class
