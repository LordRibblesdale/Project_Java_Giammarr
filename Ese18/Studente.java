//Domenico Verde

public class Studente {
  private String name;
  private int matricola;
  private int[] grades = new int[5];
  private double[] gatherGrades = new double[];
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

  public void setGrades(int[] gradesIn, int start) {
    for (int i = start; i < gradesIn.length; i++) {
      grades[i] = gradesIn[i];
    }
  }

  public void print(Studente object) {
    System.out.println("Dati dello studente: ");
    System.out.println("- Nome: " + object.getName());
    System.out.println("- Matricola: " + object.getMatricola());

    for (i = 0; i < object.getGrades.length(); i++) {
      System.out.println("Voto " + i+1 + ": " + getGrades[i]);
    }
  }

  private void average()

  public void bubbleSort(double[] avg){
    boolean isSorted = true;
    int i = 0, temp = 0;

    while (i < avg.length && isSorted) {
      isSorted = false;

      for (int j = 0; j < avg.length-1; j++) {
        if (avg[j] > avg[j+1]) {
          temp = avg[j];
          avg[j+1] = avg[j];
          avg[j] = temp;
          isSorted = true;
        }
      }

      i++;
    }
  }

  public boolean equals(Studente object) {

  }
}
