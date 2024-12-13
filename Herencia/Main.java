public class Main {

	public static void main(String[] args) {

		int[] califE1 = {10,8,7,10,9,6};
		
		Persona p1 = new Persona("José Pablo", 22);
		Estudiante e1 = new Estudiante("Cel bb", 21, "319306563", califE1);

		//System.out.println(e1);
		//System.out.println(p1);

		e1.saludar();
		System.out.println("Las califiaciones de " + e1.getNombre() + " son:" );
		e1.mostrarCalificaciones();

	}

}