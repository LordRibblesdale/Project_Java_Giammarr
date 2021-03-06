public class Esame extends Insegnamento {
  private int grade;
  private boolean isLode;

  public Esame() {
    super();
    grade = 0;
    isLode = false;
  }

  public Esame(String nameC, int yearC) {
    super(nameC, yearC);
    grade = 0;
    isLode = false;
  }

  public Esame(String nameC, int yearC, int gradeIn) {
    super(nameC, yearC);
    grade = gradeIn;
    isLode = false;
  }

  public Esame(String nameC, int yearC, int gradeIn, boolean lode) {
    super(nameC, yearC);
    grade = gradeIn;
    isLode = lode;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int gradeIn) {
    grade = gradeIn;
  }

  public boolean getB() {
    return isLode;
  }

  public void setB(boolean bIn) {
    isLode = bIn;
  }

  public String toString() {
    return super.toString() + "\nVoto: " + getGrade() + "\nLode: " + getB();
  }

  public boolean equals(Object obj) {
    boolean isEqual = false;
    if (obj != null && obj instanceof Esame) {
      Esame other = (Esame)obj;
      isEqual = super.equals(other) && (this.grade == other.grade) && (this.isLode == other.isLode);
    }
    return isEqual;
  }

  public static void main(String[] args) {
    Esame unBroccolis = new Esame("Java", 1, 28);
    Esame dueBroccolis = new Esame("Lab", 2, 30);
    Esame treBroccolis = new Esame("TDI", 1, 30, true);
    System.out.println(unBroccolis.toString() + "\n\n" + dueBroccolis.toString() + "\n\n" + treBroccolis.toString());
  }
}
