public abstract class Mascota implements Animal {

	String nombre;
	String especie;
	int edad;
	boolean domestico;

	@Override
	public void hacerSonido () {

		System.out.println("Quiero a mi dueño.");

	}

	@Override
	public void comer () {

		System.out.println("Como comida de sobre.");

	}

	@Override
	public String cazar () {

		return "Cazo los juguetes que me tiran";

	}

	public int jugar () {

		int n = 5;

		System.out.println("Hoy he jugado " + n + " veces.");

		return n;

	}

	public void pasear (boolean salimos) {

		System.out.print("Soy un " + especie + " y hoy");

		if (salimos) {

			System.out.println(" salí a pasear porque me consienten.");

		} else {

			System.out.println(" no salí a pasear, estoy triste..");

		}

	}
 
}