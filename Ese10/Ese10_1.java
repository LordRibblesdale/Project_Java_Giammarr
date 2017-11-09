//Domenico Verde

import java.util.Scanner;

public class Ese10_1 {
  public static boolean isFound = false;
  public static int res;

  public static int bruteMCD(int x, int y) {
    int mcd = 0;

    labelTest: {
      for (int x1 = x; x1 >= 1; x1--) {
        for (int y1 = y; y1 >= 1; y1--) {
          if (x%x1 == y%y1 && x1 == y1) {
            mcd = x1;
            break labelTest;
          }
        }
      }
    }
    return mcd;
  }

  public static int zeroTest(int x, int y) {
    if (x == 0) {
      isFound = true;
      res = y;
    }
    else if (y == 0) {
      isFound = true;
      res = x;
    }
    else {
      isFound = false;
    }
    return res;
  }

  public static int euclidean(int x, int y) {
    zeroTest(x, y);
    if (!isFound) {
      if (x > y) {
        int x1 = y;
        int y1 = x%y;
        if (x1 == 0) {
          res = y1;
        }
        else if (y1 == 0) {
          res = x1;
        }
        else {
          euclidean(x1, y1);
        }
      }
      else {
        int y1 = x;
        int x1 = x%y;
        if (x1 == 0) {
          res = y1;
        }
        else if (y1 == 0) {
          res = x1;
        }
        else {
          euclidean(x1, y1);
        }
      }
    }
    return res;
  }
  public static void main(String[] args) {
    int resFinal;
    boolean isFound = false;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Scrivi due valori per trovarne il MCD.");
    System.out.print("\nInserisci il primo: ");
    int input = keyboard.nextInt();
    System.out.print("\nInserisci il secondo: ");
    int input2 = keyboard.nextInt();

    System.out.println("Quale tipo di MCD vuoi eseguire?"); //TODO finire switch e controllo input
    resFinal = bruteMCD(input, input2);
    System.out.println(resFinal);

    resFinal = euclidean(input, input2);
    System.out.println(resFinal);

  }
}
