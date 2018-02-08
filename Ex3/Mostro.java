public class Mostro extends Persona {
  private String battleCry, gemitoSconfitta;
  private int[] assault = new int[15];

  Mostro() {
    super();
    battleCry = "";
    gemitoSconfitta = "";
    for (int i = 0; i < assault.length; i++) {
      assault[i] = 0;
    }
  }

  Mostro(String nameIn, String battleCryIn, String gemitoSconfittaIn) {
    super(nameIn);
    battleCry = battleCryIn;
    gemitoSconfitta = gemitoSconfittaIn;
    vector2(assault);
  }

  public void vector2(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = (int)Math.floor(Math.random()*100)+1;
    }
  }

  public String getBattleCry() {
    return battleCry;
  }

  public void setBattleCry(String bcIn) {
    battleCry = bcIn;
  }

  public String getGemito() {
    return gemitoSconfitta;
  }

  public void setGemito(String gIn) {
    gemitoSconfitta = gIn;
  }

  public int[] getAssault() {
    return assault;
  }

  public void setAssault(int[] aIn) {
    if (aIn.length == assault.length) {
      for (int i = 0; i < assault.length; i++) {
        assault[i] = aIn[i];
      }
    }
  }

  public String toString() {
    String toString2 = "";
    for (int i = 0; i < getAssault().length; i++) {
      toString2 += assault[i] + " ";
    }
    return super.toString() + "\nAssalto: " + toString2;
  }
}
