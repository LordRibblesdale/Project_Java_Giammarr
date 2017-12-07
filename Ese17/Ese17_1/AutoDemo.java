//DOmenico Verde
import java.util.Scanner;

public class AutoDemo {
  public static void main(String[] args) {
    Automobile car1 = new Automobile();
    Scanner kb = new Scanner(System.in);
    double km = 0;
    byte marcia = 0;

    System.out.print("Quanti litri vuoi rifornire? ");
    car1.setSerbatoio(kb.nextDouble());
    System.out.println();

    do {
      System.out.print("Di quanto ti vuoi muovere (in km)? ");
      km = kb.nextDouble();

      if (km != 0) {
        car1.kmTot += km;
        System.out.print("\nCon quale marcia vuoi muoverti? (1,2) ");
        car1.setMarcia(kb.nextByte());
      }
    } while (car1.consumo(km));

    if (car1.getSerbatoio() <= 0) {
      System.out.println("\nE' finito il carburante!");
    }
    else {
      System.out.println("\nE' finito il viaggio!");
    }
  }
}
