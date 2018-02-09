public class PersonaB extends Persona {
	PersonaB() {
		super();
	}
	
	PersonaB(String nomeIn) {
		super(nomeIn);
	}
	
	public int calcolaB() {
		int tmp = 0;
		for (int i = 0; i < getVettore().length; i++) {
			if (getVettore()[i] == getVettore()[(getVettore().length-1)-i]) {
				tmp++;
			}
			else return tmp;
		}
		return tmp;
	}
	
	public String toString() {
		return super.toString() + "\nCalcolaB: " + calcolaB();
	}
	
	public static void main(String[] args) {
		PersonaB a = new PersonaB("Test");
		System.out.println(a.toString() + "\nCalcolaB " + a.calcolaB());
	}
}
