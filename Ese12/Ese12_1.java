//Domenico Verde

public class Ese12_1 {
  public static void rndNum(int[] a) {
    System.out.print("\nEcco i 30 numeri: ");

    for (int i = 0; i < a.length; i++) {
      double rnd = Math.random();
      int rnd1 = 85-5+1, rnd2 = (int)Math.floor(rnd*rnd1)+5;

      a[i] = rnd2;

      System.out.print(a[i] + " ");
    }
  }

  public static void max(int[] a) {
    int max = 0, max2 = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
        
      }
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] > max2 && max2 < max) {
        max2 = a[i];
      }
    }
    System.out.println("\n\nIl primo massimo e': " + max + ". Il secondo massimo e': " + max2);
  }

  public static boolean isEqual(int[] a) {
    boolean isEqual = false;

    for (int i = 0; i < a.length; i++) {
      for (int j = 1; j < a.length; j++) {
        if (j == 29 && i == 29) {
          isEqual = false;
        }
        else if (a[i] == a[j]) {
          isEqual = true;
        }
        else isEqual = false;
      }
    }

    return isEqual;
  }

  public static double average(int[] a) {
    double average = 0;

    for (int i = 0; i < a.length; i++) {
      average += a[i];
    }

    return average/a.length;
  }

  public static void main(String[] args) {
    int num[] = new int[30];

    System.out.println("Verranno elaborati 30 numeri casuali tra 5 e 85, ne verra' fatta una media e verranno stampati i primi due numeri massimi.");

    rndNum(num);
    max(num);
    System.out.println("La media e': " + average(num));

    if (isEqual(num)) {
      System.out.println("Ci sono duplicati nei numeri generati!");
    }
    else {
      System.out.println("Non ci sono numeri duplicati!");
    }
  }
}
