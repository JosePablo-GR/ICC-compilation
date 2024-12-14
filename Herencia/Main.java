public class Main {

	public static void main(String[] args) {

		double[] califE1 = {10,8,7,10,9,6};
		double[] califE2 = {10,9,7.5,8,8,10}; 
		
		Persona p1 = new Persona("José Pablo", 22);
		Estudiante e1 = new Estudiante("Cel bb", 21, "319288563", califE1);
		Ayudante a1 = new Ayudante("Juanito", 27, "339306569", califE2, 3, "HotDog: ¿Más cerca del sandwich o del taco?");
		Profesor profesor = new Profesor("Julio Prado", 52, a1, "Inteligencia Artificial");

		System.out.println("Presentación:");
		System.out.println(e1 + "\n");
		System.out.println(p1 + "\n");
		System.out.println(a1 + "\n");
		System.out.println(profesor + "\n");

		System.out.println("Saludos:");

		System.out.print(p1.nombre + " dice: ");
		p1.saludar();

		System.out.print(e1.nombre + " dice: ");
		e1.saludar();
		e1.saludar("Bases de Datos");

		System.out.print(a1.nombre + " dice: ");
		a1.saludar();

		System.out.print(profesor.getNombre() + " dice: ");
		profesor.saludar();
		profesor.saludar(11);

		System.out.println();

		System.out.println("Las calificaciones de " + e1.getNombre() + " son:" );
		e1.mostrarCalificaciones();

		System.out.println("A continuación " + a1.getNombre() +  " calificará...");
		a1.verCalificaciones(e1);

		System.out.println("\nEl profesor está evaluando...");
		profesor.asignarCalificacion(e1);

		System.out.println("Ahora las calificaciones de " + e1.getNombre() + " son:" );
		e1.mostrarCalificaciones();

	}

}