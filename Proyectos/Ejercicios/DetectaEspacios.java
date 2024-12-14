public class DetectaEspacios{

	public static void main(String[] args){

		String cadena = "volver al futuro";

		for(int i = 0; i < cadena.length(); i++){

			if(cadena.charAt(i) == ' '){

				System.out.println("char en la posición " + i + " es: espacio");
				i++;

			}

			System.out.println("char en la posición " + i + " es : " + cadena.charAt(i));

		}

	}

}
