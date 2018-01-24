import java.util.Scanner;

public class Studente extends Persona {
  private String matricola, toString;
  private Esame[] examList;
  private int tmp;
  private double avg;
  private static int numStud = 0;

  public Studente() {
    super();
    matricola = "NaN";
    avg = 0;
  }

  public Studente(String nameIn, int year, String nameC, int yearC, int no_Exams) {
    super(nameIn, year);
    examList = new Esame[no_Exams];

    for (int i = 0; i < no_Exams; i++) {
      for (int j = 0; j < no_Exams; j++) {
        examList[i] = new Esame(nameC, yearC);
      }
    }
    numStud++;
    matricola = Integer.toString(22222+numStud);
  }

  public Studente(String nameIn, int year, String nameC, int yearC, int no_Exams, int[] gradeIn) {
    super(nameIn, year);
    examList = new Esame[no_Exams];

    for (int i = 0; i < no_Exams; i++) {
      examList[i] = new Esame(nameC, yearC);
    }
    setGrades(gradeIn);
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
    int[] gr = new int[examList.length];
    for (int i = 0; i < examList.length; i++) {
      gr[i] = examList[i].getGrade();
    }
    return gr;
  }

  public void setGrades(int[] grades) {
    if (grades.length == examList.length) {
      for (int i = 0; i < grades.length; i++) {
        examList[i].setGrade(grades[i]);
      }
    }
  }

  public String toString() {
    toString = super.toString() + "Matricola: " + getMatricola() + "\nVoti esami: ";
    for (int i = 0; i < examList.length; i++) {
      toString = "\n\n" + examList[i].toString();
    }
    return toString;
  }

  public double average() {
    avg = 0;
    for (int i = 0; i < examList.length; i++) {
      avg += examList[i].getGrade();
    }
    return (avg / examList.length);
  }

  public double average(int annoDiCorso) {
    avg = 0;
    tmp = 0;
    for (int i = 0; i < examList.length; i++) {
      if (examList[i].getAnno() == annoDiCorso) {
        avg += examList[i].getGrade();
        tmp++;
      }
    }
    return (avg / tmp);
  }

  public static void main(String[] args) {
    String name, nameC, s1;
    int year, yearC;
    int[] grades = new int[10];
    Studente[] stm = new Studente[3];
    Scanner kb = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.print("\nInserisci il nome dello studente: ");
      name = kb.nextLine();
      year = (int)Math.floor(Math.random()*118)+1900;

      for (int j = 0; j < 10; j++) {
        grades[j] = (int)Math.floor(Math.random()*30);
        System.out.print("\nInserisci il nome del corso: ");
        nameC = kb.nextLine();
        yearC = (int)Math.floor(Math.random()*3)+1;
        stm[i] = new Studente(name, year, nameC, yearC, 10, grades);
      }
    System.out.println("Media generale: " + stm[i].average());
    System.out.println("Media del secondo anno: " + stm[i].average(2));
    }
  }
}
