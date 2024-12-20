/**
 * @author José Pablo Granados Rovira
 * @version 1.0
 */ 
public class PruebaArticulos {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro ("Cien años de soledad", "Gabriel García Márquez", "Fondo de Cultura Económica", "1967");
		Libro libro2 =  new Libro ("1984", "George Orwell", "Gandhi", "1949");

		Disco disco1 = new Disco ("Clancy", "Alternativo", "twenty one pilots", 13, "Inglés", "2024");
		Disco disco2 = new Disco ("INSIDE OUT MVMT", "Rock Alternativo", "Adé", 12, "Francés", "2024");

		Pelicula pelicula1 = new Pelicula ("Ratatouille", "Brad Bird", "Animación","1:51","2007","Inglés");
		Pelicula pelicula2 = new Pelicula ("Coco","Lee Unkrich", "Animación","1:45", "2017", "Español");

		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(disco1);
		System.out.println(disco2);
		System.out.println(pelicula1);
		System.out.println(pelicula2);

	}

}