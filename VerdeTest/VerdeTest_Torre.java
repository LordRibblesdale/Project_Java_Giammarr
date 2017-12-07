//Domenico Verde

import java.util.Scanner;

public class VerdeTest_Torre {
  public static void print(int a) {
    int max1 = 5*a, max2 = 3*a;

    for (int i = 0; i < a; i++) {
      for (int i1 = 0; i1 < 3; i1++) {
        for (int j = 0; j < a; j++) {
          System.out.print('*');
        }
        for (int j1 = 0; j1 < a; j1++) {
            System.out.print(" ");
        }
      }
      System.out.println();
    }

    for (int i = 0; i < max2; i++) {
      for (int j = 0; j < max1; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int input = 0;

    do {
      System.out.print("\nInserisci il numero per generare la torre (tra 2 e 10): ");
      input = kb.nextInt();
    } while (input < 2 || input > 10);

    print(input);
  }
}
