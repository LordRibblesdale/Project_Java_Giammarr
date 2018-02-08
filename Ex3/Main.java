public class Main {
  public static int[] pariUguali(int[] a, int[] b) {
    int[] c = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0 && b[i] % 2 == 0) {
        c[i] = 1;
      }
      else c[i] = 0;
    }
    return c;
  }

  public static Persona fight(Alieno a, Mostro m) {
    int tmp = 0;
    int[] d = pariUguali(a.getAmmo(), m.getAssault());

    for (int i = 0; i < d.length; i++) {
      if (d[i] == 1) {
        tmp++;
      }
    }
    if (tmp >= 4) {
      for (int i = 0; i < 10; i++) {
        System.out.println(m.getBattleCry());
      }
      return m;
    }
    else {
      for (int i = 0; i < 10; i++) {
        System.out.println(m.getGemito());
      }
      return a;
    }
  }

  public static void proclamaVincitore (Persona p) {
    String d = "";
    if (p instanceof Alieno) {
      d = p.getName();
      System.out.println("Vincitore: Alieno!");
    }
    else {
      d = p.getName();
      System.out.println("Vincitore: Mostro!");
    }
    System.out.println();

    for (int i = 0; i < 20; i++) {
      System.out.print("*");
    }
    System.out.print("\n*");
    for (int i = 0; i < 18; i++) {
      System.out.print(" ");
    }
    System.out.print("*\n*");
    for (int i = 0; i < 5; i++) {
      System.out.print(" ");
    }
    System.out.print(d);
    for (int i = 0; i < 13-d.length(); i++) {
      System.out.print(" ");
    }
    System.out.print("*\n*");
    for (int i = 0; i < 18; i++) {
      System.out.print(" ");
    }
    System.out.print("*\n");
    for (int i = 0; i < 20; i++) {
      System.out.print("*");
    }
  }

  public static void main(String[] args) {
    Alieno a = new Alieno("Robot", 147);
    Mostro m = new Mostro("Grudd", "Du iu nou de wae", "Tacci de pippo");
    System.out.println(a.toString() + "\n" + m.toString());
    proclamaVincitore(fight(a, m));
  }
}
