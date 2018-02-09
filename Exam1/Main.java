public class Main {
	public static Persona sfida (PersonaB b, PersonaS s) {
		if (b.calcolaB() > s.calcolaS()) {
			return b;
		}
		else if (b.calcolaB() < s.calcolaS()) {
			return s;
		}
		else return null;
	}
	
	public static void proclamaVincitore(Persona g) {
		if (g instanceof PersonaB) {
			System.out.println("Il vincitore è la persona B: " +  g.getNome());
		}
		else if (g instanceof PersonaS) {
			System.out.println("Il vincitore è la persona S: " + g.getNome());
		}
		else {
			System.out.println("C'e' pareggio!");
		}
	}
	
	public static void main(String[] args) {
		int tmp = 0, bWin = 0, sWin = 0;
		
		PersonaB bPerson = new PersonaB("PersonaB");
		PersonaS sPerson = new PersonaS("PersonaS");
		
		System.out.println(bPerson.toString() + "\n" + sPerson.toString());
		proclamaVincitore(sfida(bPerson, sPerson)); 
		
		if (sfida(bPerson, sPerson) instanceof PersonaB) {
			tmp = bPerson.calcolaB();
		}
		else if (sfida(bPerson, sPerson) instanceof PersonaS) {
			tmp = sPerson.calcolaS();
		}
		else {
			System.out.print(". Nessuna coppa verra' stampata.");
		}
		
		System.out.println();
		
		if (tmp != 0) {
			for (int i = 0, tmp2 = tmp-i; i < tmp; i++, tmp2-=2) {
				//tmp2 = (tmp-i);
				for (int j = 0; j < tmp2; j++) {
					System.out.print("*");
					if (j == tmp2-1) {
						System.out.println();
						if ((tmp2 != 1 && tmp % 2 !=0) || (tmp2 != 2 && tmp % 2 == 0)) {
							for (int h = -1; h < i; h++) {
								System.out.print(" ");
							}
						}
					}
				}
			}
			for (int i = 0; i < tmp; i++) {
				System.out.print("*");
			}
		}
		
		System.out.println("\n\nNuova gara da 10 turni!\n");
		
		for (int i = 0; i < 10; i++) {
			bPerson = new PersonaB("PersonaB");
			sPerson = new PersonaS("PersonaS");
			
			if (sfida(bPerson, sPerson) instanceof PersonaB) {
				System.out.println("B: " + bPerson.calcolaB() + " S: " + sPerson.calcolaS());
				//System.out.println("B: \n" + bPerson.toString() + "\nS: \n" + sPerson.toString());
				bWin++;
			}
			else if (sfida(bPerson, sPerson) instanceof PersonaS) {
				System.out.println("B: " + bPerson.calcolaB() + " S: " + sPerson.calcolaS());
				//System.out.println("B: \n" + bPerson.toString() + "\nS: \n" + sPerson.toString());
				sWin++;
			}
		}
		
		if (bWin > sWin) {
			System.out.println("Vincitore B con " + bWin + " vittorie, contro " + sWin + " vittorie. Pareggi: " + (10-(bWin+sWin)));
		}
		else if (sWin > bWin) {
			System.out.println("Vincitore S con " + sWin + " vittorie, contro " + bWin + " vittorie. Pareggi: " + (10-(sWin+bWin)));
		}
		else {
			System.out.println("Pareggio! bWin=" + bWin + " sWin=" +sWin + "Pareggi: " + (10-(bWin+sWin)));
		}
	}
}
