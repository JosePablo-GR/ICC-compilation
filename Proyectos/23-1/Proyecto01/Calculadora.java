import java.util.Scanner;

public class Calculadora{

	Scanner entrada = new Scanner(System.in);
	int i = 0;
	
	public long decABin(int dec){

		int aux = dec;
		long bin = 0;
		int digito;
		int divide = 2;

		for (int j = 0; dec > 0; dec /= divide, j++) {
			digito = dec % divide;
			bin += digito * Math.pow(10, j);

		}

		return bin;
	}
	
	//Decimal a octal
	public String decAOct(int dec){

		String oct = "";
		String caracteresOctales = "01234567";

		while (dec > 0) {
			int residuo = dec % 8;
			oct = (caracteresOctales.charAt(residuo) + oct);
			dec = dec / 8;
		}

		return oct;

		}
	
	//Decimal a hexa
	public String decAHex(int dec){

		String hex = "";
		String caracteresHexadecimales = "0123456789ABCDEF";

		while (dec > 0) {
			int residuo = dec % 16;
			hex = caracteresHexadecimales.charAt(residuo) + hex; // Agrega a la izquierda
			dec /= 16;
		}

		return hex;
	}
	
	//Binario a decimal
	public int binADec(long bin){

		long aux = bin;
		int dec = 0;
		int digito;
		long divide = 10;

		for (long j = 0; bin > 0; bin /= divide, j++) {
			digito = (int) (bin % divide);

			if (digito != 0 && digito != 1) {
				System.out.println("falló");
			}
			dec += digito * Math.pow(2, j);
		}

		return dec;
	}
	
	//Binario a octal
	public String binAOct(long bin){

		int aux = binADec(bin);//pasamos el octal a decimal
		String aux2 = decAOct(aux);//reutilizamos nuestro metodo decimal a octal
		return aux2;

	}
	
	//Binario a hexa
	public String binAHex(long bin){
		int aux = binADec(bin);//pasamos el octal a decimal
		String aux2 = decAHex(aux);//reutilizamos nuestro metodo decimal a hexadecimal
		return aux2;
	}
	
	//Octal a decimal
	public int octADec(String oct){

		int dec = 0;
		int pow = 0;

		for (int x = oct.length() - 1; x >= 0; x--) {

			int valorActual = Character.getNumericValue(oct.charAt(x));
			long potencia = (long) Math.pow(8, pow) * valorActual;
			dec += potencia;
			pow++;
		}

		return dec;
	}

	//Octal a binario
	public long octABin(String oct){
		int aux = octADec(oct); //pasamos el octal a decimal
		long aux2 = decABin(aux); //reutilizamos nuestro metodo decimal a binario
		return aux2;
	}
	
	//Octal a hexa
	public String octAHex(String oct){

		int aux = octADec(oct);//pasamos el octal a decimal
		String aux2 = decAHex(aux);//reutilizamos nuestro metodo decimal a hexadecimal
		return aux2;

	}
	
	//Hexa a decimal
	public int hexADec(String hexa){

		int dec = 0;
		int pow = 0;

		for (int i = hexa.length() - 1; i >= 0; i--) { 
			int valor = Hexa(hexa.charAt(i));//llamada al metodo auxiliar
			long potencia = (long) Math.pow(16, pow)*valor;
			dec += potencia;
			pow++;
		}

		return dec;

	}
	
	//Metodo auxiliar que regresa el valor en decimal de una letra
	public static int Hexa(char letra){

		switch (letra) {

			case 'A': return 10;
			case 'B': return 11;
			case 'C': return 12;
			case 'D': return 13;
			case 'E': return 14;
			case 'F': return 15;

			default:
			
			return Integer.parseInt(String.valueOf(letra));
		}
		
	}
	
	//Metodo para pasar de un hexadecimal a binario
	public long hexABin(String hexa){

		int aux = hexADec(hexa);//pasamos el octal a decimal
		long aux2 = decABin(aux);//reutilizamos nuestro metodo decimal a binario
		return aux2;

	}
	
	//Metodo para pasar de un hexadecimal a octal
	public String hexAOct(String hexa){

		int aux = hexADec(hexa);//pasamos el octal a decimal
		String aux2 = decAOct(aux);//reutilizamos nuestro metodo decimal a octal
		return aux2;

	}
	
	//Metodo menu que despliega el menu al ser usado con una instancia de Calculadora
	public void menu(){

		boolean sistemaCorrecto = true;
 		boolean bandera = true;

		while(bandera) {

			System.out.println();
			System.out.println("Introduce una opción: ");
			System.out.println("\n1.- Realizar cambio de base de DECIMAL A BINARIO");
			System.out.println("2.- Realizar cambio de base de DECIMAL A OCTAL");
			System.out.println("3.- Realizar cambio de base de DECIMAL A HEXADECIMAL");
			System.out.println("4.- Realizar cambio de base de BINARIO A DECIMAL");
			System.out.println("5.- Realizar cambio de base de BINARIO A OCTAL");
			System.out.println("6.- Realizar cambio de base de BINARIO A HEXADECIMAL");
			System.out.println("7.- Realizar cambio de base de OCTAL A DECIMAL");
			System.out.println("8.- Realizar cambio de base de OCTAL A BINARIO");
			System.out.println("9.- Realizar cambio de base de OCTAL A HEXADECIMAL");
			System.out.println("10.- Realizar cambio de base de HEXADECIMAL A DECIMAL");
			System.out.println("11.- Realizar cambio de base de HEXADECIMAL A BINARIO");
			System.out.println("12.- Realizar cambio de base de HEXADECIMAL A OCTAL");
			System.out.println("13.- Salir");

			int opcion = entrada.nextInt();

			switch(opcion){

				case 1: //Decimal a binario

					System.out.println();
					System.out.println("Ingresa un número en _decimal_ que quieres convertir a *binario*");
					//System.out.println("sistemaCorrecto: " + sistemaCorrecto);
					String noSeLee = entrada.nextLine();
					String aux = entrada.nextLine();

					int numDec1 = Integer.parseInt(aux);
					System.out.println("\nEl número " + numDec1 + " es en binario: " + decABin(numDec1));

					bandera = false;

					break;

				case 2: //Decimal a octal

					System.out.println();
					System.out.println("Ingresa un número en _decimal_ que quieres convertir a *octal*");
					int numDec2 = entrada.nextInt();

					System.out.println("\nEl número " + numDec2 + " es en octal: " + decAOct(numDec2));
					bandera = false;

					break;

				case 3: //Decimal a hexadecimal

					System.out.println();
					System.out.println("Ingresa un número en _decimal_ que quieres convertir a *hexadecimal*");
					int numDec3 = entrada.nextInt();

					System.out.println("\nEl número " + numDec3 + " es en hexadecimal: " + decAHex(numDec3));
					bandera = false;

					break;

				case 4: //Binario a decimal

					System.out.println();
					System.out.println("Ingresa un número en _binario_ que quieres convertir *decimal*");					
					long numBin1 = entrada.nextLong();

					System.out.println("\nEl binario " + numBin1 + " es en decimal: " + binADec(numBin1));
									
					bandera = false;

					break;

				case 5: //Binario a octal

					System.out.println();
					System.out.println("Ingresa un número en _binario_ que quieres convertir a *octal*");
					long numBin2 = entrada.nextLong();

					System.out.println("\nEl binario " + numBin2 + " es en octal: " + binAOct(numBin2));
					bandera = false;

					break;

				case 6: //Binario a hexadecimal

					System.out.println();
					System.out.println("Ingresa un número en _binario_ que quieres convertir a *hexadecimal*");
					long numBin3 = entrada.nextLong();

					System.out.println("\nEl binario " + numBin3 + " es en hexadecimal: " + binAHex(numBin3));;
					bandera = false;

					break;

				case 7: //Octal a decimal

					System.out.println();
					System.out.println("\nIngresa un número en _octal_ que quieres convertir a *decimal*");
					String noSeLee2 = entrada.nextLine();
					String numOct1 = entrada.nextLine();

					while(i < numOct1.length()){

					char carac = numOct1.charAt(i);

					if(carac == '9' || carac == '8') {

						sistemaCorrecto = false;

					}

					i++;

				}

					if(sistemaCorrecto){

						System.out.println("\nEl número " + numOct1 + " es en decimal: " + octADec(numOct1));


					} else {

						System.out.println("\nEsa cosa no está en base ocho");

					}

					bandera = false;

					break;

				case 8: //Octal a binario

					System.out.println();
					System.out.println("Ingresa un número en _octal_ que quieres convertir a *binario*");
					String no = entrada.nextLine();
					String numOct2 = entrada.nextLine();

					while(i < numOct2.length()){

					char carac = numOct2.charAt(i);

					if(carac == '9' || carac == '8') {

						sistemaCorrecto = false;

					}

					i++;

				}

					if(sistemaCorrecto){

						System.out.println("\nEl número " + numOct2 + " es en binario: " + octABin(numOct2));


					} else {

						System.out.println("\nEsa cosa no está en base ocho");

					}

					bandera = false;

					break;

				case 9: //Octal a hexadecimal

					System.out.println();
					System.out.println("Ingresa un número en _octal_ que quieres convertir a *hexadecimal*");
					String entiendo = entrada.nextLine();
					String numOct3 = entrada.nextLine();

					while(i < numOct3.length()){

					char carac = numOct3.charAt(i);

					if(carac == '9' || carac == '8') {

						sistemaCorrecto = false;

					}

					i++;

				}

					if(sistemaCorrecto){

						System.out.println("\nEl número " + numOct3 + " es en hexadecimal: " + octAHex(numOct3));


					} else {

						System.out.println("\nEsa cosa no está en base ocho");

					}

					bandera = false;

					break;

				case 10: //Hexadecimal a decimal

					System.out.println();
					System.out.println("Ingresa un número en _hexadecimal_ que quieres convertir a *decimal*");
					String este = entrada.nextLine();
					String numHex1 = entrada.nextLine().toUpperCase();

					System.out.println("\nEl número hexadecimal " + numHex1 + " es en decimal: " + hexADec(numHex1));
					bandera = false;

					break;

				case 11: //Hexadecimal a binario

					System.out.println();
					System.out.println("Ingresa un número en _hexadecimal_ que quieres convertir a *binario*");
					String error = entrada.nextLine();
					String numHex2 = entrada.nextLine().toUpperCase();

					System.out.println("\nEl número hexadecimal " + numHex2 + " es en binario: " + hexABin(numHex2));
					bandera = false;

					break;

				case 12: //Hexadecimal a octal

					System.out.println();
					System.out.println("Ingresa un número en _hexadecimal_ que quieres convertir a *octal*");
					String jelp = entrada.nextLine();
					String numHex3 = entrada.nextLine().toUpperCase();

					System.out.println("\nEl número hexadecimal " + numHex3 + " es en octal: " + hexAOct(numHex3));
					bandera = false;

					break;

				case 13:

					bandera = false;

					break;

				default: //Si no se cumple ningun keis

					System.out.println();
					System.out.println("Opcion inválida");
					System.out.println("Intenta de nuevo\n");

					break;

			}
		}
	}

	/*

	 public static void main(String[] args) {                                                                                                      
                Calculadora cal = new Calculadora();                                                                                                  
                cal.menu();                                                                                                                           
        } 

        */
}
