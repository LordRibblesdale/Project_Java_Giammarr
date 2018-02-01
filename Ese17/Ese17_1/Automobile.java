//
import java.util.Random;

public class Automobile {

	private double serbatoio;
	private int marcia;
	public double kmTot;

	public Automobile(double newSerbatoio, int newMarcia) {
		set(newSerbatoio, newMarcia);
	}

	public Automobile(double newSerbatoio) {
		setSerbatoio(newSerbatoio);
	}

	public Automobile(int newMarcia) {
		setMarcia(newMarcia);
	}

	public void set(double newSerbatoio, int newMarcia) {
		serbatoio = newSerbatoio;
		marcia = newMarcia;
	}

	public void setSerbatoio(double input) {
			serbatoio = input;
	}
	public void setMarcia(int input) {
			marcia = input;
	}

	public double getSerbatoio() {
		return serbatoio;
	}
	public int getMarcia() {
		return marcia;
	}

	public boolean equals(Automobile newClass) {
		if((this.getSerbatoio() == newClass.getSerbatoio()) && (this.kmTot == newClass.kmTot)) {
			return true;
		}
		else return false;
	}

	public boolean consumo(double km) {
		if (marcia != 0) {
			if (km == 0 || serbatoio <= 0) {
				return false;
			}
			else {
				switch (marcia) {
					case 1: {
						serbatoio -= 0.2*km;
					}
					case 2: {
						serbatoio -= 0.5*km;
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

	public double time(Automobile newClass, Automobile newClass2) {
		double a = 0, first = 0, second = 0;
		int b = 0;

		for (int i = 0; i < 10; i++) {
			a = Math.random();
			b = (int)Math.floor(a*2)+1;

			switch (b) {
				case 1: {
					first += (10/3.6);

					break;
				}
				case 2: {
					first += (40/3.6);
					break;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			a = Math.random();
			b = (int)Math.floor(a*2)+1;

			switch (b) {
				case 1: {
					second += (10/3.6)
				}
			}
		}
	}
}
