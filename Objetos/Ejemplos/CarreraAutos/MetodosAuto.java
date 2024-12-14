import java.util.Scanner;
import java.util.Random;

public class MetodosAuto {

	boolean encendido;
	String compania;
	String marca;
	String color;
	double gasolinaActual;

	final double capacidadTotal = 50.00; //Litros
	final double gastoGas = 0.3; //Se restará
	final double precioGasolina = 19.8; //$$

	public MetodosAuto(){}//Fin constructor por omisión

	public MetodosAuto (boolean encendido, String compania, String marca, String color, double gasolinaActual) {

		this.encendido = encendido;
		this.compania = compania;
		this.marca = marca;
		this.color = color;
		this.gasolinaActual = gasolinaActual;
		
	}

	public void setEncendido (boolean encendido) {

		this.encendido = encendido;

	}

	public boolean getEncendido () {

		return encendido;

	}

	public void setCompania (String compania) {

		this.compania = compania;

	}

	public String getCompania () {

		return compania;

	}

	public void setMarca (String marca) {

		this.marca = marca;

	}

	public String getMarca () {

		return marca;

	}

	public void setGasolinaActual (double gasolinaActual) {

		this.gasolinaActual = gasolinaActual;

	}

	public double getGasolinaActual () {

		return gasolinaActual;

	}

	public void revisarGas () {

		double restaDoble = capacidadTotal - getGasolinaActual();

		//Litros que faltan para tanque lleno
		int resta = (int) restaDoble;

		double precio = resta * precioGasolina;

		System.out.println("\nPara partipar en la carrera debes tener el tanque lleno tienes " + getGasolinaActual() + " litros.");

		setGasolinaActual(50.00);
		System.out.println("Lo llenamos con " + resta + " litros, y son $" + precio + ".");

	}

	public void avanzar (int kilometros) {

		for (int i = 0; i <= kilometros; i++) {

			System.out.println("\nKilometro " + i);
			System.out.println("Gasolina del auto: " + this.gasolinaActual);

			this.gasolinaActual -= gastoGas;

			if (this.gasolinaActual <= 0) {

				int j = i;
				i = kilometros;

				System.out.println("\nNos quedamos en el kilometro " + j);
				System.out.println("No logramos completar el viaje.\nEl auto se apagará...\n");
				setEncendido(false);

			}

		}

		setGasolinaActual(this.gasolinaActual);

	}

	public void cargarGasolinaDinero (double dinero) {

		Random aleatorios = new Random();
		
		int n = aleatorios.nextInt(5) + 1;
		System.out.println();

		int nuevaGasolina = 0; //Litros
		int precioPagar = 0; //$$

		if (this.gasolinaActual >= 50) {

			System.out.println("El tanque ya está lleno.");

		} else {

			for (int x = 1; x <= n; x++) {

				System.out.println("Cargando gasolina...");

			}

			System.out.println();

			double litrosDobles = dinero / precioGasolina; //Cuántos litros se llenarán

			int litros = (int) Math.ceil(litrosDobles);

			for (int i = 1; i <= litros; i++) {

				if (this.gasolinaActual >= 50) {

					System.out.println("El tanque se ha llenado");

				} else {

					while (dinero > 0) {

						precioPagar += 0.36;

						if (precioPagar % 19.8 == 0) {

							nuevaGasolina++;

						}

					}
					
				}

			}

		}

		double costoFinal = nuevaGasolina*precioGasolina;
		setGasolinaActual(nuevaGasolina + this.gasolinaActual); 

		System.out.println("Se llenaron " + nuevaGasolina + " litros y son $" + costoFinal);
		System.out.println("Gasolina actual: " + getGasolinaActual());

	}

	public void cargarGasolinaLitros (int litros) {

		litros = (int) litros;

		double cuantoSera = litros*precioGasolina; //En $$
		double resta = Math.ceil(capacidadTotal - this.gasolinaActual);

		if (this.gasolinaActual >= 50) {

			System.out.println("\nEl tanque ya está lleno.");

			break;

		}

		if (litros > resta) {

			System.out.println("\nActualmente el tanque tiene " + getGasolinaActual() + " lo máximo que puedes aumentarle son " + resta + " litros.");

		} else {

			//System.out.println("\n¡CEROOS!");
			System.out.println("\nEmpeiza la carga...\n");

			for (int i = 0; i <= litros; i++) {

				setGasolinaActual(this.gasolinaActual);

				System.out.println("Gasolina: " + this.gasolinaActual);

				this.gasolinaActual++;

			}

			if (this.gasolinaActual >= 50.0) {

				setGasolinaActual(50.00);

			}

			System.out.println("\nCargasre " + litros + " litros, son $" + cuantoSera + ".");
			System.out.println("Cantidad final: " + this.gasolinaActual + " litros.");

		}

	}

	public void cargarTodoElTanque () {

		setGasolinaActual(this.gasolinaActual);

		double restaDoble = capacidadTotal - getGasolinaActual();
		int resta = (int) restaDoble;

		if (this.gasolinaActual > 1) {

			//System.out.println("\n¡CEROOS!");
			System.out.println("\nEmpeiza la carga...\n");

			for (int i = 0; i <= resta; i++) {

				setGasolinaActual(this.gasolinaActual);

				if (this.gasolinaActual >= 50.0) {

					setGasolinaActual(50.00);

				}

				System.out.println("Gasolina: " + this.gasolinaActual);

				this.gasolinaActual++;

			}

			setGasolinaActual(50.00);

		}

	}

	public void carreritas (String a1, String a2) {

		Random aleatorios = new Random();

		int vueltasC1 = 0;
		int vueltasC2 = 0;
		boolean hayGanador = false;

		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t   ¡Inicia la carrera!!!\n");

		while (!hayGanador) {

			int confusion = aleatorios.nextInt(4)+1;
			boolean cc1 = false; //Confusión Carro 1
			boolean cc2 = false; //Confusión Carro 2

			if (confusion == 1) {

				cc1 = true;

			} else if(confusion == 4) {

				cc2 = true;

			}

			if (cc1) {

				System.out.println(a1 + " se detiene porque el conductor ha entrado en confusión");

				vueltasC2++;
				System.out.println(a2 + " ha completado " + vueltasC2 + " vueltas");

			}

			if (cc2) {

				vueltasC1++;
				System.out.println(a1 + " ha completado " + vueltasC1 + " vueltas");

				System.out.println(a2 + " se detiene porque el conductor ha entrado en confusión");

			}

			 if ((cc1 == false) && (cc2 == false)) {

				vueltasC1++;
				vueltasC2++;

				System.out.println(a1 + " ha completado " + vueltasC1 + " vueltas");
				System.out.println(a2 + " ha completado " + vueltasC2 + " vueltas");

			}

			for (int i = 0; i <= 77; i++) {

				System.out.print("*");

			}

			if ((vueltasC1 == 10 )|| (vueltasC2 == 10)) {

				hayGanador = true;

			}

		}

		if (vueltasC1 == 10) {

			System.out.println("Y el ganador es...");
			System.out.println(a1 + "!!!!");

		} else if (vueltasC2 == 10) {

			System.out.println("Y el ganador es...");
			System.out.println(a2);

		} else if ((vueltasC1 == 10) && (vueltasC2 == 10)) {

			System.out.println("Empate. Los dos llegamos al mismo tiempo.");

		}

	}

	@Override
	public String toString() {

		return "Marca: " +  marca + "\nCompañía: " + compania + "\nColor: " + color;

	}

}
