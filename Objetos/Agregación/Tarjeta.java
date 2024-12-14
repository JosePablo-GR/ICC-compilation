public class Tarjeta {

	String numeroTarjeta;
	String fechaCadudidad;
	String titular;
	String emisor;
	int cvv;

		public Tarjeta() {

			numeroTarjeta = "";
			fechaCadudidad = "";
			titular = "";
			emisor = "";
			cvv = 0;
		}

		public Tarjeta(String numeroTarjeta, String fechaCadudidad, String titular, String emisor, int cvv) {

			this.numeroTarjeta = numeroTarjeta;
			this.fechaCadudidad = fechaCadudidad;
			this.titular = titular;
			this.emisor = emisor;
			this.cvv = cvv;

		}

		public Tarjeta(Tarjeta tarjeta) {

			numeroTarjeta = tarjeta.obtenerNumeroTarjeta();
			fechaCadudidad = tarjeta.obtenerFechaCaducidad();
			titular = tarjeta.obtenerTitular();
			emisor = tarjeta.obtenerEmisor();
			cvv = tarjeta.obtenerCvv();

		}

		public void asignarNumeroTarjeta(String numeroTarjeta) {

			this.numeroTarjeta = numeroTarjeta;

		}

		public String obtenerNumeroTarjeta() {

			return numeroTarjeta;

		}

		public void asignarFechaCaducidad(String fechaCadudidad) {

			this.fechaCadudidad = fechaCadudidad;

		}

		public String obtenerFechaCaducidad() {

			return fechaCadudidad;

		}

		public void asignarTitular(String titular) {

			this.titular = titular;

		}

		public String obtenerTitular() {

			return titular;

		}

		public void asignarEmisor(String emisor) {

			this.emisor = emisor;

		}

		public String obtenerEmisor() {

			return emisor;

		}

		public void asignarCvv(int cvv) {

			this.cvv = cvv;

		}

		public int obtenerCvv() {

			return cvv;

		}

		public String toString() {

			return "Número tarjeta: " + numeroTarjeta + "Fecha Caducidad: " + fechaCadudidad + "Titular: " + titular +
			"Emisor: " +  emisor + "CVV: " + cvv;

		}

}