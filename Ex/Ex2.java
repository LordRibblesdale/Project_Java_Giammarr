import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    int h, m, s, in;
    Scanner kb = new Scanner(System.in);
    Clock clk = null;

    System.out.print("\nInserire ore: ");
    h = kb.nextInt();
    System.out.print("\nInserire minuti: ");
    m = kb.nextInt();
    System.out.print("\nInserire secondi: ");
    s = kb.nextInt();

    System.out.println("Quale orologio si vuol stampare? [0-Digitale][1-Cucu']");
    do {
      System.out.print("\nHere[0-1]: ");
      in = kb.nextInt();
    } while (in > 1 || in < 0);

    switch (in) {
      case 0: {
        clk = new Digital(h, m ,s);
        break;
      }
      case 1: {
        clk = new Cucu(h, m, s);
        break;
      }
    }

    System.out.println(clk.toString());

    in = 0;
    do {
      if (in == 1) {
        System.out.print("\nQuali modifiche vuoi apportare?[0=hrs, 1=min, 2=sec]: ");
        do {
          in = kb.nextInt();
        } while (in < 0 || in > 2);

        switch (in) {
          case 0: {
            System.out.print("\nHERE[hrs]: ");
            h = kb.nextInt();
            clk.setHrs(h);
            break;
          }
          case 1: {
            System.out.print("\nHERE[mins]: ");
            m = kb.nextInt();
            clk.setMins(m);
            break;
          }
          case 2: {
            System.out.print("\nHERE[sec]: ");
            s = kb.nextInt();
            clk.setSec(s);
            break;
          }
        }
        System.out.println(clk.toString());
      }
      do {
        System.out.println("Vuoi apportare modifiche all'orologio?");
        System.out.print("\nHERE[0=N-1=Y]: ");
        in = kb.nextInt();
      } while (in < 0 || in > 1);
    } while (in != 0);
  }
}
