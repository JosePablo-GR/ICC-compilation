import java.util.Scanner;
import java.util.Random;

public class MetodosAuto{

	boolean encendido;
	String compania;
	String marca;
	String color;
	double gasolinaActual;

	final double capacidadTotal = 50.00; //Litros
	final double gastoGas = 0.3; //Se restará
	final double aCuantoLaGas = 19.8; //$$

	public MetodosAuto(){}//Fin constructor por omisión

	public MetodosAuto(boolean encendido, String compania, String marca, String color, double gasolinaActual){

		this.encendido = encendido;
		this.compania = compania;
		this.marca = marca;
		this.color = color;
		this.gasolinaActual = gasolinaActual;
		
	}//Fin constructor

	public void setEncendido(boolean encendido){

		this.encendido = encendido;

	}//Fin setEncendido

	public boolean getEncendido(){

		return encendido;

	}//Fin getEncendido

	public void setCompania(String compania){

		this.compania = compania;

	}//Fin setCompania

	public String getCompania(){

		return compania;

	}//Fin getCompania

	public void setMarca(String marca){

		this.marca = marca;

	}//Fin setMarca

	public String getMarca(){

		return marca;

	}//Fin getMarca

	public void setGasolinaActual(double gasolinaActual){

		this.gasolinaActual = gasolinaActual;

	}//Fin setGasolinaActual

	public double getGasolinaActual(){

		return gasolinaActual;

	}//Fin getGasolinaActual

	public void revisarGas(){

		double restaDoble = capacidadTotal - getGasolinaActual();
		int resta = (int) restaDoble; //Litros que faltan para tanque lleno

		double precio = resta*aCuantoLaGas;

		System.out.println("\nPara partipar en la carrera debes tener el tanque lleno tienes " + getGasolinaActual() + " litros");
		System.out.println("Como no queremos atrasarte, lo llenamos con " + resta + " litros");
		System.out.println("y son $" + precio + ", al rato nos lo pasas");

		setGasolinaActual(50.00);

	}//Fin meétodo revisarGas

	public void avanzar(int kilometros){

		for(int i = 0; i <= kilometros; i++){

			System.out.println("\nKilometro " + i);
			System.out.println("Gasolina del auto: " + this.gasolinaActual);
			this.gasolinaActual -= gastoGas;
			//this.gasolinaActual--;

			if(this.gasolinaActual <= 0){

				int j = i;
				i = kilometros;

				System.out.println("\nNos quedamos en el kilometro " + j);
				System.out.println("No logramos completar el viaje");
				System.out.println("El auto se apagará...\n");
				setEncendido(false);

			}//Fin if nos quedamos sin gasolina

		}//Fin for auto avanza

		setGasolinaActual(this.gasolinaActual);

	}//Fin método avanzar

	public void cargarGasolinaDinero(double dinero){

		Random aleatorios = new Random();
		
		int n = aleatorios.nextInt(5)+1;
		System.out.println();

		int nuevaGasolina = 0; //Litros
		int teSaldraEn = 0; //$$

		if(this.gasolinaActual >= 50){

			System.out.println("El tanque ya está lleno -.-");

		} else { //Mínimo 1l de gasolina

			for(int x = 1; x <= n; x++){

			System.out.println("Cargando gasolina...");

			}//Fin whie imprime mensaje xD

		System.out.println();

			double litrosDobles = dinero / aCuantoLaGas; //Cuántos litros se llenarán

			int litros = (int) Math.ceil(litrosDobles);

			//System.out.println("Litros vale: " + litros);
			//System.out.println("LitrosDobles vale: " + litrosDobles);

			for(int i = 1; i <= litros; i++){

				System.out.println("Etraste al for");

				if(this.gasolinaActual >= 50){

					//i = litros;

					System.out.println("El tanque se ha llenado");

				} else {

					while(dinero > 0){

						teSaldraEn += 0.36;

						if(teSaldraEn % 19.8 == 0){ //teSaldraEn es múltiplo de 19.8

							nuevaGasolina++;

						}//Fin if es múltiplo

					}//Fin while rellena y cuánto va a ser
					
				}//Fin if tanque está lleno después de llenado

			}//Fin for cargando gass

		}//Fin if se puede rellenar?

		double costoFinal = nuevaGasolina*aCuantoLaGas;
		setGasolinaActual(nuevaGasolina + this.gasolinaActual); 

		System.out.println("Se llenaron " + nuevaGasolina + " litros y son $" + costoFinal);
		System.out.println("Gasolina actual: " + getGasolinaActual());

	}//Fin método cargarGasolinaDinero

	public void cargarGasolinaLitros(int litros){

		litros = (int) litros;

		double cuantoSera = litros*aCuantoLaGas; //En $$
		double resta = Math.ceil(capacidadTotal - this.gasolinaActual);

		if(this.gasolinaActual >= 50){

			System.out.println("\nEl tanque ya está lleno -.-");

		}else{

			if(litros > resta){

			System.out.println("\nActualmente el tanque tiene " +
			getGasolinaActual() + " lo máximo que puedes aumentarle son " + resta + " litros");

		} else {

			System.out.println("\n¡CEROOS!");
			System.out.println();

			for(int i = 0; i <= litros; i++){

			setGasolinaActual(this.gasolinaActual);

			//double mensaje = this.gasolinaActual;
			//double cuantoVa = mensaje++;	

			System.out.println("Gasolina: " + this.gasolinaActual);

			this.gasolinaActual++;

		}//Fin for cargando gasolina

		if(this.gasolinaActual >= 50.0){

			setGasolinaActual(50.00);

		}//Fin if diferentes mensajes

		System.out.println("\nDe tus " + litros + " litros van a ser $" + cuantoSera);
		System.out.println("Y sales con " + this.gasolinaActual + " litros :)");

		}//Capacidad máxima de gas

		}//Fin if a ver si tanque está lleno

	}//Fin método cargarGasolinaLitros

	public void cargarTodoElTanque(){

		setGasolinaActual(this.gasolinaActual);

		double restaDoble = capacidadTotal - getGasolinaActual();
		int resta = (int) restaDoble;

		//System.out.println("getGasolinaActual: " + getGasolinaActual());
		//System.out.println("this.gasolinaActual: " + this.gasolinaActual);
		//System.out.println("gasolinaActual: " + getGasolinaActual());

		if(this.gasolinaActual < 1){

			System.out.println("\nTe faltaban unas gotas para llenar el tanque");
			System.out.println("Ntp, nosotros lo invitamos");

		} else {

			System.out.println("\n¡CEROOS!");

			for(int i = 0; i <= resta; i++){

			setGasolinaActual(this.gasolinaActual);

			if(this.gasolinaActual >= 50.0){

			setGasolinaActual(50.00);

		}//Fin if diferentes mensajes

			System.out.println("Gasolina: " + this.gasolinaActual);

			this.gasolinaActual++;

		}//Fin for rellena gasolina

			setGasolinaActual(50.00);

		}//Fin if cuánto de gasolina faltaba

	}//Fin método cargarTodoElTanque

	public void carreritas(String a1, String a2){

		Random aleatorios = new Random();

		int vueltasC1 = 0; //Contador Carro 1
		int vueltasC2 = 0; //Contador Carro 2
		boolean hayGanador = false;

		System.out.println();
		System.out.println();
		System.out.println("                                   Inicia la carrera!!!\n");

		while(!hayGanador){

			int confusion = aleatorios.nextInt(4)+1;
			boolean cc1 = false; //Confusión Carro 1
			boolean cc2 = false; //Confusión Carro 2

		if(confusion == 1){

			cc1 = true;

		} else if(confusion == 4){

			cc2 = true;

		}//Fin a ver si hay confusión

		if(cc1){

			System.out.println(a1 + " se detiene porque el conductor ha entrado en confusión");

			vueltasC2++;
			System.out.println(a2 + " ha completado " + vueltasC2 + " vueltas");

		}//Fin if Carro 1 tiene confusión

		if(cc2){

			vueltasC1++;
			System.out.println(a1 + " ha completado " + vueltasC1 + " vueltas");

			System.out.println(a2 + " se detiene porque el conductor ha entrado en confusión");

		}//Fin if Carro 2 tiene confusión

		 if(cc1 == false && cc2 == false){

			vueltasC1++;
			vueltasC2++;
			System.out.println(a1 + " ha completado " + vueltasC1 + " vueltas");
			System.out.println(a2 + " ha completado " + vueltasC2 + " vueltas");

		}//Fin if imprime si se confunsión o sigue

		System.out.println("*****************************************************************************");

		if(vueltasC1 == 10 || vueltasC2 == 10){

			hayGanador = true;

		}//Fin if hayGandor

		}//while for vueltas

		if(vueltasC1 == 10){

			System.out.println("Y el ganador es...");
			System.out.println(a1 + "!!!!");

		} else if (vueltasC2 == 10){

			System.out.println("Y el ganador es...");
			System.out.println(a2);

		} else if(vueltasC1 == 10 && vueltasC2 == 10){

			System.out.println("Órale, fue empate. Los dos llegamos al mismo tiempo.");

		}//Fin quién es ganador

	}//Fin método carreritas

	public String toString(){

		return "Marca: " +  marca + "\nCompañía: " + compania + "\nColor: " + color;
	}//Fin toString

}//Fin class
