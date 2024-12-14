public class Main {

	public static void main(String[] args) {
		
		Perro dog = new Perro("Firulais", "beagle", 2);
		Gato cat = new  Gato("Wiskas", 3);

		System.out.println(cat);
		System.out.println(dog);

		System.out.print("Como " + cat.especie + " le hago: ");
		cat.hacerSonido();

		System.out.print("Como " + dog.especie + " le hago: ");
		dog.hacerSonido();

		System.out.println();

		String cazaPerro = dog.cazar();
		String cazaGato = cat.cazar();

		System.out.println(dog.especie + ": " + cazaPerro + ".");
		System.out.println(cat.especie + ": " + cazaGato);

		System.out.println();

		dog.jugar();
		cat.jugar();

		System.out.println();

		dog.pasear(true);
		cat.pasear(false);

		//Perro dog2 = new Perro("Firulais", "beagle", 1);
		//Perro dog3 = new Perro("Firulais", "beagle", 2);

		//System.out.println(dog2);
		//System.out.println(dog3);

		System.out.println("¿" + dog.nombre + " es igual a " + cat.nombre + "? " + cat.equals(dog));
		//System.out.println("¿" + dog.nombre + " es igual a " + dog.nombre + "? " + dog2.equals(dog));
		//System.out.println("¿" + dog3.nombre + " es igual a " + dog.nombre + "? " + dog3.equals(dog));

	}

}