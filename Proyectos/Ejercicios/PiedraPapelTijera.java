import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera{

	public static void main (String [] args){

		int usuario;
		int computadora;
		int cambia = 0;
		boolean buleano = true;

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();

		System.out.println("Este programa imita el juego de piedra papel o tijeras");
		System.out.println("Selecciona una mano");
		System.out.println("1: Piedra");
		System.out.println("2: Papel");
		System.out.println("3: Tijeras");
		
		computadora = aleatorios.nextInt(3)+1;
		usuario = entrada.nextInt();

			if (usuario == computadora){
				
			while(buleano){

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			System.out.println("\nEmpate -_-");
			System.out.println("Sigamos jugando");

			System.out.println("\nSelecciona una mano");
			System.out.println("1: Piedra");
			System.out.println("2: Papel");
			System.out.println("3: Tijeras");

			computadora = aleatorios.nextInt(3)+1;
			usuario = entrada.nextInt();

			if(usuario != computadora){

				buleano = false;

			}//Rompe buleano

			}//Fin while

			}//Fin if empates	

		//Computadora gana
		if (computadora == 1 && usuario == 3 || computadora == 2 && usuario == 1 || computadora == 3 && usuario == 2){

			cambia = 1;

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			System.out.println();
			System.out.println("computadora gana, usuario perdió");

		//Usuario gana 	
		} else  if(usuario == 1 && computadora == 3 || usuario == 2 && computadora == 1 || usuario == 3 && computadora == 2){ //Usuario gana

			cambia = 2;

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			System.out.println();
			System.out.println("usuario gana, computadora pierde");

		}//Fin quien gana primer partida

			buleano = true;

			System.out.println("DOS DE TRES, continuemos");

			switch(cambia){

	case 1: //Falta una para que gane computadora

			System.out.println("\nSelecciona una mano");
			System.out.println("1: Piedra");
			System.out.println("2: Papel");
			System.out.println("3: Tijeras");

			computadora = aleatorios.nextInt(3)+1;
			usuario = entrada.nextInt();

			if(computadora == usuario){

			while(buleano){

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			System.out.println("\nEmpate -_-");
			System.out.println("Sigamos jugando");

			System.out.println("\nSelecciona una mano");
			System.out.println("1: Piedra");
			System.out.println("2: Papel");
			System.out.println("3: Tijeras");

			computadora = aleatorios.nextInt(3)+1;
			usuario = entrada.nextInt();

				if(usuario != computadora){

					buleano = false;

				}//Rompe while empate

				}//Fin while

			}//Fin if empate

			buleano = true;

			//Computadora gana def
			if(computadora == 1 && usuario == 3 || computadora == 2 && usuario == 1 || computadora == 3 && usuario == 2){

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);	
			System.out.println("\nOK, nos resiganremos a perder :(");

			//Ganamos, nos falta una
			} else if(usuario == 1 && computadora == 3 || usuario == 2 && computadora == 1 || usuario == 3 && computadora == 2){

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			System.out.println();
			System.out.println("Usuario gana, pero falta una más");

			System.out.println("\nSelecciona una mano");
			System.out.println("1: Piedra");
			System.out.println("2: Papel");
			System.out.println("3: Tijeras");

				computadora = aleatorios.nextInt(3)+1;
				usuario = entrada.nextInt();

				if(computadora == usuario){

			while(buleano){

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			System.out.println("\nEmpate -_-");
			System.out.println("Sigamos jugando");

			System.out.println("\nSelecciona una mano");
			System.out.println("1: Piedra");
			System.out.println("2: Papel");
			System.out.println("3: Tijeras");

			computadora = aleatorios.nextInt(3)+1;
			usuario = entrada.nextInt();

				if(usuario != computadora){

					buleano = false;

				}//Rompe while empate

				}//Fin while

			}//Fin if empate

				//Ganamos def
				if(usuario == 1 && computadora == 3 || usuario == 2 && computadora == 1 || usuario == 3 && computadora == 2){

				System.out.println("\nJugador: " + usuario);
				System.out.println("Computadora: " + computadora);
				System.out.println();
				System.out.println("Ahora sí, ganó usuario B)");

				//Gana compu
				}else if(computadora == 1 && usuario == 3 || computadora == 2 && usuario == 1 || computadora == 3 && usuario == 2){

				System.out.println("\nJugador: " + usuario);
				System.out.println("Computadora: " + computadora);
				System.out.println("\nOK, nos resiganremos a perder :(");
			}

			}//Fin else if compu gana def

			break;

		case 2: //Nos falta uno para ganar

			System.out.println("\nSelecciona una mano");
			System.out.println("1: Piedra");
			System.out.println("2: Papel");
			System.out.println("3: Tijeras");

			computadora = aleatorios.nextInt(3)+1;
			usuario = entrada.nextInt();

			if(usuario == computadora){

			while(buleano){

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			//System.out.println();
			System.out.println("\nEmpate -_-");
			System.out.println("Sigamos jugando");

			System.out.println("\nSelecciona una mano");
			System.out.println("1: Piedra");
			System.out.println("2: Papel");
			System.out.println("3: Tijeras");

			computadora = aleatorios.nextInt(3)+1;
			usuario = entrada.nextInt();

				if(usuario != computadora){

					buleano = false;

				}//Rompe while

				}//Fin while

			}//Fin if empate

			buleano = true;

			//Usuario gana def
			if(usuario == 1 && computadora == 3 || usuario == 2 && computadora == 1 || usuario == 3 && computadora == 2){

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			System.out.println("\nAhora sí, ganó usuario B)");

			//Computadora gana falta una
			} else if(computadora == 1 && usuario == 3 || computadora == 2 && usuario == 1 || computadora == 3 && usuario == 2){

			System.out.println("\nJugador: " + usuario);
			System.out.println("Computadora: " + computadora);
			System.out.println();
			System.out.println("Computadora gana, pero falta una más");

			System.out.println("\nSelecciona una mano");
			System.out.println("1: Piedra");
			System.out.println("2: Papel");
			System.out.println("3: Tijeras");

				computadora = aleatorios.nextInt(3)+1;
				usuario = entrada.nextInt();

				if(computadora == usuario){

				while(buleano){

				System.out.println("\nJugador: " + usuario);
				System.out.println("Computadora: " + computadora);
				System.out.println("\nEmpate -_-");
				System.out.println("Sigamos jugando");

				System.out.println("\nSelecciona una mano");
				System.out.println("1: Piedra");
				System.out.println("2: Papel");
				System.out.println("3: Tijeras");

				computadora = aleatorios.nextInt(3)+1;
				usuario = entrada.nextInt();

				if(usuario != computadora){

					buleano = false;

				}//Rompe while empate

				}//Fin while

			}//Fin if empate

				//Compu gana def
				if(computadora == 1 && usuario == 3 || computadora == 2 && usuario == 1 || computadora == 3 && usuario == 2){

				System.out.println("\nJugador: " + usuario);
				System.out.println("Computadora: " + computadora);
				System.out.println("\nOK, nos resiganremos a perder :(");

				//Usuario gana def
				} else if(usuario == 1 && computadora == 3 || usuario == 2 && computadora == 1 || usuario == 3 && computadora == 2){

				System.out.println("\nJugador: " + usuario);
				System.out.println("Computadora: " + computadora);
				System.out.println("\nAhora sí, ganó usuario B)");
				
				}

			}//Fin else if compu gana def

			break;

		}//Fin switch

	}//Fin main

}//Fin class
