//Domenico Verde

import java.util.Scanner;

public class Test1 {
  public static void drawD(int a, char c) {
    int chars = 1, fixedA = a-1, maxChars = (2*a)-3;

    System.out.println();
    for (int i = 1; i < fixedA; i++, a--) {
      for (int space = fixedA-1; space >= 0; space--) {
        System.out.print(" ");
      }

      for (int lineCh = 1; chars <= lineCh && lineCh <= maxChars; lineCh += 2) {
        chars = 1;
        System.out.print(c);
      }
    }
  }

  public static void main(String[] args) {
    double a = Math.random();
    int num = 14-4+1, b = (int)Math.floor(a*num)+4;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("\nHere: ");
    char input = keyboard.nextLine().charAt(0);

    drawD(b, input);
  }
}
