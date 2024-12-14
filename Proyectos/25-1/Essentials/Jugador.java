package Essentials;
import java.io.*;

/**
 * La clase jugador.
 * @author José Pablo Granados Rovira.
 * @author Leonardo Rodrigo Tintos Fabela.
 * @version 1.2
 */

public class Jugador implements Serializable {

	String nombre;
	int creditos;
	int puntaje;

	/**
     * Constructor que inicializa un jugador con nombre, créditos y puntaje.
     * @param nombre Nombre del jugador.
     * @param creditos Creditos del jugador.
     * @param puntaje Puntaje del jugador.
     */
	public Jugador (String nombre, int creditos, int puntaje) {

		this.nombre = nombre;
		this.creditos = creditos;
		this.puntaje = puntaje;

	}

	/**
     * Método que guarda un arreglo de jugadores en un archivo.
     * @param archivo Nombre del archivo donde se guardarán los jugadores.
     * @param jugadores Arreglo de jugadores para guardar.
     */

	 public static void guardarJugadores (String archivo, Jugador[] jugadores) {

        try (FileOutputStream fos = new FileOutputStream(archivo);
        	ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(jugadores);

        } catch (IOException e) {

            System.out.println("Error al guardar jugadores: " + e.getMessage());

        }

    }

    /**
     * Método que carga un arreglo de jugadores desde un archivo.
     * @param archivo El nombre del archivo del cual vienen jugadores.
     * @return Un arreglo de jugadores del el archivo.
     */

	public static Jugador[] almacenamientoJugadores (String archivo) {

        try (FileInputStream fis = new FileInputStream(archivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return (Jugador[]) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println(e.getMessage());

            return new Jugador[10];
        }

    }

	/**
     * Actualiza los datos de un jugador en el archivo "ListaJugadores.txt".
     * @param jugador Jugador con los datos actualizados.
     */

    public static void actualizarArchivo (Jugador jugador) {

        File archivo = new File("ListaJugadores.txt");

        if (archivo.exists()) {

        	Jugador[] jugadores = almacenamientoJugadores("ListaJugadores.txt");

	        for (int i = 0; i < jugadores.length; i++) {

	            if ((jugadores[i] != null) && (jugadores[i].obtenerNombre().equals(jugador.obtenerNombre()))) {

	                jugadores[i] = jugador;
	                break;

	            }
	            
	        }

        	guardarJugadores("ListaJugadores.txt", jugadores);

        } else {

        	//El archivo no existe
        	System.out.println("Error al actualizar los datos.");

        }

    }

	/**
     * Método que cuenta jugadores de un arreglo.
     * @param jugadores Arreglo de jugadores.
     * @return Número de jugadores.
     */

    public static int contarJugadores (Jugador[] jugadores) {
        
        int cont = 0;

        for (Jugador jugador : jugadores) {

            if (jugador != null) {

                cont++;

            }

        }

        return cont;

    }

	 /**
     * Método que duplica el tamaño de un arreglo de jugadores. 
     * @param jugadores Arreglo de jugadores a duplicar.
     * @return Nuevo arreglo de jugadores.
     */

     public static Jugador[] expandirArreglo (Jugador[] jugadores) {

        int dobleLongitud = jugadores.length * 2;

        Jugador[] nuevoArreglo = new Jugador[dobleLongitud];

        for (int i = 0; i < jugadores.length; i++) {

        	nuevoArreglo[i] = jugadores[i];

        }

        return nuevoArreglo;

    }

	/**
     * Método para asignar un nuevo nombre al jugador.
     * @param nombre Nuevo nombre del jugador.
     */

	public void asignarNombre (String nombre) {

		this.nombre = nombre;

	}

	/**
     * Método para asignar creditos.
     * @param nombre Número de creditos.
     */

	public void asignarCreditos (int creditos) {

		this.creditos = creditos;

	}

	/**
     * Método para asignar puntaje.
     * @param nombre Puntaje a asignar.
     */

	public void asignarPuntaje (int puntaje) {

		this.puntaje = puntaje;

	}

	/**
     * Método para obtener el nombre del jugador.
     * @param nombre Nombre del jugador.
     */

	public String obtenerNombre () {

		return nombre;

	}

	/**
     * Método para obtener los creditos del jugador.
     * @param nombre Número de creditos jugador.
     */

	public int obtenerCreditos () {

		return creditos;

	}

	/**
     * Método para obtener el puntaje del jugador.
     * @param nombre Puntaje del jugador.
     */

	public int obtenerPuntaje () {

		return puntaje;

	}

	
	 /**
     * Método toString.
     * @return Cadena con el nombre, puntaje y créditos del jugador.
     */	

	@Override
	public String toString () {

		return "Nombre: " + nombre + " | Puntaje: " + puntaje + " | Créditos: " + creditos;

	}

}