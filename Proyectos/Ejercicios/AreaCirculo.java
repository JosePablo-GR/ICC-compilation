import java.util.Scanner;

public class AreaCirculo {

	public static void main(String []args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Este programa permite calcular el área y volumen de un círculo");

		System.out.println("Ingrese el valor del radio (r): ");
		double r = in.nextDouble();

		double area = 4 * Math.PI * r * r;
		double volumen = (4 / 3) * Math.PI * r * r;


		if (r < 1) {

			System.out.println("\nNo se puede calcular con ese valor");

		} else {

			System.out.println("\nEl área del un círculo con radio " + r + "cm es: " + area +" cm2");
			System.out.println("y su volumen es: " + volumen + " cm3");

		}

	}

}
