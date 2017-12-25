public class Insegnamento {
  private int annoDiCorso;
  private String nomeCorso;

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

  public static void main(String[] args) {
    Insegnamento stm = new Insegnamento("STM", 1);
    System.out.println(stm.toString());
  }
}
