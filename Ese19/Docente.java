public class Docente extends Persona {
  private Insegnamento materia1 = new Insegnamento("", 1);
  private Insegnamento materia2 = new Insegnamento("", 1);

  public Docente() {
    super();
  }

  public Docente(String nameIn, int year, String subject2, int yearC2) {
    super(nameIn, year);
    setM2Nome(subject2);
    setM2Year(yearC2);
  }

  public Docente(String nameIn, int year, String subject1, int yearC1) {
    super(nameIn, year);
    setM1Nome(subject1);
    setM1Year(yearC1);
  }

  public Docente(String nameIn, int year, String subject1, int yearC1, String subject2, int yearC2) {
    super(nameIn, year);
    setM1Nome(subject1);
    setM1Year(yearC1);
    setM2Nome(subject2);
    setM2Year(yearC2);
  }

  public String getM1Nome() {
    return materia1.getNome();
  }

  public void setM1Nome(String nameIn) {
    materia1.setNome(nameIn);
  }

  public int getM1Year() {
    return materia1.getAnno();
  }

  public void setM1Year(int yearIn) {
    materia1.setAnno(yearIn);
  }

  public String getM2Nome() {
    return materia2.getNome();
  }

  public void setM2Nome(String nameIn) {
    materia2.setNome(nameIn);
  }

  public int getM2Year() {
    return materia2.getAnno();
  }

  public void setM2Year(int yearIn) {
    materia2.setAnno(yearIn);
  }

  public String toString() {
    return super.toString() + "Materia1: " + getM1Nome() + "\nAnno di Corso: " + getM1Year() + "\nMateria2: " + getM2Nome() + "\nAnno di Corso: " + getM2Year();
  }

  public static void main(String[] args) {
    Docente deBroccolis = new Docente("Caio De Broccolis", 2017, "Analisi", 2, "Java", 1);
    System.out.println(deBroccolis.toString());
  }
}
