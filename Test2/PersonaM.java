public class PersonaM extends Persona {
	PersonaM() {
		super();
	}
	
	PersonaM(String s) {
		super(s);
	}
	
	public int calcolaM() {
		return Vettore.maxVett(getVettore());
	}
	
	public String toString() {
		return super.toString() + "\nMaxVett = " + calcolaM();
	}
	
	public static void main(String[] args) {
		PersonaM test = new PersonaM("Test");
		System.out.println("Max = " + test.calcolaM() + "\n" + test.toString());
	}
}
