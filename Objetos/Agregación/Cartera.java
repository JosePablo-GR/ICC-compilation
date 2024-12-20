public class Cartera {

	String material;
	int apartados;
	private Billete b1,b2,b3,b4;
	private Tarjeta t1,t2,t3;

	public Cartera () {

		material = "Material Genérico";
		apartados = 0;

		b1 = b2 = b3 = b4 = null;
		t1 = t2 = t3 = null;

	}

	public Cartera (String material, int apartados, Billete b1, Tarjeta t1) {

		this.material = material;
		this.apartados = apartados;
		this.b1 = b1;
		this.t1 = t1;

		b2 = b3 = b4 = null;
		t2 = t3 = null;

	}

	public Cartera (String material, int apartados, Billete b1, Billete b2, Tarjeta t1, Tarjeta t2) {

		this.b1 = b1;
		this.b2 = b2;
		this.t1 = t1;
		this.t2 = t2;
		this.material = material;
		this.apartados = apartados;

		b3 = b4 = null;
		t3 = null;

	}

	public Cartera (Cartera cartera) {

		b1 = cartera.getB1();
		b2 = cartera.getB2();
		b3 = cartera.getB3();
		t1 = cartera.getT1();
		t2 = cartera.getT2();
		t3 = cartera.getT3();
		material = cartera.getMaterial();
		apartados = cartera.getApartados();

	}

	public void setB1 (Billete b1) {

		this.b1 = b1;

	}

	public Billete getB1 () {

		return b1;

	}

	public void setB2 (Billete b2) {

		this.b2 = b2;

	}

	public Billete getB2 (){

		return b2;

	}

	public void setB3 (Billete b3) {

		this.b3 = b3;

	}

	public Billete getB3 () {

		return b3;

	}

	public void setT1 (Tarjeta t1) {

		this.t1 = t1;

	}

	public Tarjeta getT1 () {

		return t1;

	}

	public void setT2 (Tarjeta t2) {

		this.t2 = t2;

	}

	public Tarjeta getT2 () {

		return t2;

	}

	public void setT3 (Tarjeta t3) {

		this.t3 = t3;

	}

	public Tarjeta getT3 () {

		return t3;

	}

	public void setMaterial (String material) {

		this.material = material;

	}

	public String getMaterial() {

		return material;

	}

	public void setApartados (int apartados) {

		this.apartados = apartados;

	}

	public int getApartados () {

		return apartados;

	}

	public boolean equals (Cartera c) {

		boolean igual = true;

		igual = igual && (this.material.equals(c.material)) ? true : false;
		igual = igual && (this.apartados == c.apartados) ? true : false;

		igual = igual && (this.b1.equals(c.b1)) ? true : false;
		igual = igual && (this.b2.equals(c.b2)) ? true : false;
		igual = igual && (this.b3.equals(c.b3)) ? true : false;
		igual = igual && (this.b4.equals(c.b4)) ? true : false;

		igual = igual && (this.t1.equals(c.t1)) ? true : false;
		igual = igual && (this.t2.equals(c.t2)) ? true : false;
		igual = igual && (this.t3.equals(c.t3)) ? true : false;

		return igual;

	}

	@Override
	public String toString () {

		int contadorB = 0;

		if (this.b1 != null) {

			contadorB++;

		} else if (this.b2 != null) {

			contadorB++;

		} else if (this.b3 != null) {

			contadorB++;

		} else if (this.b4 != null) {

			contadorB++;
			
		}

		int contadorT = 0;

		if (this.t1 != null) {

			contadorT++;

		} else if (this.t2 != null) {

			contadorT++;

		} else if (this.t3 != null) {

			contadorT++;

		}

		int i = 0;
		Billete[] billetes = new Billete[contadorB];

		if (this.b1 != null) {

			billetes[i] = this.b1;
			i++;

		}

		if (this.b2 != null) {

			billetes[i] = this.b2;
			i++;

		}

		if (this.b3 != null) {

			billetes[i] = this.b3;
			i++;

		}

		if (this.b4 != null) {

			billetes[i] = this.b4;
			i++;
				
		}

		int indice2 = 0;
		Tarjeta[] tarjetas = new Tarjeta[contadorT];

		if (this.t1 != null) {

			tarjetas[indice2] = this.t1;
			indice2++;

		}

		if (this.t2 != null) {

			tarjetas[indice2] = this.t2;
			indice2++;

		}

		if (this.t3 != null) {

			tarjetas[indice2] = this.t3;
			indice2++;

		}

		String cadena = "Cartera de " + material + " con " + apartados + " apartados.";

		if ((contadorB != 0) || (contadorT != 0)) {

			cadena += "\nContine:";

		}

		for (Billete b : billetes) {

			cadena += b;

		 }

		 for (Tarjeta t : tarjetas) {

		 	cadena += t;
		 	
		 }

		return cadena;

	}

}