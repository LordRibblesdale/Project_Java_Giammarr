public class Insegnamento extends Persona {
  private int annoDiCorso;
  private String nomeCorso;

  public Insegnamento(String nameIn, int year, String nameC, int yearC) {
    super(nameIn, year);
    nomeCorso = nameC;
    annoDiCorso = yearC;
  }

  public int getAnno() {
    return annoDiCorso;
  }

  public void setAnno(int yearC) {
    annoDiCorso = yearC;
  }

  public String getNome() {
    
  }
}
