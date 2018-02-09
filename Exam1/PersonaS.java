public class PersonaS extends Persona {
	PersonaS() {
		super();
	}
	
	PersonaS(String nomeIn) {
		super(nomeIn);
	}
	
	public int calcolaS() {
		int tmp1 = 0, tmp2 = 0;
		for (int i = 0; i < getVettore().length; i++) {
			tmp1 = 0;
			for (int j = i+1; j < getVettore().length; j++) {
				if (getVettore()[i] == getVettore()[j]) {
					tmp1++;
					if (tmp1 > tmp2) {
						tmp2 = tmp1;
					}
				}
				else {
					tmp1 = 0;
					break;
				}
			}
		}
		return tmp2+1;
	}
	
	public String toString() {
		return super.toString() + "\nCalcolaS: " + calcolaS();
	}
	
	public static void main(String[] args) {
		PersonaS a = new PersonaS("Test");
		System.out.println(a.toString() + "\nCalcolaS " + a.calcolaS());
	}
}
