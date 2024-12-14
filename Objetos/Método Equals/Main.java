public class Main {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto("Chocolate","1234",12);
		Producto producto2 = new Producto("Chocolate","1234",12);
		Producto producto3 = new Producto("Cereal","1334",1);

		System.out.println("producto1:");
		System.out.println(producto1 + "\n");

		System.out.println("producto2:");
		System.out.println(producto2 + "\n");

		System.out.println("producto3:");
		System.out.println(producto3 + "\n");

		System.out.println("¿producto1 es igual a producto2? " + producto1.equals(producto2));
		System.out.println("¿producto2 es igual a producto3? " + producto2.equals(producto3));

		System.out.println();

		Automovil auto1 = new Automovil("Audi","822ABC",2013,'0');
		Automovil auto2 = new Automovil("Audi","822ABC",2013,'0');
		Automovil auto3 = new Automovil("Honda","THX007",2019,'2');

		System.out.println("auto1:");
		System.out.println(auto1 + "\n");

		System.out.println("auto2:");
		System.out.println(auto2 + "\n");

		System.out.println("auto3:");
		System.out.println(auto3 + "\n");

		System.out.println("¿auto1 es igual a auto2? " + auto1.equals(auto2));
		System.out.println("¿auto2 es igual a auto3? " + auto2.equals(auto3));

	}

}