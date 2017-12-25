public class Docente extends Persona {
  private Insegnamento materia1 = new Insegnamento("", 1);
  private Insegnamento materia2 = new Insegnamento("", 1);

  public Docente(String nameIn, int year, String subject1, int yearC1, String subject2, int yearC2) {
    super(nameIn, year);
    materia1.setNome(subject1);
    materia1.setAnno(yearC1);
    materia2.setNome(subject2);
    materia2.setAnno(yearC2);
  }
  //same as Insegnamento?
  public String toString() {
    return super.toString() + "Materia1: " + materia1.getNome() + "\nAnno di Corso: " + materia1.getAnno() + "\nMateria2: " + materia2.getNome() + "\nAnno di Corso: " + materia2.getAnno();
  }

  public static void main(String[] args) {
    Docente deBroccolis = new Docente("Caio De Broccolis", 2017, "Analisi", 2, "Java", 1);
    System.out.println(deBroccolis.toString());
  }
}
