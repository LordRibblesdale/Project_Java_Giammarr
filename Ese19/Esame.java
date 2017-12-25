public class Esame extends Insegnamento {
  private int grade;
  private boolean isLode;

  public Esame(String nameC, int yearC, int gradeIn) {
    super(nameC, yearC);
    grade = gradeIn;

    if (grade == 30) {
      isLode = true;
    }
    else isLode = false;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int gradeIn) {
    grade = gradeIn;

    if (grade == 30) {
      isLode = true;
    }
    else isLode = false;
  }

  public boolean getB() {
    return isLode;
  }

  public String toString() {
    return super.toString() + "\nVoto: " + getGrade() + "\nLode: " + getB();
  }

  public static void main(String[] args) {
    Esame unBroccolis = new Esame("Java", 1, 28);
    Esame dueBroccolis = new Esame("Lab", 2, 30);
    System.out.println(unBroccolis.toString() + "\n\n" + dueBroccolis.toString());
  }
}
