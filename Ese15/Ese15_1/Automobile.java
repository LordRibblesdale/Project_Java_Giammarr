//
import java.util.Scanner;

public class Automobile {

	public double serbatoio;
	public int marcia;
	public double kmTot = 0;

// Scrivere i metodi setSerbatoio,setMarcia,getSerbatoio,getMarcia
// NON scriviamo metodi set e get per kmTot perch il contachilometri non va modificato con assegnazioni


// Scrivere i metodi
	public boolean consumo(double km, byte marcia) {
	//Questo metodo riduce il livello di carburante in base alla marcia inserita e ai KM da percorrere,
	// Se non c'e' abbastanza carburante per percorrere i km richiesti, non esegue e restituisce false
		if (marcia != 0) {
			if (km == 0 || serbatoio <= 0) {
				return false;
			}
			else {
				switch (marcia) {
					case 1: {
						serbatoio -= 0.5*km;
					}
					case 2: {
						serbatoio -= 0.2*km;
					}
				}

				if (serbatoio <= 0) {
					return false;
				}
				else {
					System.out.println("E' rimasto " + serbatoio);
					return true;
				}
			}
		}
		else return false;

	}

	public void scriviOutput() {
		//Questo metodo scrive sullo schermo il valore del contachilometri e la quantit di carburante nel serbatoio
		System.out.println("Contachilometri: " + kmTot);
		System.out.println("Carburante nel serbatoio: " + serbatoio);
	}
}
