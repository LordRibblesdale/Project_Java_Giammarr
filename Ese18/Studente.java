//Domenico Verde

public class Studente {
  private String name;
  private int matricola;
  private int[] grades = new int[5];
  private static int numS = 0;

  public Studente(String nameS, int matricolaS) {
    name = nameS;
    matricola = matricolaS;
    numS++;

    for (int i = 0; i < 5; i++) {
      grades[i] = 0;
    }
  }

  public Studente(String nameS) {
    name = nameS;
    numS++;
    matricola = 22222 + numS;

    for (int i = 0; i < 5; i++) {
      grades[i] = 0;
    }
  }

  public Studente() {
    name = "Studente" + numS;
    numS++;
    matricola = 22222 + numS;

    for (int i = 0; i < 5; i++) {
      grades[i] = 0;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String nameIn) {
    name = nameIn;
  }

  public int getMatricola() {
    return matricola;
  }

  public void setMatricola(int matricolaIn) {
    matricola = matricolaIn;
  }

  public int[] getGrades() {
    return grades;
  }

  public int[] getGrades(int i) {
    return grades[i];
  }

  public void setGrades(int[] gradesIn) {
    for (int i = 0; i < gradesIn.length(); i++) {
      grades[i] = gradesIn[i];
    }
  }

  public void setGrades(int[] gradesIn, int start) {
    for (int i = start; i < gradesIn.length(); i++) {
      grades[i] = gradesIn[i];
    }
  }
}
