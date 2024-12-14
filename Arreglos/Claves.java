import java.util.Scanner;
import java.util.Random;

class Claves {

	public static String trasnformaEnCadena (char[] a) {
		
		String cadena = "";

		for (char c : a) {

			cadena += c;

		}

		return cadena;

	}

	public static char[] revuelve (String cadena) {

		Random rd = new Random();

		int empieza = 0;

		char[] arreglito = new char [cadena.length()];

		for (int i = 0; i < arreglito.length; i++){

			char elemCadena = cadena.charAt(empieza);

			arreglito [i] = elemCadena;

			empieza++;

		}

		for (int j = 0; j < arreglito.length; j++) {

			int positionArregloN = rd.nextInt(arreglito.length);

			char actual = arreglito[j];

			char otro = arreglito[positionArregloN];

			arreglito[j] = otro;

			arreglito[positionArregloN] = actual;

		}

		return arreglito;

	}

	public static void main(String[] args) {

	for (int a = 1; a <= 10; a++) {

		Random rd = new Random();

		String cadFinal = "";
		int longRestante;

		//////////Escoge carácter//////////
		String chars = "*#$&+?%";

		int characters = rd.nextInt(7);

		char charEscogido = chars.charAt(characters);

		cadFinal += charEscogido;

		//System.out.println(charEscogido);

		//////////Escoge números//////////
		int n;
		int unoDosNum = rd.nextInt(2);

		if (unoDosNum == 1) {

			n = 1;

		} else {

			n = 2;

		}

		int seguridadNumeros = n;

		for (int i = 1; i <= n; i++) {

			int numeros = rd.nextInt(10);

			cadFinal += numeros;

		}

		//////////Escoge letras//////////
		String alf = "abcdefghijklmnopqrstuvwxyz";
		String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int m;
		int posicion;
		int unoDosMayus = rd.nextInt(2);

		if (unoDosMayus == 1) {

			m = 1;

		} else {

			m = 2;

		}

		int seguridadLetras = m;

		for (int j = 1; j <= m; j++) {

			posicion = rd.nextInt(26);

			char letraMayus = mayus.charAt(posicion);

			cadFinal += letraMayus;

		}

		longRestante = 8 - cadFinal.length();

		for (int k = 1; k <= longRestante; k++) {

			posicion = rd.nextInt(26);

			char letra = alf.charAt(posicion);

			cadFinal += letra;

		}

		String mensajeSeguridad;

		if ((seguridadNumeros == 2) && (seguridadLetras == 2)) {

			mensajeSeguridad = "Seguridad alta";

		} else if ((seguridadNumeros == 1) && (seguridadLetras == 1)) {

			mensajeSeguridad = "Seguridad débil";

		} else {

			mensajeSeguridad = "Seguridad media";

		}

		char[] revuelto = revuelve(cadFinal);

		System.out.println(trasnformaEnCadena(revuelto) + " " + mensajeSeguridad);

		}

	}

}