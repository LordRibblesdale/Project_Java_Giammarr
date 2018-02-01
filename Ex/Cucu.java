public class Cucu extends Clock {
  Cucu() {
    super();
  }

  Cucu(int hrs) {
    super(hrs);
  }

  Cucu(int hrs, int min) {
    super(hrs, min);
  }

  Cucu(int hrs, int min, int sec) {
    super(hrs, min, sec);
  }

  public String toString() {
    String toString = "";

    for (int i = 0; i < getHrs(); i ++) {
      toString += ("cucu\n");
    }
    return toString + "Minuti: " + getMins() + " Secondi: " + getSec();
  }
}
