public class Insegnamento {
  private int annoDiCorso;
  private String nomeCorso;

  public Insegnamento() {
    annoDiCorso = 0;
    nomeCorso = "NaN";
  }

  public Insegnamento(String nameC, int yearC) {
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
    return nomeCorso;
  }

  public void setNome(String nameIn) {
    nomeCorso = nameIn;
  }

  public String toString() {
    return "Nome Corso: " + getNome() + "\nAnno di corso: " + annoDiCorso;
  }

  public boolean equals(Object obj) {
    boolean isEqual = false;
    if (obj != null && obj instanceof Insegnamento) {
      Insegnamento other = (Insegnamento)obj;
      isEqual = (this.nomeCorso == other.nomeCorso) && (this.annoDiCorso == other.annoDiCorso);
    }
    return isEqual;
  }

  public static void main(String[] args) {
    Insegnamento stm = new Insegnamento("STM", 1);
    System.out.println(stm.toString());
  }
}
