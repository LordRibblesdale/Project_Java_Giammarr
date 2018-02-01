public class PersonaB extends Persona {
	PersonaB() {
		super();
	}
	
	PersonaB(String s) {
		super(s);
	}
	
	public int calcolaB() {
		return Vettore.barVett(getVettore());
	}
	
	public String toString() {
		return super.toString() + "\nBarVett = " + calcolaB();
	}
	
	public static void main(String[] args) {
		PersonaB test = new PersonaB("Test");
		System.out.println(test.toString());
	}
	
}
