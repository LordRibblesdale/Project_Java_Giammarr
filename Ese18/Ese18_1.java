//Domenico Verde

public class Ese18_1 {
  public static void main(String[] args) {
    Studente[] students = new Studente[10];
    double[] averagePerG;
    int data0 = 0, data1 = 0;

    for (int i = 0; i < students.length; i++) {
      students[i] = new Studente();
    }

    averagePerG = new double[students[0].getGrades().length];  //Same length for all students

    for (int i = 0; i < students.length; i++) {
      for (int j = 0; j < students[i].getGrades().length; j++) {
        int a = (int)Math.floor(Math.random()*30)+1;
        if (a < 18) {
          students[i].setGrades(0, j);
        }
        else {
          students[i].setGrades(a, j);
        }
      }
      students[i].print();
    }

    for (int i = 0; i < students.length-1; i++) {
      if (students[i+1].average() > students[i].average()) {
        data0 = i+1;
      }
    }

    for (int i = 0; i < students[0].getGrades().length; i++) {
      for (int j = 0; j < students.length; j++) {
        averagePerG[i] = students[j].getGrades(i);
      }
    }

    for (int i = 0; i < averagePerG.length-1; i++) {
      if (averagePerG[i+1] > averagePerG[i]) {
        data1 = i+1;
      }
    }

    for (int i = 0; i < students[0].getGrades().length; i++) {
      for (int j = i+1; j < students[0].getGrades().length; j++) {
        if (students[i].equals(students[j])) {
          System.out.println("Gli studenti " + i + " e " + j + " hanno la stessa media");
        }
      }
    }

    System.out.println("Lo studente migliore e' lo Studente" + data0);
    System.out.println("La materia con la media migliore: " + data1 +"°");
  }
}
