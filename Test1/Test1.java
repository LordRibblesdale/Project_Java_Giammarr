//Domenico Verde

import java.util.Scanner;

public class Test1 {
  public static void drawD(int a, char c) {
    int chars = 1, variableA = a-1, maxChars = (2*a)-3;

    System.out.println();
    for (int i = 1; i < variableA; i++, chars += 2) {
      int moreChars = 1;

      for (int space = variableA-1; space >= 0; space--) {
        System.out.print("_");
      }

      while (moreChars <= chars) {
        System.out.print(c);
        moreChars++;
      }
      System.out.println();
      variableA--;
    }
  }

  public static void main(String[] args) {
    double a = Math.random();
    int b = (int)Math.floor(a*11)+4;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("\nHere: ");
    char input = keyboard.nextLine().charAt(0);

    drawD(b, input);
  }
}
