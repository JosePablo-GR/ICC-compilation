public class Main {

	public static void main(String[] args) {
		
		Tarjeta tarjeta1 = new Tarjeta("1234 5678 9123 4567", "01/02","Juanito Pérez", "Javamex", 123);
		Tarjeta tarjeta2 = new Tarjeta("1234 5678 9123 4567", "01/02","Juanito Pérez", "Javamex", 123);
		Tarjeta tarjeta3 = new Tarjeta("1234 5678 9123 4567", "01/02","Juanito Pérez", "Javamex", 123);
		Billete billete1 = new Billete(10, "Mi dibujo favorito", "1 2 3");
		Billete billete2 = new Billete();

		//System.out.println(tarjeta1);
		//System.out.println();
		//System.out.println(billete1);

		//Cartera cartera1 = new Cartera("Piel", 3, billete1, tarjeta1);
		Cartera cartera2 = new Cartera("Mezclilla", 2, billete1, billete2, tarjeta1, tarjeta2);

		System.out.println(cartera2);

	}

}