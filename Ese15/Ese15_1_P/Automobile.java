//
import java.util.Scanner;

public class Automobile {

	private double serbatoio = 0;
	private int marcia = 0;
	public double kmTot = 0;

// Scrivere i metodi setSerbatoio,setMarcia,getSerbatoio,getMarcia
// NON scriviamo metodi set e get per kmTot perch il contachilometri non va modificato con assegnazioni
	public double getSerbatoio() {
		return serbatoio;
	}
	public int getMarcia() {
		return marcia;
	}

	public void setSerbatoio(double input) {
		if (input > 0) {
			serbatoio = input;
		}
	}
	public void setMarcia(int input) {
		if (input > 0) {
			marcia = input;
		}
	}

// Scrivere i metodi
	public boolean consumo(double km) {
	//Questo metodo riduce il livello di carburante in base alla marcia inserita e ai KM da percorrere,
	// Se non c'e' abbastanza carburante per percorrere i km richiesti, non esegue e restituisce false


		if (getMarcia() != 0) {
			if (km == 0 || getSerbatoio() <= 0) {
				return false;
			}
			else {
				switch (getMarcia()) {
					case 1: {
						setSerbatoio(getSerbatoio()-0.2*km);
					}
					case 2: {
						setSerbatoio(getSerbatoio()-0.5*km);
					}
				}

				if (getSerbatoio() <= 0) {
					return false;
				}
				else {
					System.out.println("E' rimasto " + getSerbatoio());
					return true;
				}
			}
		}
		else return false;
	}
}
