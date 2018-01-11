public class Studente extends Persona {
  private String matricola, toString;
  private Esame[] examList;
  private double avg;
  private static int numStud = 0;

  public Studente() {
    matricola = "NaN";
    toString = super.toString();
    avg = 0;
  }

  public Studente(String nameIn, int year, int no_Exams) {
    super(nameIn, year);
    examList = new Esame[no_Exams];

    for (int i = 0; i < no_Exams; i++) {
      examList[i] = new Esame(nameIn, year);
    }

    numStud++;
    matricola = Integer.toString(22222+numStud);
  }

  public Studente(String nameIn, int year, int no_Exams, int[] gradeIn) {
    super(nameIn, year);
    examList = new Esame[no_Exams];

    for (int i = 0; i < no_Exams; i++) {
      for (int j = 0; j < no_Exams; j++) {
        examList[i] = new Esame(nameIn, year);
        examList[i].setGrade(gradeIn[j]);
      }
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

  public int[] getGrades() {
    return examList[];
  }

  public void setGrades(int[] gradesIn) {
    if (gradesIn.length == examList[0].length) {
      for (int i = 0; i < gradesIn.length; i++) {
        examList[i] = gradesIn[i];
      }
    }
  }

  public String toString() {
    toString = super.toString() + "Matricola: " + getMatricola() + "\nVoti esami: ";
    for (int i = 0; i < examList[0].length; i++) {
      toString = "\n\n" + examList[i].toString();
    }
    return toString;
  }

  public double average() {
    for(int i = 0; i < examList.length; i++) {
      average += examList[i].getGrade();
    }
    return (average / examList[0].length);
  }

  public static void main(String[] args) {
    int i = 3;
    int[][] grades;

    Studente[] student = new Studente[i];


  }
}
