//Domenico Verde

public class Ese14_1 {
  public static final int row = 30, column = 5;
  public static String[] exams = {"Analisi_1", "Programmazione_in_Java", "TDI", "Geometria", "Inglese"};

  public static void matrix(int[][] a) {
    double rnd = 0;

    for(int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        rnd = Math.random();
        a[i][j] = (int)Math.floor(rnd*30)+1;
      }
    }
  }

  public static void averageRow(int [][] a) {
    int average = 0;
    for (int i = 0; i < row; i++) {
      average = 0;

      for (int j = 0; j < column; j++) {
        average += a[i][j];
      }

      average /= column;
      System.out.println("La media dello studente " + (i+1) + " e': " + average);
    }
  }

  public static void averageColumn(int[][] a) {
    int average = 0;

    for (int j = 0; j < column; j++) {
      average = 0;

      for (int i = 0; i < row; i++) {
        average += a[i][j];
      }

      average /= row;
      System.out.println("La media dell'esame " + exams[j] + " e': " + average);
    }
  }

  public static void main(String[] args) {
    int[][] grade = new int[row][column];
    matrix(grade);

    System.out.print("Esami: ");
    for (int j = 0; j < column; j++) {
      System.out.print(exams[j] + "\t");
    }

    System.out.println();

    for (int i = 0; i < row; i++) {
      System.out.print("\t");
      for (int j = 0; j < column; j++) {
        System.out.print(grade[i][j] + "\t");
      }
      System.out.println();
    }

    averageRow(grade);
    System.out.println();
    averageColumn(grade);
  }
}
