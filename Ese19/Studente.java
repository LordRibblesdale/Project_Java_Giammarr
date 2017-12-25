public class Studente extends Persona {
  private String matricola;
  private Esame[] examList;
  private static int numStud = 0;

  public Studente(String nameIn, int year, int no_Exams, int ) {
    super(nameIn, year);
    examList = new Esame[no_Exams];

    for (int i = 0; i < no_Exams; i++) {
      examList[i] = new Esame(nameIn, year);
    }

    numStud++;
    matricola = Integer.toString(22222+numStud);
  }

  public String getMatricola() {
    return matricola;
  }

  public void setMatricola(int matricolaIn) {
    matricola = Integer.toString(matricolaIn);
  }
  //examList[n] come Esame class
  public String toString() {
    return super.toString() + "Matricola: " + getMatricola() + "\nVoti esami: " + examList[i].toString();
  }

  public static void main(String[] args) {
    int i = 3;
    Studente[] student = new Studente[i];

    for ()
  }
}
