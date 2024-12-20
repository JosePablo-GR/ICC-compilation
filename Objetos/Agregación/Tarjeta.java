public class Tarjeta {

	String numeroTarjeta;
	String fechaCaducidad;
	String titular;
	String banco;
	int cvv;

	public Tarjeta () {

		numeroTarjeta = "0000 0000 0000 0000";
		fechaCaducidad = "00/00";
		titular = "- - - - - - -";
		banco = "Banco de México";
		cvv = 0;

	}

	public Tarjeta (String numeroTarjeta, String fechaCaducidad, String titular, String banco, int cvv) {

		this.numeroTarjeta = numeroTarjeta;
		this.fechaCaducidad = fechaCaducidad;
		this.titular = titular;
		this.banco = banco;
		this.cvv = cvv;

	}

	public Tarjeta (Tarjeta tarjeta) {

		numeroTarjeta = tarjeta.getNumeroTarjeta();
		fechaCaducidad = tarjeta.getFechaCaducidad();
		titular = tarjeta.getTitular();
		banco = tarjeta.getBanco();
		cvv = tarjeta.getCvv();

	}

	public void setNumeroTarjeta (String numeroTarjeta) {

		this.numeroTarjeta = numeroTarjeta;

	}

	public String getNumeroTarjeta () {

		return numeroTarjeta;

	}

	public void setFechaCaducidad (String fechaCaducidad) {

		this.fechaCaducidad = fechaCaducidad;

	}

	public String getFechaCaducidad () {

		return fechaCaducidad;

	}

	public void setTitular (String titular) {

		this.titular = titular;

	}

	public String getTitular () {

		return titular;

	}

	public void setBanco (String banco) {

		this.banco = banco;

	}

	public String getBanco() {

		return banco;

	}

	public void setCvv(int cvv) {

		this.cvv = cvv;

	}

	public int getCvv() {

		return cvv;

	}

	public boolean equals (Tarjeta t) {

		boolean igual = true;

		igual = igual && (this.numeroTarjeta.equals(t.numeroTarjeta)) ? true : false;
		igual = igual && (this.fechaCaducidad.equals(t.fechaCaducidad)) ? true : false;
		igual = igual && (this.titular.equals(t.titular)) ? true : false;
		igual = igual && (this.banco.equals(t.banco)) ? true : false;
		igual = igual && (this.cvv == t.cvv) ? true : false;

		return igual;

	}

	@Override
	public String toString() {

		return "\nNúmero tarjeta: " + numeroTarjeta + "\n" + 
				"Fecha Caducidad: " + fechaCaducidad + "\n" +
				"Titular: " + titular + "\n" +
				"Banco: " +  banco + "\n" +
				"CVV: " + cvv;

	}

}