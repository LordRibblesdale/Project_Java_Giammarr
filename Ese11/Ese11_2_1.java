//Domenico Verde

import java.util.Scanner;

public class Ese11_2_1 {
  public static void isPerfect(long num) {
    long half = num/2, sum = 0;

    for (long count = 1; count <= half; count++) {
      if (num%count == 0) {
        sum += count; //dichiarare l'exception fuori range long
        System.out.print(count + " ");
      }
    }
    if (sum == num) {
      System.out.println("\n" + num + " e' un numero perfetto.");
    }
    else {
      System.out.println("\n" + num + " non e' un numero perfetto.");
    }
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("\nInserisci un numero (verra' controllato se e' perfetto).\nInserisci qui: ");
    long input = keyboard.nextLong();

    do {
      isPerfect(input);
      System.out.print("\n\nPuoi sempre terminare il programma inserendo l'input '0'.\nInserisci qui un altro numero: ");
      input = keyboard.nextLong();

    } while (input != 0);
  }
}
