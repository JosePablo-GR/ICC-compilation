import java.util.Random;

public class Menu{

	int menu;
	int precio;
	String platillo;
	String complemento;
	String bebida;
	boolean adicional;

	int auxCremaCafe;
	int auxPancito;
	int auxSandwich;
	int auxQuesadillas;
	String bebidaExtra;

	boolean auxBool = false;
	boolean banderaBoolFruta = false;

	public Menu(){}//Fin constructor x omisión

	public Menu(int menu, int precio, String platillo, String complemento, String bebida, boolean adicional){

		this.menu = menu;
		this.precio = precio;
		this.platillo = platillo;
		this.complemento = complemento;
		this.bebida = bebida;
		this.adicional = adicional;

	}//Fin constructor parámetros

	public String bebidaAdicional(String bebida, String tamanio){

		Random rd = new Random();

		if(bebida.equalsIgnoreCase("café")){

			precio += 15;

			int cremitaAdicional = rd.nextInt(2); //Crema para café
				setCantPanecito(getCantPanecito() + 1);

					if(cremitaAdicional == 0){

						setCantCremaCafe(getCantCremaCafe() + 1);

					} else {

						setCantCremaCafe(0);

					}//Fin if crema café

			if(tamanio.equalsIgnoreCase("ch")){

				precio = precio;

			} else if(tamanio.equalsIgnoreCase("m")){

				precio += 7;

			} else if(tamanio.equalsIgnoreCase("g")){

				precio += 12;

			}

		} else if(bebida.equalsIgnoreCase("té")){

			precio += 10;

			if(tamanio.equalsIgnoreCase("ch")){

				precio = precio;	

			} else if(tamanio.equalsIgnoreCase("m")){

				precio += 1;

			} else if(tamanio.equalsIgnoreCase("g")){

				precio += 2;

			}

		} else if(bebida.equalsIgnoreCase("atole")){

			precio += 20;

			if(tamanio.equalsIgnoreCase("ch")){

				precio = precio;

			} else if(tamanio.equalsIgnoreCase("m")){

				precio += 5;

			} else if(tamanio.equalsIgnoreCase("g")){

				precio += 10;

			}

		}//Fin if café, té o atole

		//String tMayus = tamanio.toUpperCase();
		String orden = "\t      " + bebida + " " + tamanio.toUpperCase();

		return orden;

	}//Fin método bebidaAdicional

	public String comerComer(){

		Random rd = new Random();

		String alimento = "";
		int food = rd.nextInt(3)+1;

		if(food == 1){

			alimento = "Sandwich";

		} else if(food == 3){

			alimento = "Quesadillas";

		}

		return alimento;

	}//Fin método comerComer

	public void queMenu(Persona persona){

		Random rd = new Random();

		boolean personaEspacial = false;

		if((persona.getEdad() >= 5 && persona.getEdad() <= 17)){	//Punto ii

			personaEspacial = true;

			int porcentajes = rd.nextInt(10)+1;

			if(porcentajes >= 1  && porcentajes <= 4){

				setMenu(1);

			} else if(porcentajes >= 5 && porcentajes <= 9){

				setMenu(2);

			} else {

				int desempate = rd.nextInt(2);

				if(desempate == 0){

					setMenu(2);

				} else {

					setMenu(3);

				}//Fin ese 5%

			}//Fin if probabilidad (empieza en 40%)

			int auxBebida = rd.nextInt(10)+1;
			int queOtraBebida = rd.nextInt(3)+1;

			if(auxBebida >= 1 && auxBebida <= 8){

				String bebidaBebible;

				if(queOtraBebida == 1){

					bebidaBebible = "Café";

				} else if(queOtraBebida == 2){

					bebidaBebible = "Té";

				} else {

					bebidaBebible = "Atole";

				}

				String vasitoNuevo = bebidaAdicional(bebidaBebible, "G");	//Punto ii

				setBebidaExtra(vasitoNuevo);

			}//Fin if 80% auxBebida

		}

		if((persona.getTalla().equals("XG"))){	//Punto iv

			personaEspacial = true;

			int tamanioTe = rd.nextInt(3)+1;
			int masSandwich = rd.nextInt(10)+1;
			int masQuesadillas = rd.nextInt(10)+1;

			setMenu(3);
			setAdicional(true);

			String tt = "";

			if(tamanioTe == 1){

				tt = "ch";
				auxBool = true;

			} else if(tamanioTe == 2){

				tt = "m";
				auxBool = true;

			} else {

				tt = "g";
				auxBool = true;

			}

			setBebidaExtra(bebidaAdicional("Té", tt));

			if(masSandwich >= 1 && masSandwich <= 9){

				setCantSandwich(getCantSandwich() + 1);

			}

			if(masQuesadillas >= 1 && masQuesadillas <= 7){

				setCantQuesadillas(getCantQuesadillas() + 1);

			}

		
		}

		boolean auxPEdad = false;

		if(((persona.getEdad() >= 60 && persona.getEdad() <= 99) && persona.getTalla().equalsIgnoreCase("ch"))){

			personaEspacial = true;

			if(persona.getGenero().equals("Hombre")){

				auxPEdad = true;

			}

			int masProbas = rd.nextInt(10)+1;
			int cincoPorciento = rd.nextInt(2);

			if(masProbas >= 1 && masProbas <= 7){

				setMenu(2);

			}//Fin if porcentaje

			if(cincoPorciento == 0){

				setMenu(2);

			}

			int masMasMasProbas = rd.nextInt(10)+1;

			if(masMasMasProbas >= 1 && masMasMasProbas <= 6){

				banderaBoolFruta = true;


			}

		}

		if(personaEspacial == false){

			menu = rd.nextInt(3)+1;

			setMenu(menu);

		}//Fin if diferentes carac, diferentes menús

		//System.out.println("personaEspacial " + personaEspacial);

		int cremitaAdicional;
		boolean cremaAdicional = false; //Para menú 1 y 3
		int ifAdicional = rd.nextInt(2); //Comida adicional;
		int queBebida = rd.nextInt(2);

		if(ifAdicional == 0){

			setAdicional(true);

		} else {

			setAdicional(false);

		}//Fin if adicional

		switch(menu){

			//////////Menú 1//////////
			case 1:

				this.precio = 60;

				String verdesRojos;
				int rojosVerdes = rd.nextInt(2);

				if(rojosVerdes == 0){

					verdesRojos = "verdes";

				} else {

					verdesRojos = "rojos";

				}//Fin if rojos o verdes

				this.platillo = "Chilaquiles " + verdesRojos;

				if(queBebida == 1){

					this.bebida = "Café";

				} else {

					this.bebida = "Jugo";

				}//Fin if bebida

				if(persona.getGenero().equals("Mujer")){	//Punto i

					if(this.bebida.equals("Café")){

					cremitaAdicional = rd.nextInt(10)+1; //Crema para café
					//setCantPanecito(1);

						if(cremitaAdicional <= 7){

							setCantCremaCafe(getCantCremaCafe() + 1);

						} else {

							setCantCremaCafe(0);

						}//Fin if crema café 70%

					}//Fin if mujer pide café
					
				} else { //Hombre

					if(this.bebida.equals("Café")){

					cremitaAdicional = rd.nextInt(2); //Crema para café
					//setCantPanecito(1);

						if(cremitaAdicional == 0){

							setCantCremaCafe(getCantCremaCafe() + 1);

						} else {

							setCantCremaCafe(0);

						}//Fin if crema café

					}//Fin if hombre pide café

				}//Fin if género

				if(getAdicional()){

					precio += 5;

				}//Fin if adicional (comida) == true

				break;

			//////////Menú 2//////////
			case 2:

				this.precio = 45;

				this.platillo = "Molletes";

				if(queBebida == 1){

					this.bebida = "Té";

				} else {

					this.bebida = "Atole";

				}//Fin if bebida

				if(banderaBoolFruta){

					setAdicional(true);

				}

				if(getAdicional()){

					precio += 10;

				}//Fin if adicional (comida) == true

				break;

			//////////Menú 3//////////
			case 3:

				this.precio = 70;

				this.platillo = "Costilla de res";

				if(queBebida == 1){

					this.bebida = "Café";

				} else {

					this.bebida = "Jugo";

				}//Fin if bebida

				if(this.bebida.equals("Café")){

					//setCantPanecito(getCantPanecito() + 1);
					cremitaAdicional = rd.nextInt(2); //Crema para café

						if(cremitaAdicional == 0){

							setCantCremaCafe(getCantCremaCafe() + 1);

						} else {

							setCantCremaCafe(0);

						}//Fin if crema café

					}//Fin if hombre pide café

				if(getAdicional()){

					precio += 15;

				}//Fin if adicional (comida) == true

				if(persona.getTalla().equalsIgnoreCase("g") && (persona.getEdad() >= 30 && persona.getEdad() <= 40)){	 //Punto vi

					int masMasProbas = rd.nextInt(10)+1;

					if(masMasProbas >= 1 && masMasProbas <= 9){

						setCantPanecito(3);
						setCantCremaCafe(getCantCremaCafe() + 2);

					}//Fin if más tres panes dulces y 2 sobres de crema para café

				}

				break;

		}//Fin switch qué menús

			boolean masComida = false;
			int probMasComida = rd.nextInt(8)+1;
			int cantComida = rd.nextInt(3);
			
			if(probMasComida % 2 == 0 && probMasComida != 2){

				masComida = true;

			}//Fin if

			if(masComida){

				String quecaSandwich = comerComer();

				if(quecaSandwich.equals("Sandwich")){

					setCantSandwich(getCantSandwich() + cantComida);

				} else if(quecaSandwich.equals("Quesadillas")){

					setCantQuesadillas(getCantQuesadillas() + cantComida);

				}//Fin if qué y cuánto

			}//Fin if boolean masComida

			if(auxPEdad == true){

				setCantCremaCafe(0);
				setCantPanecito(0);
				setCantSandwich(0);
				setCantSandwich(0);
				setCantQuesadillas(0);

			}

			int algoMas = rd.nextInt(3)+1;
			int tamañito = rd.nextInt(3)+1;

			String algoDeTomar = "";

			if(algoMas == 1){

				algoDeTomar = "Café";

				cremitaAdicional = rd.nextInt(2); //Crema para café
				setCantPanecito(getCantPanecito() + 1);

					if(cremitaAdicional == 0){

						setCantCremaCafe(getCantCremaCafe() + 1);

					} else {

						setCantCremaCafe(0);

					}//Fin if crema café

			} else if(algoMas == 2){

				algoDeTomar = "Té";

			} else if(algoMas == 3){

				algoDeTomar = "Atole";

			}

			String tamanioAdicional = "";

			if(tamañito == 1){

				tamanioAdicional = "Ch";

			} else if(tamañito == 2){

				tamanioAdicional = "M";

			} else if(tamañito == 3){

				tamanioAdicional = "g";

			}

			String nuevoVaso = bebidaAdicional(algoDeTomar, tamanioAdicional);

			setBebidaExtra(nuevoVaso);

			if(auxBool){

				setBebidaExtra(bebidaAdicional("Té", tamanioAdicional));

			}

			if(getCantPanecito() >= 5){

				setCantPanecito(5);

			}

			int cuantoCremaCafe = 3 * getCantCremaCafe();
			int cuantoPan = 17 * getCantPanecito();
			int cuantoSanwich = 33 * getCantSandwich();
			int cuantoQuecas = 20 * getCantQuesadillas();

			precio = precio + cuantoCremaCafe + cuantoPan + cuantoSanwich + cuantoQuecas;

		//System.out.println("getCantCremaCafe " + getCantCremaCafe());
		//System.out.println("cuantoCremaCafe" + cuantoCremaCafe);
		//System.out.println("getCantPanecito " + getCantPanecito());
		//System.out.println("cuantoPan" + cuantoPan);
		//System.out.println("getCantSandwich " + getCantSandwich());
		//System.out.println("cuantoSanwich" + cuantoSanwich);
		//System.out.println("getCantQuesadillas " + getCantQuesadillas());
		//System.out.println("cuantoQuecas" + cuantoQuecas);
		//System.out.println();

	}//Fin método queMenu

	//Setters
	public void setMenu(int menu){

		this.menu = menu;

	}//Fin setMenu

	public void setAdicional(boolean adicional){

		this.adicional = adicional;

	}//Fin setAdicional

	public void setPrecio(int precio){

		this.precio = precio;

	}//Fin setPrecio

	public void setCantCremaCafe(int auxCremaCafe){

		this.auxCremaCafe = auxCremaCafe;

	}//Fin setCantCremaCafe

	public void setCantPanecito(int auxPancito){

		this.auxPancito = auxPancito;

	}//Fin setCantPanecito

	public void setCantSandwich(int auxSandwich){

		this.auxSandwich = auxSandwich;

	}//Fin setCantSandwich

	public void setCantQuesadillas(int auxQuesadillas){

		this.auxQuesadillas = auxQuesadillas;

	}//Fin setCantQuesadillas

	public void setBebidaExtra(String bebidaExtra){

		this.bebidaExtra = bebidaExtra;

	}//Fin setBebidaExtra

	//Getters
	public int getMenu(){

		return menu;

	}//Fin getMenu

	public int getPrecio(){

		return precio;

	}//Fin getPrecio

	public String getPlatillo(){

		return platillo;

	}//Fin getPlatilo

	public String getComplemento(){

		return complemento;

	}//Fin getComplemento

	public String getBebida(){

		return bebida;

	}//Fin getBebida

	public boolean getAdicional(){

		return adicional;

	}//Fin getAdicional

	public int getCantCremaCafe(){

		return auxCremaCafe;

	}//Fin getCantCremaCafe

	public int getCantPanecito(){

		return auxPancito;

	}//Fin getCantPanecito

	public int getCantSandwich(){

		return auxSandwich;

	}//Fin get getCantSandwich

	public int getCantQuesadillas(){

		return auxQuesadillas;

	}//Fin getCantQuesadillas

	public String getBebidaExtra(){

		return bebidaExtra;

	}//Fin getBebidaExtra

}//Fin class
