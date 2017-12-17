//Domenico Verde

public class Ese18 {
  public static void main(String[] args) {
    Studente[] students = new Studente[3];
    double[] averageS;
    int data = 0;

    for (int i = 0; i < students.length; i++) {
      students[i] = new Studente();
    }

    averageS = new double[students[1].getGrades().length];

    for (int i = 0; i < students.length; i++) {
      for (int j = 0; j < students[i].getGrades().length; j++) {
        int a = (int)Math.floor(Math.random()*30)+1;
        if (a < 18) {
          students[i].grades[j] = 0;
        }
        else {
          students[i].grades[j] = ;
        }
      }
      students[i].print();
    }

    for (int i = 0; i < students.length-1; i++) {
      if (students[i+1].average() > students[i]) {
        data = i+1;
      }
    }

    System.out.println("Lo studente migliore è lo Studente" + data);
  }
}
