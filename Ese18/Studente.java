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

  public static int getNumS() {
    return numS;
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

  public int getGrades(int i) {
    return grades[i];
  }

  public void setGrades(int[] gradesIn) {
    for (int i = 0; i < gradesIn.length; i++) {
      grades[i] = gradesIn[i];
    }
  }

  public void setGrades(int value, int index) {
      grades[index] = value;
  }

  public void print() {
    System.out.println("Dati dello studente: ");
    System.out.println("- Nome: " + getName());
    System.out.println("- Matricola: " + getMatricola());

    for (int i = 0; i < grades.length; i++) {
      System.out.println("Voto " + (i+1) + ": " + grades[i]);
    }
  }

  public double average() {
    int sum = 0, index = grades.length;

    for (int i = 0; i < index; i++) {
      if (grades[i] == 0) {
        index--;
      }
      else {
        sum += grades[i];
      }
    }
    return (sum/index);
  }

  public boolean equals(Studente object) {
    if (average() == object.average()) {
      return true;
    }
    else return false;
  }
}
