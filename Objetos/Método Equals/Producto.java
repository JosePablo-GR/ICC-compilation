public class Producto {

	String nombreProducto;
	String codigoBarras;
	int mesCaducidad;

	public Producto (String nombreProducto, String codigoBarras, int mesCaducidad) {

		this.nombreProducto = nombreProducto;
		this.codigoBarras = codigoBarras;
		this.mesCaducidad = mesCaducidad;

	}

	public boolean equals (Producto p) {

		boolean igual = true;

		igual = igual && ((this.nombreProducto.equals(p.nombreProducto)) ? true : false);
	    igual = igual && ((this.codigoBarras.equals(p.codigoBarras)) ? true : false);
	    igual = igual && ((this.mesCaducidad == p.mesCaducidad) ? true : false);

		return igual;

	}

	@Override
	public String toString () {

		return nombreProducto + "\n" +
				"Código de barras: " + codigoBarras + "\n" +
				"Caduca el mes " + mesCaducidad;

	}

}