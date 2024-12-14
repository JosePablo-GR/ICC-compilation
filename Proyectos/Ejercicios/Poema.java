public class Poema {

	public static void main(String[] args) {

		final String RESET = "\u001B[0m";
		final String BLACK = "\u001B[30m";
		final String WHITE = "\u001B[37m";

		final String RED = "\u001B[31m";
		final String GREEN = "\u001B[32m";
		final String YELLOW = "\u001B[33m";
		final String PURPLE = "\u001B[35m";
		final String CYAN = "\u001B[36m";
		final String BLUE = "\u001B[34m";
		
		System.out.println("Programa que imprime un poema con diferentes modificaciones\n");

		String lineaUno = "Aférrate a tus sueños";
		String lineaDos = "porque si los sueños mueren";
		String lineaTres = "la vida es como un pajaro de alas rotas";
		String lineaCuatro = "incapaz de volar.";
		String lineaCinco = "AFERRATE A TUS SUEÑOS";
		String lineaSeis = "porque si los sueños se marcha";
		//String lineaSiete = "la vida es como un campo yermo";
		String lineaOcho = "cubierto de escarcha.";
		String lineaSietePt1 = RED + "la " + RESET;
		String lineaSietePt2 = GREEN + "vida " + RESET;
		String lineaSietePt3 = YELLOW +"es " + RESET;
		String lineaSietePt4 = BLUE + "como " + RESET;
		String lineaSietePt5 = PURPLE + "un " + RESET;
		String lineaSietePt6 = CYAN + "campo " + RESET;
		String lineaSietePt7 = RED + "yermo " + RESET;

		lineaTres = lineaTres.replaceAll("a","\\$");
		lineaTres = lineaTres.replaceAll("e" , "\\$");
		lineaTres = lineaTres.replaceAll("i" , "\\$");
		lineaTres = lineaTres.replaceAll("o" , "\\$");
		lineaTres = lineaTres.replaceAll("u" , "\\$");

		String lineaSiete = lineaSietePt1 + lineaSietePt2 + lineaSietePt3;
		lineaSiete += lineaSietePt4 + lineaSietePt5 + lineaSietePt6 + lineaSietePt7;

		System.out.println(RED + lineaUno.toUpperCase() + RESET);
		System.out.println(GREEN + lineaDos + RESET);
		System.out.println(YELLOW + lineaTres + RESET);
		System.out.println(BLUE + lineaCuatro + RESET);
		System.out.println(PURPLE + lineaCinco.toLowerCase() + RESET);
		System.out.println(CYAN + lineaSeis + RESET);
		System.out.println(lineaSiete.replaceAll(" ", ""));
		System.out.println(WHITE + lineaOcho + RESET);
		System.out.println();

	}

}