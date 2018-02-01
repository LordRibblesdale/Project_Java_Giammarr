public class Ese2 {
	public static Persona sfida(PersonaB b, PersonaM m) {
		if (b.calcolaB() > m.calcolaM()) {
			return b;
		}
		else if (b.calcolaB() < m.calcolaM()) {
			return m;
		}
		else return null;
	}
	
	public static void proclamaVincitore(Persona p) {
		if (p instanceof PersonaB) {
			System.out.println("Il vincitore è la persona B: " +  p.getNome());
		}
		else if (p instanceof PersonaM) {
			System.out.println("Il vincitore è la persona M: " + p.getNome());
		}
		else {
			System.out.println("C'e' pareggio!");
		}
	}
	
	public static void main(String[] args) {
		PersonaB bPerson = new PersonaB("PersonaB");
		PersonaM mPerson = new PersonaM("PersonaM");
		
		System.out.println(bPerson.toString() + "\n" + mPerson.toString());
		proclamaVincitore(sfida(bPerson, mPerson)); 
	}
}
