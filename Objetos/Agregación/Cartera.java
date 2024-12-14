public class Cartera {

	private Billete b1,b2,b3,b4;
	private Tarjeta t1,t2,t3;
	String material;
	int apartados;

	public Cartera() {

		b1 = null;
		b2 = null;
		b3  = null;
		b4 = null;
		t1 = null;
		t2 = null;
		t3 = null;
		material = "";
		apartados = 0;

	}

	public Cartera(Billete b1, Billete b2, Billete b3, Billete b4, Tarjeta t1, Tarjeta t2, Tarjeta t3, String material, int apartados) {

		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.material = material;
		this.apartados = apartados;

	}

	public Cartera(Cartera cartera) {

		b1 = cartera.obtenerB1();
		b2 = cartera.obtenerB2();
		b3 = cartera.obtenerB3();
		t1 = cartera.obtenerT1();
		t2 = cartera.obtenerT2();
		t3 = cartera.obtenerT3();
		material = cartera.obtenerMaterial();
		apartados = cartera.obtenerApartados();

	}

	public void asignarB1(Billete b1) {

		this.b1 = b1;

	}

	public Billete obtenerB1() {

		return b1;

	}

	public void asignarB2(Billete b2) {

		this.b2 = b2;

	}

	public Billete obtenerB2(){

		return b2;

	}

	public void asignarB3(Billete b3) {

		this.b3 = b3;

	}

	public Billete obtenerB3() {

		return b3;

	}

	public void asignarT1(Tarjeta t1) {

		this.t1 = t1;

	}

	public Tarjeta obtenerT1() {

		return t1;

	}

	public void asignarT2(Tarjeta t2) {

		this.t2 = t2;

	}

	public Tarjeta obtenerT2() {

		return t2;

	}

	public void asignarT3(Tarjeta t3) {

		this.t3 = t3;

	}

	public Tarjeta obtenerT3() {

		return t3;

	}

	public void asignarMaterial(String material) {

		this.material = material;

	}

	public String obtenerMaterial() {

		return material;

	}

	public void asignarApartados(int apartados) {

		this.apartados = apartados;

	}

	public int obtenerApartados() {

		return apartados;

	}

	public String toString() {

		return "Cartera de " + material + " con " + apartados + " apartados, y billetes: " + b1;

	}

}